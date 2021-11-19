
package bubblesort;

public class Bubble {
    
    private int [] data;
    private int nElement = 0;
    
    public Bubble(int cap){
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
    
    public void bubblesort(){
        int temp = 0, x=0;
        for( int i = nElement - 1; i > 1; i-- ) {
            for( int j = 0; j < i; j++ ) {
                if( data[ j ] > data[ j + 1 ] ){
                    temp = data [ j ];
                    data [j] = data [ j+1 ];
                    data [ j+1 ] = temp;
                    x++;
                }   
            }    
        }
        System.out.println(x);
    }
    
    
}
