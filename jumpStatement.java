public class jumpStatement {
    public static void main(String[] args) {
        for(int i = 1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
        /*int number = 7;
        outer:
        if(number>0){
            System.out.println("number is positive");
            if(number % 2 ==0){
                System.out.println("number is even");
            }
            else{
                System.out.println("number is odd");
                break outer;
            }
            System.out.println("this will print if the number is even");
        }
        System.out.println("this is outside the labeled block");*/
        
    }
    
}
