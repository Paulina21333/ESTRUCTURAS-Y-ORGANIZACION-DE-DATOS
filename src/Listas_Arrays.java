
import java.util.ArrayList;
import java.util.Iterator;


public class Listas_Arrays {

    public static void main(String[] args) {
        ArrayList<String> Listacompañeros = new ArrayList<>();
        System.out.println(Listacompañeros.isEmpty());
        System.out.println(Listacompañeros.size());

        Listacompañeros.add("Giovanni");
        Listacompañeros.add("Isaac");
        Listacompañeros.add("Antonio");
        Listacompañeros.add("Fernando");
        Listacompañeros.add("Alexis");
        Listacompañeros.add("Karen");
        Listacompañeros.add("Esteban");
        Listacompañeros.add("Gabi");
        Listacompañeros.add("Mane");
        Listacompañeros.add("Pau");
        Listacompañeros.add("Jesse");
        Listacompañeros.add("Fran");
        Listacompañeros.add("Adrian");
        Listacompañeros.add("Julian");
        
        
        System.out.println(Listacompañeros);
        System.out.println(Listacompañeros.size ());
        
        for (int i = 0; i < Listacompañeros.size(); i++){
            System.out.println(Listacompañeros.get(i));
        }
        Iterator i = Listacompañeros.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

}
