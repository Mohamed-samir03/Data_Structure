
package square;

public class Square {

    private double lenght;
     
     public Square (){
         lenght=1;
     }
     
     public void setlenght (double l){
      lenght=l;
   }
    public double getlenght(){
       return lenght;
   }
    public double getarea(){

       return lenght * lenght;
   }
    public double getperimeter(){

       return 4 * lenght ;
   }
    
    
    public static void main(String[] args) {
        
        Square s1 =new Square();
        s1.setlenght(2);
        System.out.println("area of square = "+s1.getarea());
        System.out.println("perimeter of square = "+s1.getperimeter());
        
    }
    
}
