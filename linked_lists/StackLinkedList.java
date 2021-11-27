
package linked_lists;

public class StackLinkedList {
    
    LinkedList LinkedList = new LinkedList();
    
    public void Push(int data){
        LinkedList.insertfirst(data);
    }
    
    public int Pop(){
        return LinkedList.deletefirst();
    }
    
    public void displaystack(){
       LinkedList.displayforward();
    }
    
    public int Peak(){
        return LinkedList.first.data;
    }
    
}
