
package circle;

public class Circle {

    private double radius;
    
    public Circle (){
        radius=5;
    }
    public void setradius (double r){
       radius=r;
   }
    public double getradius(){
       return radius;
   }
    public double getarea(){

       return radius * radius * 3.14;
   }
    public double getperimeter(){

       return 2 * radius * 3.14 ;
   }
   
    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        c1.setradius(7);
        System.out.println("area of circle = "+c1.getarea());
        System.out.println("perimeter of circle = "+c1.getperimeter());
        
    }
    
}
