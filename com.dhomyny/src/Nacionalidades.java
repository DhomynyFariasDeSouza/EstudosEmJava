public enum Nacionalidades {
    ARGENTINA("Argentino"),
    BOLIVIA("Boliviano"),
    BRASIL("Brasileiro"),
    CHILE("Chileno"),
    ;
    private String descricao;
    Nacionalidades(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
