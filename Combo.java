public class Combo {
    private Sanduiche sanduiche;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void CriarCombo(int tipo) {
        switch (tipo) {
            case 1:
                sanduiche = new Sanduiche("Cheeseburger");
                sobremesa = new Sobremesa("Sorvete");
                bebida = new Bebida("Refrigerante");
                break;
            case 2:
                sanduiche = new Sanduiche("Double Cheeseburger");
                sobremesa = new Sobremesa("Brownie");
                bebida = new Bebida("Suco");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    @Override
    public String toString() {
        if (sanduiche == null || sobremesa == null || bebida == null) {
            return "Nenhum combo foi selecionado.";
        }
        return "Itens do Combo:\n" + sanduiche + "\n" + sobremesa + "\n" + bebida;
    }
}