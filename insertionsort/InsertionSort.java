
package insertionsort;

public class InsertionSort {

    public static void main(String[] args) {
        
        Insertion test = new Insertion(10);
        
        test.insert(-1);
        test.insert(50);
        test.insert(-43);
        test.insert(40);
        test.insert(2);
        
        test.disPlayData();
        
        System.out.print("Number Of copies : ");
        test.insertionsort();
        
        test.disPlayData();
    
    }
}
