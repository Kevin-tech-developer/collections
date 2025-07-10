package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    //LinkedHashSet: igual que HashSet pero se utiliza, cuando se
    //quiere priorizar el orden de los elementos
    //los metodos son los mismos que los de HashSet
    public static void main(String[] args) {
        sintaxis();
    }

    public static void sintaxis(){
        Set<Integer> numeros = new LinkedHashSet<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(2);
        System.out.println(numeros);
    }
}
