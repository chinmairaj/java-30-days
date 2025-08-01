import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
       /* int i = 1;
        while(i<=5){
            System.out.println(i);
            i++;
        }*/
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number between 1 to 50:");
        int num =s.nextInt();
          while(num<1 || num> 50){
            System.out.println("invalid number.\n please enter a valid number :");
            num =s.nextInt();
        }
        System.out.println("its a valid number "+num+"");


    }
    
}
