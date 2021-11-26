
package queue;

public class Queue {

    public static void main(String[] args) {
        
        //queuee test
        System.out.println("queue test : ");
        queuee test=new queuee(10);
        test.Enqueue(26);
        test.Enqueue(14);
        test.Enqueue(28);
        test.Enqueue(20);
        test.Enqueue(10);
        test.Enqueue(8);
        
        System.out.println(test.Dequeue());
        System.out.println(test.Peek());
        
        //PriorityQueues test
        System.out.println("PriorityQueues test : ");
        PriorityQueues test2=new PriorityQueues(10);
        test2.insert(12);
        test2.insert(5);
        test2.insert(10);
        test2.insert(17);
        
        System.out.println(test2.peek());
        System.out.println(test2.Delete());
        System.out.println(test2.peek());
    }
    
}
