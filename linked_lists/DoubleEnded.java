
package linked_lists;

public class DoubleEnded {
    
    private Link last;
    private Link first;
    
    public void insertlast(int data){
        Link newLink = new Link(data);
        
        if(first==null){
            first = newLink;
            last = newLink;
        }else{
            last.next =newLink;
            last=newLink;
        }
    }
    
    public int deleteFirst () {
        int old_data = first.data;
        if ( first.next == null ) 
            last = null; 
        first = first.next;
        return old_data;
    }
    
    public void displayforward(){
        Link current = first;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
