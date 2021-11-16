
package sortedarray;

public class SortedArray {

    public static void main(String[] args) {
        
        Sorted test=new Sorted(10);
        test.insert(7);
        test.insert(1);
        test.insert(9);
        test.insert(4);
        
        test.disPlayData();
        
        System.out.println(test.deleteFirstMatch(4));
        
        test.disPlayData();
        
        System.out.println(test.BinarySearch(1));
    }
    
}
