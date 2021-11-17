
package unsortedarray;

public class UnSortedArray {

 
    public static void main(String[] args) {
        
        UnSorted test = new UnSorted(10);
        test.insert(10);
        test.insert(5);
        test.insert(4);
        test.insert(12);
        
        System.out.println(test.linearsearch(4));
        
        test.disPlayData();
        
        System.out.println(test.deleteFirstMatch(20));
        
        test.disPlayData();
    }
    
}
