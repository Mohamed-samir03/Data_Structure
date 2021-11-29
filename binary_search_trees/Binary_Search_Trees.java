
package binary_search_trees;

public class Binary_Search_Trees {

    public static void main(String[] args) {
        
        Tree mytree = new Tree();
        mytree.insert(5);
        mytree.insert(10);
        mytree.insert(3);
        mytree.insert(20);
        
        System.out.println(mytree.find(11));
        
        System.out.println("max num : " + mytree.getMax());
        System.out.println("min num : " + mytree.getMin());
        
        System.out.println("InOrder :-");
        mytree.InOrder(mytree.root);
        System.out.println("PreOrder :-");
        mytree.PreOrder(mytree.root);
        System.out.println("PostOrder :-");
        mytree.PostOrder(mytree.root);
        
        mytree.Sum(mytree.root);
        System.out.println("sum : " + mytree.sum);
    } 
    
}
