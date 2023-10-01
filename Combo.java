class Combo {
    private Sanduiche sanduiche;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public Combo(Sanduiche sanduiche, Sobremesa sobremesa, Bebida bebida) {
        this.sanduiche = sanduiche;
        this.sobremesa = sobremesa;
        this.bebida = bebida;
    }

    public void mostrarItensDoCombo() {
        System.out.println("Combo inclui:");
        System.out.println("Sanduiche: " + sanduiche.getNome());
        System.out.println("Sobremesa: " + sobremesa.getNome());
        System.out.println("Bebida: " + bebida.getNome());
    }
}

