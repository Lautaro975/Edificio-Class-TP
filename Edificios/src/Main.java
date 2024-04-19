//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        test.agregar(new Polideportivo(2,100,"Futbol",1));
        test.agregar(new Polideportivo(3,120,"Padel,Tennis,Futbol",3));
        test.agregar(new Polideportivo(1,12,"Tennis,Futbol",2));
        test.agregar(new EdificioOficina(2,140,2));
        test.agregar(new EdificioOficina(2,140,5));

        for(Edificio ed : test.getListaEdificios()){
            System.out.println(ed.info());
        }


    }
}