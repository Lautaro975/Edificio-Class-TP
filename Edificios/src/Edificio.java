public abstract class Edificio {
    //Atributos
    private int pisos;
    private double metrosCuadrados;

    ///Contructor
    public Edificio(int pisos, double metrosCuadrados) {
        this.pisos = pisos;
        this.metrosCuadrados = metrosCuadrados;
    }

    ///Metodos

    public String info() {
        return "Edificio{" +
                "pisos=" + pisos +
                ", metrosCuadrados=" + metrosCuadrados +
                '}';
    }
}
