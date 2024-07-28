import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DevMedicoAplicacao {
    private List<Medico> medicos = new ArrayList();

    public DevMedicoAplicacao() {
    }

    public void executar() {
        MedicoCLI medicoCLI = new MedicoCLI();
        boolean continuar = true;

        while(continuar) {
            medicoCLI.exibirMenu();

            try {
                int opcao = medicoCLI.obterOpcao();
                Operacao operacao = Operacao.fromCodigo(opcao);
                switch (operacao) {
                    case ADICIONAR:
                        this.adicionarMedico(medicoCLI);
                        break;
                    case LISTAR:
                        this.listarMedicos();
                        break;
                    case SAIR:
                        continuar = false;
                        System.out.println("Sistema encerrado.");
                        break;
                    default:
                        System.out.println("Operação inválida.");
                }
            } catch (IllegalArgumentException var5) {
                System.out.println("Código de Operação Inválido!!!");
            }

            System.out.println("Pressione qualquer tecla para continuar...");
            medicoCLI.esperarTecla();
        }

    }

    private void adicionarMedico(MedicoCLI medicoCLI) {
        Medico medico = medicoCLI.obterDadosMedico();
        if (this.medicos.stream().anyMatch((m) -> {
            return m.getCrm().equals(medico.getCrm());
        })) {
            System.out.println("Erro: Médico com CRM duplicado.");
        } else {
            this.medicos.add(medico);
            System.out.println("Médico adicionado com sucesso.");
        }

    }

    private void listarMedicos() {
        if (this.medicos.isEmpty()) {
            System.out.println("Nenhum médico cadastrado.");
        } else {
            List var10000 = this.medicos;
            PrintStream var10001 = System.out;
            Objects.requireNonNull(var10001);
            var10000.forEach(var10001::println);
        }

    }
}
