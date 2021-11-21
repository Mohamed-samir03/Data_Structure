
package shellsort;

public class Shell {
    
    private int [] data;
    private int nElement = 0;
    
    public Shell(int cap){
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
    
    public void ShellSort(){
        int h=1;
        
        while(h <= nElement/3)
            h=h*3+1;
        
        while(h>0){
            for(int i=h ; i<nElement ; i++){
                int temp = data[i];
                int inner = i;
                while(inner>h-1 && data[inner-h]>=temp){
                    data[inner]=data[inner-h];
                    inner-=h;
                }
                data[inner] = temp;
            }
            h=(h-1)/3;
        }
    }
}
