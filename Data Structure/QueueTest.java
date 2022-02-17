import java.util.*;                                        //First in First out
public class QueueTest{
    public static void main(String args[]){
        LinkedList<String> q = new LinkedList<String>();

        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        q.add("E");

        System.out.println("\nElements: "+q);

        System.out.println("\nRemoved :"+q.remove());
        System.out.println("\nHead :"+q.element());
        System.out.println("\nElements in queue:"+q);


    }
}