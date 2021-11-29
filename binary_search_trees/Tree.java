
package binary_search_trees;

public class Tree {
    
    Node root;
    
    public void insert(int data){
        Node newNode = new Node(data);
        
        if(root == null){
            root = newNode;
        }else{
            Node current = root;
            Node parent;
            while(true){
                parent = current;
                if(data > current.data){
                    current = current.rightchild;
                    if(current == null){
                        parent.rightchild = newNode;
                        return;
                    }
                }else{
                    current = current.leftchild;
                    if(current == null){
                        parent.leftchild = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    public boolean find(int searchKey){
        Node current = root;
        while(current.data != searchKey){
            if(searchKey > current.data){
                current = current.rightchild;
            }else{
                current = current.leftchild;
            }
            
            if(current == null){ //not found
                return false;
            }
        }
        
        return true;
    }
    
    public int getMax(){
        Node current = root;
        
        while(current.rightchild != null){
            current = current.rightchild;
        }
        
        return current.data;
    }
    
    public int getMin(){
        Node current = root;
        
        while(current.leftchild != null){
            current = current.leftchild;
        }
        
        return current.data;
    }
    
    public void InOrder(Node localroot){
        if(localroot != null){
            InOrder(localroot.leftchild);
            System.out.println(localroot.data);
            InOrder(localroot.rightchild);
        }
    }
    
    public void PreOrder(Node localroot){
        if(localroot != null){
            System.out.println(localroot.data);
            InOrder(localroot.leftchild);
            InOrder(localroot.rightchild);
        }
    }
    
    public void PostOrder(Node localroot){
        if(localroot != null){
            InOrder(localroot.leftchild);
            InOrder(localroot.rightchild);
            System.out.println(localroot.data);
        }
    }
    
    int sum=0;
    public void Sum(Node localroot){
        if(localroot != null){
            sum +=localroot.data;
            Sum(localroot.leftchild);
            Sum(localroot.rightchild);
        }
    }
    
}
