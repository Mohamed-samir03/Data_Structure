
package binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int [ ] array = { 4, 9, 16, 32, 40, 50, 60 };
      int search_key = 9;

      int min = 0;
      int max = 6;
      int mid = 0;

    while ( min<max ) {
        mid = (max + min) / 2;   
       if ( array[mid] == search_key ) { 
         System.out.println("Found at index: " + mid );
         break;
       }
        //if ( min > max ) {
          //  System.out.println("Couldn't find: " + search_key ) ;
         //   break;
      //  }
        else if ( array [ mid ] < search_key)
            min = mid + 1;
        else
            max = mid - 1;
    }
    
    }
    
}
