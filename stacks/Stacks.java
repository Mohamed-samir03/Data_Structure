
package stacks;

public class Stacks{ 
    
    public static void main(String[] args) {
        
        stack test=new stack(10);
        test.push(12);
        test.push(10);
        test.push(20);
        test.push(7);
        test.push(14);
        test.pop();
        System.out.println(test.peek()); 
        
        
        String s="Hello";
        stack test2=new stack(s.length());
        for(int i=0 ; i<s.length() ; i++){
            int ch = s.charAt(i);
            test2.push(ch);
        }
        
        while(!test2.iscomEmpty()){
            char ch = (char) test2.pop();
            System.out.print(ch);
        }
        System.out.println();
    }
}
