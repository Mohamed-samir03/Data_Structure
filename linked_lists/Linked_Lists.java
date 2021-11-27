
package linked_lists;

public class Linked_Lists {

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        System.out.println("is Empty: " +list.isEmpty());
        list.insertfirst(5);
        list.insertfirst(10);
        list.insertfirst(15);
        list.insertfirst(20);
        list.insertfirst(25);
        
        list.displayforward();
        System.out.println(list.search(25));
        System.out.println(list.deletefirst());
        System.out.println(list.search(25));
        list.Delete(10);
        list.displayforward();
        
        System.out.println("*StackLinkedList : ");
        
        StackLinkedList stack = new StackLinkedList();
        stack.Push(11);
        stack.Push(22);
        stack.Push(33);
        stack.Push(44);
        stack.displaystack();
        stack.Pop();
        stack.displaystack();
        System.out.println(stack.Peak()); 
        
        System.out.println("*QueueLinkedList : ");
        
        DoubleEnded Queue = new DoubleEnded();
        Queue.insertlast(6);
        Queue.insertlast(8);
        Queue.insertlast(12);
        Queue.insertlast(10);
        Queue.displayforward();
        System.out.println(Queue.deleteFirst());
        Queue.displayforward();
        
        
        
    }
    
}
