import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class LinkedListExample {
    //LinkedList: eficiente para insertar y eliminar elementos, especialemente en el medio de la lista
    //pero lenta para la busqueda de los elementos por el indice
    public static void main(String[] args) {
        iterator();
    }

    public static void add(){
        List<String> saludos = new LinkedList<>();
        //agregar elementos
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        System.out.println(saludos);
        //agregar elementos por indice
        saludos.add(1, "buenas noches");
        System.out.println(saludos);
        //agregar elementos primero
        saludos.addFirst("como vas");
        //agregar elementos de ultimo
        saludos.addLast("como estas");
        System.out.println(saludos);
    }

    public static void offer(){
        LinkedList<String> saludos = new LinkedList<>();
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        //offer(): añade como cola
        saludos.offer("hola buenas noches");
        //offerLast: añade al final como como cola doble
        saludos.offerLast("que tengas buenas noches");
        //offerFirts: añade al principio como cola doble
        saludos.offerFirst("que te valla bien");
        System.out.println(saludos);
    }

    public static void push(){
        LinkedList<String> saludos = new LinkedList<>();
        //agregar elementos
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        //push: inserta como pila al inicio
        saludos.push("buenas");
        System.out.println(saludos);
    }

    public static void remove(){
        LinkedList<String> saludos = new LinkedList<>();
        //agregar elementos
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        saludos.add("como va todo");
        saludos.add("como estas");
        saludos.add("como les fue");
        saludos.add("que les valla bien");
        saludos.add("suerte!");

        //elimina el primer elemento
        saludos.remove();
        //elimkna por el valor del indice
        saludos.remove(0);
        //elimina por primera occurrencia del elemento
        saludos.remove("buenos dias");
        System.out.println(saludos);
        //elimina el primero
        saludos.removeFirst();
        //elimina el ultimo
        saludos.removeLast();
        System.out.println(saludos);
    }

    public static void poll(){
        LinkedList<String> saludos = new LinkedList<>();
        //agregar elementos
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        saludos.add("como va todo");
        saludos.add("como estas");
        saludos.add("como les fue");
        //poll: elimina y devuelve el priemro
        saludos.poll();
        //pollFirst: elimina y devuelve el primero
        saludos.pollFirst();
        //pollLast: elimina y devuelve al ultimo
        saludos.pollLast();
        System.out.println(saludos);
    }

    public static void pop(){
        LinkedList<String> saludos = new LinkedList<>();
        //agregar elementos
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        saludos.add("como va todo");
        saludos.add("como estas");
        saludos.add("como les fue");
        //pop: elimina como pila, desde el pricipio
        saludos.pop();
        System.out.println(saludos);
    }

    public static void get(){
        LinkedList<String> saludos = new LinkedList<>();
        //agregar elementos
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        saludos.add("como va todo");
        saludos.add("como estas");
        saludos.add("como les fue");
        //get: obtine el elemento por medio del indice
        System.out.println(saludos.get(1));
        //getFirst: obtine el primero
        System.out.println(saludos.getFirst());
        //getLast: obtiene el ultimo elemento
        System.out.println(saludos.getLast());
    }

    public static void peek(){
        LinkedList<String> saludos = new LinkedList<>();
        //agregar elementos
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        saludos.add("como va todo");
        saludos.add("como estas");
        saludos.add("como les fue");
        //peek: consulta el primer elemento
        System.out.println(saludos.peek());
        //peekfirst: consulta el primer elemento
        System.out.println(saludos.peekFirst());
        //peekLast: consulta el ultimo elemento
        System.out.println(saludos.peekLast());
    }

    public static void constains(){
        LinkedList<String> saludos = new LinkedList<>();
        //agregar elementos
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        saludos.add("como va todo");
        saludos.add("como estas");
        saludos.add("como les fue");
        //contains: verificasi la lista si contiene un elemento en especifico
        if(saludos.contains("hola")){
            System.out.println("el elemnto si esta en la lista");
            return;
        }
        System.out.println("el elemento no esta en la lista");
    }

    public static void index(){
        LinkedList<String> saludos = new LinkedList<>();
        //agregar elementos
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        saludos.add("como va todo");
        saludos.add("como estas");
        saludos.add("como les fue");

        System.out.println(saludos.indexOf("como va todo"));

        System.out.println(saludos.lastIndexOf("como estas"));
    }

    public static void iterator(){
        LinkedList<String> saludos = new LinkedList<>();
        //agregar elementos
        saludos.add("hola");
        saludos.add("buenas tardes");
        saludos.add("buenos dias");
        saludos.add("como va todo");
        saludos.add("como estas");
        saludos.add("como les fue");
        //iterator: para rrecorrer la lista
        Iterator<String> iterator = saludos.iterator();
        while (iterator.hasNext()) {
            String saludo = iterator.next();
            System.out.println(saludo);
        }
        //ListIterator: para rrecorrer la lista desde una posicion en especifico
        ListIterator<String> iterator1 = saludos.listIterator(2);
        while (iterator1.hasNext()) {
            String saludo = iterator1.next();
            System.out.println(saludo);
        }
    }
}
