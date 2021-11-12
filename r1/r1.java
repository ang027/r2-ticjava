
import java.util.Scanner;

public class r1 {

    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
        int friend1 = Integer.parseInt(sc.nextLine());
        int friend2 = ((friend1*2)+4);
        int friend3 = ((friend1 + friend2)/5);
        System.out.println(friend1 + " " + friend2 +" "+  friend3);
        if (friend3 >= 0 && friend3 <= 20)
        {
            System.out.println("Uno");
        }
        if (friend3 >= 21 && friend3 <= 30)
        {
            System.out.println("Dos");
        }
        if (friend3 >=31 && friend3 <= 50)
        {
            System.out.println("Tres");
        }
        if (friend3 > 50)
        {
            System.out.println("Cuatro");
        }
            
    
    
    }}