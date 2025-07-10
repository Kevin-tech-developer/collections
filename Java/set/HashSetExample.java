package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    //HashSet: eficiente para operaciones de insercion, eliminacion, y busqueda
    public static void main(String[] args) {
        retainAll();
    }

    public static void add(){
        List<Integer> numeros1 = new ArrayList<>();
        numeros1.add(1);
        numeros1.add(2);
        //creacion de un set con HashSet
        Set<Integer> numeros = new HashSet<>();
        //add: agregar ekkementos al conjunto
        numeros.add(4);
        System.out.println(numeros);
        //addAll: agregar una coleccion a un set
        numeros.addAll(numeros1);
        System.out.println(numeros1);
    }

    public static void remove(){
        List<Integer> numeros1 = new ArrayList<>();
        numeros1.add(1);
        numeros1.add(2);
        //creacion de un set con HashSet
        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3); 
        //remove(): elimina un elemento del conjunto
        numeros.remove(1);
        System.out.println(numeros);
        //removeAll(): elimina todos los elementos de este connjunto, si tambien los contiene la otra coleccion
        numeros.removeAll(numeros1);
        System.out.println(numeros);
    }

    public static void clear(){
        //creacion de un set con HashSet
        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(1);
        //clear(): elimina todos los elementos del conjunto
        numeros.clear();
        System.out.println(numeros);
    }

    public static void contains(){
        List<Integer> numeros1 = new ArrayList<>();
        numeros1.add(1);
        numeros1.add(3);
        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(1);
        numeros.add(3);
        //contains(): verifica si si esta este elemnto en el conjunto
        if(numeros.contains(1)){
            System.out.println("este conjunto si contiene este elemento");
        }
        //containsAll(): verifica si si estan los elementos de uan coleccion en este conjunto
        if(numeros.containsAll(numeros1)){
            System.out.println("este conjunto si contiene todos los elementos de esta coleccion");
        }
    }

    public static void isEmpty(){
        Set<Integer> numeros = new HashSet<>();
        //numeros.add(2);
        //numeros.add(1);
        //numeros.add(3);
        //isEmpty(): verifica si el conjunto esta vacio
        if(numeros.isEmpty()){
            System.out.println("este conjunto esta vacio");
            return;
        }
        System.out.println("este conjunto no esta vacio");
    }

    public static void size(){
        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(1);
        numeros.add(3);
        //size(): devuelve la longitud del conjunto
        System.out.println(numeros.size());
    }

    public static void iterator(){
        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(1);
        numeros.add(3);
        //se crea elIterator para rrecorrer el conjunto
        Iterator<Integer> iterator = numeros.iterator();
        //se implementa el iteratos en la ciclo while
        while (iterator.hasNext()) {
            int numero = iterator.next();
            System.out.println(numero);
        }
    }

    public static void toArray(){
        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(1);
        numeros.add(3);
        //toArray(): convierte el conjunto a un array
        Integer[] numeros1 = numeros.toArray(new Integer[0]);
        for (Integer numero : numeros1) {
            System.out.println(numero);
        }
    }

    public static void retainAll(){
        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(1);
        numeros.add(5);

        Set<Integer> numeros1 = new HashSet<>();
        numeros1.add(3);
        numeros1.add(4);
        numeros1.add(2);
        //retainAll(): conserva solo los numeros que estan en la otra coleccion oasada
        numeros.retainAll(numeros1);
        System.out.println(numeros);
    }
}
