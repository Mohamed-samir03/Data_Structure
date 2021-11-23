
package quicksort;

public class Quick {
    
    private int [] data;
    private int nElement = 0;
    
    public Quick(int cap){
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
    
    public int partition(int left, int right, long pivot){
        
        int leftptr = left-1;
        int rightptr = right;
        while(true){
            while(data[++leftptr] < pivot);
            while(leftptr > 0 && data[--rightptr] > pivot);
            if(leftptr >= rightptr)
                break;
            else
                swap(leftptr , rightptr);
        }
        swap(leftptr , right);
        return leftptr;
    }
    
    public void swap(int dex1 , int dex2){
        
        long temp = data[dex1];
        data[dex1] = data[dex2];
        data[dex2] = (int) temp;
    }
    
    public void recQuickSort(int left , int right){
        
        if(right-left <= 0)
            return;
        else{
            long pivot = data[right];
            int partition = partition(left , right , pivot);
            recQuickSort(left , partition-1);
            recQuickSort(partition+1 , right);
        }
    }
    
    public void Quicksort(){
        recQuickSort( 0 , nElement-1);
    }
}
