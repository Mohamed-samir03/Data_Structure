
package doubly_linked_lists;

public class Doubly_Linked_Lists {

    public static void main(String[] args) {
        
        LinkedLists test = new LinkedLists();
        test.Insertfirst(10);
        test.Insertfirst(20);
        test.Insertfirst(30);
        test.Insertfirst(100);
        test.Insertfirst(40);
        test.Insertlast(50);
        
        test.displayForward();
        
        test.deletelast();
        
        test.displayForward();
        
        test.deletefirst();
        
        test.insertAfter(20, 11);
        
        test.delete(100);
        
        test.displayForward();
        
        test.displayBacward();
    }
    
}
