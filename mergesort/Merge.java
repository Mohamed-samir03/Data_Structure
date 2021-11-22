
package mergesort;

public class Merge {
    
    private int [] data;
    private int nElement = 0;
    
    public Merge(int cap){
        data = new int [cap];
    }
    
    public void insert(int newVal){
        data [nElement] = newVal;
        nElement++;
    }
    
    public void disPlayData(){
        for(int i=0; i<nElement ;i++){
            System.out.print(data [i] + " , ");
        }
        System.out.println();
    }
    
    public void mergesort(){
        
        
    }
}
