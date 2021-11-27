
package linked_lists;

public class LinkedList {
    
    public Link first;
    
    public boolean isEmpty(){
        if(first==null)
            return true;
        else
            return false;
    }
    
    public void insertfirst(int data){
        Link newLink = new Link(data);
        
        if(first==null){
            first = newLink;
        }else{
            newLink.next =first;
            first=newLink;
        }
    }
    
    public int deletefirst(){
        int data = first.data;
        first = first.next;
        return data;
    }
    
    public void displayforward(){
        Link current = first;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public boolean search(int searchKey){
        Link current = first;
        while(current != null){
            if(current.data == searchKey){
                System.out.println(searchKey + " Is Found");
                return true;
            }  
            current = current.next;
        }
        return !(current == null);
    }
    
    public boolean Delete(int searchKey){
        Link current = first , previous = first;
        while(current.data != searchKey){
            if(current.next == null)
                return false;
            previous = current;        
            current = current.next;
        }
        if(current == first)
            first = first.next;
        else
            previous.next = current.next;
        return true;
    }

}
