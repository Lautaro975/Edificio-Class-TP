import java.util.ArrayList;

public class Test {
    ///Atributos
    ArrayList<Edificio> listaEdificios;

    ///Constructor
    public Test() {
        this.listaEdificios = new ArrayList<>();
    }

    ///Getters
    public ArrayList<Edificio> getListaEdificios() {
        return listaEdificios;
    }

    ///Metodos
    public void agregar(Edificio ed){
        listaEdificios.add(ed);
    }

}
