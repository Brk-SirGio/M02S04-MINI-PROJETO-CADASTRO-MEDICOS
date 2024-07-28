public class Medico {
    private String nome;
    private String crm;
    private Integer idade;
    private String telefone;
    private String especialidade;

    public Medico(String nome, String crm, Integer idade, String telefone, String especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.idade = idade;
        this.telefone = telefone;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return this.crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String toString() {
        return "Medico{nome='" + this.nome + "', crm='" + this.crm + "', idade=" + this.idade + ", telefone='" + this.telefone + "', especialidade='" + this.especialidade + "'}";
    }
}
