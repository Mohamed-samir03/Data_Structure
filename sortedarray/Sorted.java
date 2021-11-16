
package sortedarray;

public class Sorted {
    
    private int [] data;
    private int nElement = 0;
    
    public Sorted(int cap){
        data = new int [cap];
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
     
    public void insert(int newVal){
        int i;
        for( i=0; i<nElement ;i++){
            if(data [i] > newVal){
                break;
            }
        }
       for(int j=nElement ; j>i ;j--){
           data [j] = data [j-1];
       } 
       data [i] = newVal;
       nElement++;
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
    
    public boolean BinarySearch(int val){
        int min=0;
        int max=nElement-1;
        int mid;
        while(true){
            mid = (min + max) / 2;
            if(data [mid] == val){
                return true;
            }else{
                if(val > data [mid]){
                    min = mid + 1;
                }else{
                    max = mid - 1;
                } 
            }
            if(min > max){
                return false;
            }
        }
    }
}
