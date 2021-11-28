
package doubly_linked_lists;

public class LinkedLists {
    
    Link first,last;
    
    public void Insertfirst(int data){
        Link newlink = new Link(data);
        
        if(first == null){
            last = newlink;
        }else{
            first.prev = newlink;
        }
        newlink.next = first;
        first = newlink;
    }
    
    public void Insertlast(int data){
        Link newlink = new Link(data);
        
        if(first == null){
            first = newlink;
        }else{
            last.next = newlink;
            newlink.prev = last;
        }
        last = newlink;
    }
    
    public int deletefirst(){
        Link temp = first;
        if(first.next == null){
            last = null;
        }else{
            first.next.prev = null;
        }
        first = first.next;
        return temp.data; 
    }
    
    public int deletelast(){
        Link temp = last;
        if(first.next == null){
            first = null;
        }else{
            last.prev.next = null;
        }
        last = last.prev;
        return temp.data; 
    }
    
    public void displayForward(){
        Link current = first;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public void displayBacward(){
        Link current = last;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
    
    boolean insertAfter ( int searchKey, int data) {
        Link current = first;
        while ( current.data != searchKey ) {
            current = current.next;
            if (current == null )
               return false;
        }
        Link newlink = new Link(data);
        if ( current == last ) // insertLAST
            last = newlink;
        else { // insert in the middle
            newlink.next = current.next;
            current.next.prev= newlink;
        }
        current.next= newlink;
        newlink.prev = current;
        return true;
    }
    
    public Link delete(int searchKey) {
        Link current = first;
        while ( current.data != searchKey ) {
            current = current.next;
            if ( current == null ) return null;
        }
        
        if ( current == first ) // current is NOT first, nor last
            first = current.next;
        else
            current.prev.next = current.next; // third case
        
        if (current == last )
            last = current.prev;
        else
            current.next.prev= current.prev; // third case
        
        return current;
}
    
}
