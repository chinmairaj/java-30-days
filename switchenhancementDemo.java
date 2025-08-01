import java.util.Scanner;

public class switchenhancementDemo {
    
         
             static String month (String month){
                return switch (month){
                    default -> "invalid data";
                    case "jan","feb","march","apr","may","june" -> "months are completed";
                    case "july","aug","sep","oct","nov","dec" -> "running months";
                };
             }
                
                
            
           // case "jan":
           // case "feb":
            //case "mar":
            //case "april":
            //case "may":
            //case "june":
            //return "completed";
           // case "july":
           // case "aug":
            //case "sep":
           // case "oct":
           // case "nov":
           // case "dec":
           // return "start working";
    
 
             public static void main(String[] args) {
                String result = month("jan");
                System.out.println(result);
       
    
   /* static int add(int a,int b){
        return a+b;

    }
       int sum =add(2,3);
        System.out.println(sum);
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number (1-12)");
        int month = s.nextInt();
      String result =  switch (month) {
            case 1:
            System.out.println("its jan");
                
                break;
                 case 2:
            System.out.println("its feb");
                
                break;
                 case 3: 
            System.out.println("its mar");
                
                break;
                 case 4:
            System.out.println("its apr");
                
                break;
                 case 5:
            System.out.println("its may");
                
                break;
                 case 6:
            System.out.println("its june");
                
                break;
                 case 7:
            System.out.println("its july");
                
                break;
                 case 8:
            System.out.println("its aug");
                
                break;
                 case 9:
            System.out.println("its sep");
                
                break;
                 case 10:
            System.out.println("its oct");
                
                break;
                 case 11:
            System.out.println("its nov");
                
                break;
                 case 12:
            System.out.println("its dec");
                
                break;
                 case 1,2,3,4,5,6 ->"completed";
                case 7,8,9,10,11,12 -> "its tym to work yaar";
                 default ->  "its invalid data was entered";
                //break;
        };
        System.out.println("it is " +result);*/
    
    
}
}