import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    //ArrayList: eficiente para acceder a elemntos por el indice, pero lenta para agregar o eliminar elementos
    //en la mitad de la lista
    public static void main(String[] args) {
        iterator();
    }

    public static void add(){
        //add:agregar elementos
        List<Integer> numero = new ArrayList<>();
        numero.add(4);
        numero.add(3);
        numero.add(5);
        System.out.println(numero);
        //agregar elemnto en una posicion especifica
        numero.add(1, 4);
        System.out.println(numero);
    }

    public static void get(){
        List<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        //get(): obtenr un elemento por su indice
        String dia = saludos.get(2);
        System.out.println(dia);
    }

    public static void set(){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(1);
        numeros.add(3);
        System.out.println(numeros);
        //set(): reemplaza un elemnto por medio del indice por otro elemnto especificado
        numeros.set(1, 2);
        System.out.println(numeros);
    }

    public static void remove(){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(1);
        numeros.add(3);
        //remove(): elimina el objeto que este en el indice especificado
        numeros.remove(1);
        System.out.println(numeros);

        List<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        //remove(): remueve la primera ocurrencia del objeto
        saludos.remove("hola");
        System.out.println(saludos);
    }

    public static void clear(){
        List<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        //clear(): elimina todos los elemtos de la lista
        saludos.clear();
        System.out.println(saludos);
    }

    public static void size(){
        List<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        //size(): retorna la length de la lista
        System.out.println(saludos.size());
    }

    public static void isEmpty(){
        List<String> saludos = new ArrayList<>();
        //saludos.add("hola");
        //saludos.add("buenas tardes");
        //saludos.add("buenos dias");

        if(saludos.isEmpty()){
            System.out.println("la lista esta vacia");
            return;
        }
        System.out.println(saludos);
    }

    public static void contains(){
        List<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        if(saludos.contains("hola")){
            System.out.println("el elemento si se encuentra en la lista");
            return;
        }
        System.out.println("el elemento no esta en la lista");
    }

    public static void indexOf(){
        List<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        //indexOf(): retone el indice del objeto
        System.out.println(saludos.indexOf("buenos dias"));
    }

    public static void lastIndex(){
        List<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        saludos.add("hola");
        //lastIndex(): retorna el indice del objeto en su ultima ocurrencia
        System.out.println(saludos.lastIndexOf("hola"));
    }

    public static void toArray(){
        List<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        //.toArray():convierte una lista a Array
        //new String[0]: crea un array del tamaño perfecto para la lista
        String[] array = saludos.toArray(new String[0]);
        for(String saludo: array){
            System.out.println(saludo);
        }
    }

    public static void Clone(){
        ArrayList<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        //de esta forma se copia un ArrayList
        ArrayList<String> copia = new ArrayList<>(saludos);
        System.out.println(copia);
    }

    public static void iterator(){
        ArrayList<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        //se crea el Iteratos
        Iterator<String> iterator = saludos.iterator();
        //se rrecorre con el Iterator
        while (iterator.hasNext()) {
            String saludo = iterator.next();
            System.out.println(saludo);
        }
        //elimina un elemnto con iterator
        Iterator<String> iterator2 = saludos.iterator();
        while(iterator2.hasNext()){
            String saludo = iterator2.next();
            if(saludo.equals("hola")){
                iterator2.remove();
                System.out.println("Eliminado: " + saludo);
            }
        }
        
        System.out.println("Lista después de eliminar: " + saludos);
        
    }
}

