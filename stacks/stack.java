
package stacks;

public class stack {
    
    private int maxSize;
    private int [] myStack;
    private int top;
          
    public stack(int maxSize){
        this.maxSize=maxSize;
        this.myStack=new int[maxSize];
        this.top=-1;
    }
    
    public void push(int element){
        top++;
        myStack[top]=element;
    } 
    
    public int pop(){
        int x=myStack[top];
        top--;
        return x;
    }
    
    public int peek (){
        int x=myStack[top];
        return x;
    }
    
    public boolean isempty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    
    public boolean isfull(){
        if(top==maxSize-1)
            return true;
        else
            return false;
    }
    
    public boolean iscomEmpty(){
        return top == -1;
    }
}
