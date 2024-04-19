public class Polideportivo extends Edificio implements IInstalacionDeportiva{
    ///Atributos
    private String tipoDeCancha;
    private int cantDeportes;

    ///Constructores
    public Polideportivo(int pisos, double metrosCuadrados, String tipoDeCancha, int cantDeportes) {
        super(pisos, metrosCuadrados);
        this.tipoDeCancha = tipoDeCancha;
        this.cantDeportes = cantDeportes;
    }

    ///Getters and Setters
    public String getTipoDeCancha() {
        return tipoDeCancha;
    }
    public void setTipoDeCancha(String tipoDeCancha) {
        this.tipoDeCancha = tipoDeCancha;
    }
    public int getCantDeportes() {
        return cantDeportes;
    }
    public void setCantDeportes(int cantDeportes) {
        this.cantDeportes = cantDeportes;
    }

    ///Metodos
    public int getTipoDeInstalacion(){
        return 1;
    }


    @Override
    public String info() {
        return "Polideportivo{" +
                "tipoDeCancha='" + tipoDeCancha + '\'' +
                ", cantDeportes=" + cantDeportes +
                '}' + super.info();
    }

}
