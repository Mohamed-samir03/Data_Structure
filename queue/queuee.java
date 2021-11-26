
package queue;

public class queuee {
    
    private int maxSize;
    private int [] myQueue;
    private int front, rear, nElement;
    
    public queuee ( int size ) {
        this.maxSize = size ;
        this.myQueue = new int[ maxSize ];
        this.front = 0;
        this.rear = -1;
        this.nElement = 0;
    }
    
    public void Enqueue( int elm ) {
        if ( rear == maxSize - 1 )
            rear = -1 ;
        rear++;
        myQueue[ rear ] = elm;
        nElement++;
    }
    
    public int Dequeue( ) {
        int elm = myQueue[ front ];
        front++;
        if ( front == maxSize)
            front = 0 ;
        nElement--;
        return elm;
    }
    
    public int Peek( ) {
        int elm = myQueue[ front ];
        return elm;
    }
    
    public boolean isEmpty( ) {
        if ( nElement == 0 )
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
}
