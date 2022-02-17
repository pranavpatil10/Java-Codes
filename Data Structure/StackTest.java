import java.util.*;                                                  //Last in first out 
class StackTest{
    public static void main(String args[]){
        LinkedList<Integer> stack =new LinkedList<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("\nstack :"+stack);
        System.out.println("\nElements on stack top :"+stack.peek());       //only displays the element
        System.out.println("\nstack :"+stack);
        System.out.println("\nElements on stack top :"+stack.pop());         //delete the element
        System.out.println("\nstack :"+stack);
        System.out.println("\nSize :"+stack.size());

        if(stack.contains(10))
            System.out.println("\nElement Found");
        else
        System.out.println("\nElement Not found");
            


    }
}