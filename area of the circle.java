import java.util.*;
 
public class areaofcircle {
    public static void main( String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the radius of circle::");
        int ra = sc.nextInt();
        double area = 3.14*(ra*ra);
        System.out.print("area of the circle given by this radius::");
        System.out.print(area);

    }
    
}
