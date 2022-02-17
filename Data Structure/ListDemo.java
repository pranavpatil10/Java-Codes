import java.util.*;
public class ListDemo{
    public static void main(String args[]){
        LinkedList<String>object=new LinkedList<String>();

        object.add("A");
        object.add("B");
        object.add("C");
        object.add("D");

        object.addLast("E");
        object.addFirst("F");
        object.add(2,"G");

        System.out.println(("Linked list : ")+object);

        object.remove("B");
        object.remove(3);
        object.removeFirst();
        object.removeLast();

        System.out.println(("\nLinked list after deletion:")+object);
        boolean status =object.contains("E");

        if(status)
            System.out.println("\n'E' Present");
        else
            System.out.println("\n'E'Absent");

        int size = object.size();
        System.out.println("\nsize of the linked list="+size);
        System.out.println("\nElement @ 2nd :"+object.get(2));






    }
}