public class Principal {
    public static void main(String[] args) {
        // Criar os itens do combo
        Sanduiche sanduiche = new Sanduiche("Hamburguer Clássico");
        Sobremesa sobremesa = new Sobremesa("Sundae de Chocolate");
        Bebida bebida = new Bebida("Coca-Cola");

        // Criar o combo
        Combo combo = new Combo(sanduiche, sobremesa, bebida);

        // Mostrar os itens do combo
        combo.mostrarItensDoCombo();
    }
}
