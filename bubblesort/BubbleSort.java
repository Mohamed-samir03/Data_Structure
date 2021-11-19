
package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        
        Bubble test=new Bubble(10);
        
        test.insert(-1);
        test.insert(50);
        test.insert(-43);
        test.insert(40);
        test.insert(2);
        
        test.disPlayData();
        
        System.out.print("Number of Swap : "); 
        test.bubblesort();
        
        test.disPlayData();  
    }       
}