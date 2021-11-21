    
package shellsort;

public class ShellSort {

    public static void main(String[] args) {
        
        Shell test=new Shell(10);
        test.insert(7);
        test.insert(1);
        test.insert(9);
        test.insert(4);
        
        test.disPlayData();
        
        test.ShellSort();
        
        test.disPlayData();
    }    
}
