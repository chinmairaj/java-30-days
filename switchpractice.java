import java.util.Scanner;
public class switchpractice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number (1-7):");
    int day = s.nextInt();
    switch (day) {
       case 1 : 
         System.out.println("its monday restday");
        break;
        case 2 : System.out.println("its tusday workingday");
        break;
        case 3 : System.out.println("its wednesday midday");
        break;
        case 4 : System.out.println("its thursday leisureday");
        break;
        case 5 : System.out.println("its friday restday");
        break;
        case 6 : System.out.println("its saturday lesiureday");
        break;
        case 7 : System.out.println("its sunday restday");
        break;
        default : System.out.println("its invalid data");
        break;
    }
    s.close();
        
    
    




} 


    
}
