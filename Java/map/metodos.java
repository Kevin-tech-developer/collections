package map;

import java.util.HashMap;
import java.util.Map;

public class metodos {
    public static void main(String[] args) {
        retornoParValor();
    }

    public static void agregar(){
        HashMap<Integer, String> estudiantes = new HashMap<>();
        //put: agreagr elementos al map
        estudiantes.put(1, "kevin");
        estudiantes.put(2,"brayan");

        System.out.println("estudiantes: "+estudiantes);
    }

    public static void obtener(){
        HashMap<Integer, String> estudiantes = new HashMap<>();

        estudiantes.put(1, "kevin");
        estudiantes.put(2,"brayan");
        //get: obtener el value segun la key
        System.out.println(estudiantes.get(1));
    }

    public static void eliminar(){
        HashMap<Integer, String> estudiantes = new HashMap<>();

        estudiantes.put(1, "kevin");
        estudiantes.put(2,"brayan");
        //remove: elminr un elemnto en especifico
        estudiantes.remove(1);
        System.out.println("estudiantes: "+estudiantes);
    }

    public static void borrar(){
        HashMap<Integer, String> estudiantes = new HashMap<>();

        estudiantes.put(1, "kevin");
        estudiantes.put(2,"brayan");

        System.out.println("estudiantes: "+estudiantes);
        //clear: borrar todo el contenido del map
        estudiantes.clear();
        if(estudiantes.isEmpty()){
            System.out.println("map vacio");
        }else{
            System.out.println("map lleno");
        }
    }

    public static void longitud(){
        HashMap<Integer, String> estudiantes = new HashMap<>();

        estudiantes.put(1, "kevin");
        estudiantes.put(2,"brayan");
        //size: longitud de keys en el map
        System.out.println(estudiantes.size());
    }

    public static void verificacionVacio(){
        HashMap<Integer, String> estudiantes = new HashMap<>();

        estudiantes.put(1, "kevin");
        estudiantes.put(2,"brayan");
        //isEmpty: devuelve true si esta vacio
        if(estudiantes.isEmpty()){
            System.out.println("map vacio");
        }else{
            System.out.println("map lleno");
        }
    }

    public static void verificacionContiene(){
        HashMap<Integer, String> estudiantes = new HashMap<>();

        estudiantes.put(1, "kevin");
        estudiantes.put(2,"brayan");
        //containsKey: devulve true si contiene el elemnto especificado
        if(estudiantes.containsKey(1)){
            System.out.println("elemento en el map");
        }else{
            System.out.println("el elemnto no esta en el map");
        }
        //containsValue: retorna un true si contiene el value en el map
        if(estudiantes.containsValue("kevin")){
            System.out.println("el valor si esta en el map");
        }else{
            System.out.println("el valor no esta en el map");
        }
    }

    public static void retornodeKey(){
        HashMap<Integer, String> estudiantes = new HashMap<>();

        estudiantes.put(1, "kevin");
        estudiantes.put(2,"brayan");
        //keySet: retorna un set con todos los keys del map
        for(Integer indice: estudiantes.keySet()){
            System.out.println(estudiantes.get(indice));
        }
    }

    public static void retornoValue(){
        HashMap<Integer, String> estudiantes = new HashMap<>();

        estudiantes.put(1, "kevin");
        estudiantes.put(2,"brayan");
        //values: retorna una colections con todos los valores de los keys del map
        for(String valor: estudiantes.values()){
            System.out.println(valor);
        }
    }

    public static void retornoParValor(){
        HashMap<Integer, String> estudiantes = new HashMap<>();

        estudiantes.put(1, "kevin");
        estudiantes.put(2,"brayan");
        //entrySet: devuelve en un set los pares y valores
        for(Map.Entry<Integer, String> colle: estudiantes.entrySet()){
            System.out.println("nombre: "+colle.getValue());
        }
    }
}
