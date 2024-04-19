public class EdificioOficina extends Edificio {

    ///Atributos
    private int cantOficinas;

    ///Constructor
    public EdificioOficina(int pisos, double metrosCuadrados, int cantOficinas) {
        super(pisos, metrosCuadrados);
        this.cantOficinas = cantOficinas;
    }

    ///Metodos


    @Override
    public String info() {
        return "EdificioOficina{" +
                "cantOficinas=" + cantOficinas +
                '}' + super.info();
    }
}
