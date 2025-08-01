import java.util.Scanner;

public class switchDemo {
    public static void main (String[] args){
        //int choice;
        /* Scanner s = new Scanner(System.in);
        System.out.println("enter a number from 1 to 7");
        int choice = s.nextInt();
       /*  if(choice == 1){
        System.out.println("its monday");
        }
        else if(choice == 2){
            System.out.println("its tuesday");
        }
        else if(choice == 3){
            System.out.println("its wednesday");
        }
        else if(choice == 4){
            System.out.println("its thursday");
        }
        else if(choice == 5){
            System.out.println("its friday");
        }
        else if(choice == 6){
            System.out.println("its saturday");
        }
        else if(choice == 7){
            System.out.println("its sunday");
        }
        else {
            System.out.println("its invalid data");
        }*/
      /* *
      /*  switch (choice){
            case 1 : System.out.println("its monday");
            break;
            case 2 :System.out.println("its tueday");
            break;
            case 3 : System.out.println("its wednesday");
            break;
            case 4 : System.out.println("its thursday");
            break;
            case 5 : System.out.println("its friday");
            break;
            case 6 : System.out.println("its saturday");
            break;
            case 7 : System.out.println("its sunday");
            break;
            default : System.err.println("its defult");
        }*/
        enum Day {monday,tuesday,wednesday,thursday,friday,saturday,sunday}
        Day day = Day.monday;
        switch (day) {
            case monday:
            System.out.println("weekday");
                
                break;
            case tuesday:
            System.out.println("weekday");
            break;
            case wednesday:
            System.out.println("weekday");
            break;
            case thursday:
            System.out.println("weekday");
            break;
            case friday:
            System.out.println("weekday");
            break;
            case saturday:
            System.out.println("weekday");
            break;
            case sunday:
            System.out.println("weekday");
            break;
        
            default:
            System.out.println("invalid data");
                break;
        }


    }
    
}
