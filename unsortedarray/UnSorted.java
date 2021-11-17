
package unsortedarray;

public class UnSorted {
    
    private int [] data;
    private int nElement = 0;
    
    public UnSorted(int cap){
        data = new int [cap];
    }
    
    public void insert(int newVal){
        data [nElement] = newVal;
        nElement++;
    }
    
    public boolean linearsearch(int searchkey){
        for(int i=0; i<nElement; i++){
            if(data [i] == searchkey){
                return true;
            }
        }
        return false;
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
    
    public int deleteFirstMatch(int val){
        int oldVal = -1;
        int i;
        for( i=0; i<nElement; i++){
            if(data [i] == val){
                oldVal = data [i];
                break;
            }
        }
        if(i<=nElement){
            for(int j=i ; j<nElement ; j++){
               data [j] = data [j+1];
            } 
        }
        if(oldVal != -1){
            nElement--;    
        }
        return oldVal;
    }
    
}
