package set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        poll();
    }

    public static void add(){
        Set<Integer> numeros = new TreeSet<>();
        //add: agregar elementos al conjunto
        numeros.add(1);
        numeros.add(4);
        numeros.add(8);
        System.out.println(numeros);

        Set<Integer> numeros2 = new TreeSet<>();
        numeros2.add(2);
        numeros2.add(9);
        //removeAll: agregar elementos que esten en una coleccion guardada
        numeros.addAll(numeros2);
        System.out.println(numeros);
    }

    public static void remove(){
        Set<Integer> numeros = new TreeSet<>();
        //add: agregar elementos al conjunto
        numeros.add(1);
        numeros.add(4);
        numeros.add(8);
        //remove(): aliminar un elemento del conjunto
        numeros.remove(1);
        Set<Integer> numeros2 = new TreeSet<>();
        //add: agregar elementos al conjunto
        numeros2.add(3);
        numeros2.add(4);
        numeros2.add(9);
        //removeAll(): elimina los elemntos de un conjunto si la otra coleccion tambien los contiene
        numeros.removeAll(numeros2);
        System.out.println(numeros);
    }

    public static void retainAll(){
        Set<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(4);
        numeros.add(8);
        Set<Integer> numeros2 = new TreeSet<>();
        numeros2.add(3);
        numeros2.add(4);
        numeros2.add(9);
        //deja solo los que esten e n la lista dada
        numeros.retainAll(numeros2);
        System.out.println(numeros);
    }

    public static void claer(){
        Set<Integer> numeros = new TreeSet<>();
        //add: agregar elementos al conjunto
        numeros.add(1);
        numeros.add(4);
        numeros.add(8);
        //clear: elimina todo los elementos de un conjunto
        numeros.clear();
        System.out.println(numeros);
    }

    public static void contains(){
        Set<Integer> numeros = new TreeSet<>();
        //add: agregar elementos al conjunto
        numeros.add(1);
        numeros.add(4);
        numeros.add(8);
        //contaains: verfica si un elemento si se encuentra en el conjunto
        if(numeros.contains(1)){
            System.out.println("si se encuentra este elemento");
            return;
        }
        System.out.println("este elemento no esta en el conjunto");
    }

    public static void isEmpty(){
        Set<Integer> numeros = new TreeSet<>();
        //add: agregar elementos al conjunto
        //numeros.add(1);
        //numeros.add(4);
        //numeros.add(8);
        //isEmpty: veririfica si el conunto esta vacio
        if(numeros.isEmpty()){
            System.out.println("el conjunto no tiene elementos");
            return;
        }
        System.out.println("el conjuneto si tiene elementos");
    }

    public static void size(){
        Set<Integer> numeros = new TreeSet<>();
        //add: agregar elementos al conjunto
        numeros.add(1);
        numeros.add(4);
        numeros.add(8);
        //size(): devuelve la longitud del conjunto
        System.out.println(numeros.size());
    }

    public static void iterator(){
        Set<Integer> numeros = new TreeSet<>();
        //add: agregar elementos al conjunto
        numeros.add(1);
        numeros.add(4);
        numeros.add(8);
        //se crea el iterator
        Iterator<Integer> iterator = numeros.iterator();
        //se implementa el iterator para recorrer el conjunto
        while(iterator.hasNext()){
            int numero = iterator.next();
            System.out.println(numero);
        }
    }

    public static void descendingIterator(){
        TreeSet<Integer> numeros = new TreeSet<>();
        //add: agregar elementos al conjunto
        numeros.add(1);
        numeros.add(9);
        numeros.add(8);
        //se crea el iterador pero de tipo decendingIterato
        //este rrecorre el conjunto de forma inversa
        Iterator<Integer> iterator = numeros.descendingIterator();
        while(iterator.hasNext()){
            int numero = iterator.next();
            System.out.println(numero);
        }
    }

    public static void firstLast(){
        TreeSet<Integer> numeros = new TreeSet<>();
        //add: agregar elementos al conjunto
        numeros.add(1);
        numeros.add(4);
        numeros.add(8);
        //first(): devuelve el primero del conjunto ordenado
        //last(): devuleve el ultimo del conjunto ordenado
        System.out.println("primero de conjunto: "+numeros.first());
        System.out.println("ultimo del conjunto: "+numeros.last());
    }

    public static void poll(){
        TreeSet<Integer> numeros = new TreeSet<>();
        //add: agregar elementos al conjunto
        numeros.add(1);
        numeros.add(4);
        numeros.add(8);
        //pollFirst(): devuelve y elimina el primer elemento del conjunto ordenado
        //ppollLast(): elimina y evuleve el ultimo elemento del conjunto ordenado
        System.out.println("primer numero del conjunto eliminado: "+numeros.pollFirst());
        System.out.println("ultimo numero del conjunto eliminado: "+numeros.pollLast());
        System.out.println(numeros);
    }

    public static void Return(){
        TreeSet<Integer> numeros = new TreeSet<>();
        //add: agregar elementos al conjunto
        numeros.add(1);
        numeros.add(4);
        numeros.add(8);
        numeros.add(5);
        numeros.add(9);
        numeros.add(2);
        numeros.add(3);
        //ceiling(): deculve el numero mayor o igual segun el que se le aya pasado
        System.out.println("el elemento mayor siguiente o igual que el que se le pasa: "+numeros.ceiling(8));
        //floor(): devuelve el numero menior o igula segun el que se le aya pasado
        System.out.println("el elemto menor siguiente o igual que el se le pasa: "+numeros.floor(8));
        //higher(): devulve el numero mayor siguiente segun el que se le aya pasado
        System.out.println("el mayor elemeto siguiente que el que se le pasa: "+numeros.higher(1));
        //lower(): devuleve el siguiente menor numero segun el que se le aya pasado
        System.out.println("el menor elemento siguiente que el se le pasa: "+numeros.lower(4));
        //headSet(): devuelve los elementos menores segun el valor que se le aya pasado
        System.out.println("los elementos menores segun el valos que se le pase: "+numeros.headSet(9));
        //tailSet(): devuelve los elemetos mayores oiguales segun el que se le aya pasado
        System.out.println("los elemntos mayores o iguales segun el valor que se le pase: "+numeros.tailSet(5));
        //subSet(): devuelve los elemtos que este dentro de los parametros que se le aya padado
        System.out.println("los elemtos dentro de un parametro: "+numeros.subSet(5, 9));
    }
}

