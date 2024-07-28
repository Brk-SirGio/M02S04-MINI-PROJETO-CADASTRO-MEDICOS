public enum Operacao {
    ADICIONAR(1),
    LISTAR(2),
    SAIR(3);

    private final int codigo;

    private Operacao(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public static Operacao fromCodigo(int codigo) {
        Operacao[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Operacao operacao = var1[var3];
            if (operacao.getCodigo() == codigo) {
                return operacao;
            }
        }

        throw new IllegalArgumentException("Código de operação inválido: " + codigo);
    }
}
