
package quicksort;

public class QuickSort {

    public static void main(String[] args) {
        
        Quick test=new Quick(10);
        test.insert(7);
        test.insert(1);
        test.insert(9);
        test.insert(4);
        
        test.disPlayData();
        
        test.Quicksort();
        
        test.disPlayData();
    }
}
