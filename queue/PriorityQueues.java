
package queue;

public class PriorityQueues {
    
    private int maxSize;
    private int [] myQueue;
    private int nElement;
    private int fornt;
    
    public PriorityQueues ( int size ) {
        this.maxSize = size ;
        this.myQueue = new int[ maxSize ];
        this.nElement = 0;
        this.fornt = 0;
    }
    
    public boolean isEmpty( ) {
        if ( nElement != maxSize )
            return true;
        else
            return false;
    }
    
    boolean isFull( ) {
        if ( nElement == maxSize )
            return true;
        else
            return false;
    }
    
    public int Delete() {
        int val = myQueue[fornt-1];
        fornt--;
        nElement--;
        return val;
    }  
    
    public int peek(){
        return myQueue[fornt-1]; 
    }
    
    public void insert(int newval){
        
        if(nElement == 0){
            myQueue[fornt] = newval;
            fornt++;
            nElement++;
        }else{
            int i;
            for( i=fornt ; i>=0 ; i--){
                if(newval > myQueue[i]){
                    myQueue[i+1]=myQueue[i];
                }else{
                    break;
                }
            }
            myQueue[i+1] = newval;
            fornt++;
            nElement++;
        }
    }
    
}
