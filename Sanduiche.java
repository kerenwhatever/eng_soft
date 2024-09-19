public class Sanduiche {
    private String tipo;

    public Sanduiche(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Sanduíche: " + tipo;
    }
}