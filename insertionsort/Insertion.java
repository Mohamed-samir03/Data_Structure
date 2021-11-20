
package insertionsort;

public class Insertion {
    
    private int [] data;
    private int nElement = 0;
    
    public Insertion(int cap){
        data = new int [cap];
    }
    
    public void insert(int newVal){
        data [nElement] = newVal;
        nElement++;
    }
    
    public boolean isFull(){
        return data.length == nElement;
    }
    
    public boolean isEmpty(){
        return data.length != nElement;
    }
    
    public void disPlayData(){
        for(int i=0; i<nElement ;i++){
            System.out.print(data [i] + " , ");
        }
        System.out.println();
    }
    
    public void insertionsort(){
        int x=0;
        for (int i = 0; i < nElement ; i++) {
            int current = data[ i ];
            int j = i - 1; 
            while (j >= 0 && data[ j ] >= current) {
                data[ j + 1 ] = data[ j ]; 
                j--; 
                x++;
            }
        data[j + 1] = current; 
        }
        System.out.println(x);
    }
    
    
}
