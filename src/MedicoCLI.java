import java.util.Scanner;

//INTERFACE
public class MedicoCLI {
    private final Scanner scanner;

    public MedicoCLI() {
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("******** MENU ********");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Listar");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public int obterOpcao() {
        return this.scanner.nextInt();
    }

    public Medico obterDadosMedico() {
        System.out.print("Nome: ");
        String nome = this.scanner.next();
        System.out.print("CRM: ");
        String crm = this.scanner.next();
        System.out.print("Idade: ");
        int idade = this.scanner.nextInt();
        System.out.print("Telefone: ");
        String telefone = this.scanner.next();
        System.out.print("Especialidade: ");
        String especialidade = this.scanner.next();
        return new Medico(nome, crm, idade, telefone, especialidade);
    }

    public void esperarTecla() {
        try {
            System.in.read();
        } catch (Exception var2) {
            Exception e = var2;
            e.printStackTrace();
        }

    }
}
