import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
       /*  int arr[] = {3,6,9,12,15,10,14};//array of integers
        int count = 0;// start with count = 0
        for(int i = 0; i< arr.length; i++){
            if(arr[i]%3==0){ // check if the element is divisible by 3
            count++;// if yes , increase count by 1
            }
        }
        System.out.println(count);
        if((1<5 && 5>3)&&(2<3 && 3<7)){
            System.out.println("chinmai");
       }
        else{
            System.out.println("its not chinmai");
        }
        int h= 10;
        h += 7.5;
        h =  h - 5;
        int b = 10;
        b-= 7.5;
       ++ b;
       b++;
       b--;
     int result1 =  ++b - b++;
     int result2 = b++ - ++b;
        System.out.println(h);
       System.out.println(result1);
       System.out.println(result2);
        System.out.println(h-b );
        int q= 10;
        int p = 14;
        System.out.println("a<b =" + (p<q));
        System.out.println("a<=b =" + (p<=q));
        System.out.println("a>b =" +(p>q));
        System.out.println("a>=b =" + (p>=q));
        System.out.println("a==b =" + (p==q));
        System.out.println("a!=b =" + (p!=q));
        float cgpa = 8.0f;
        if(cgpa>7.5){
            System.out.println("you are  allowed for placement drive");
        }
        else{
            System.out.println("improve youre cgpa");
        }
        int a = 30,b = 40, c = 50;
        if((a<b) || (++c<b)) {
        System.out.println("inside if");
        }*/ 
        int age;
        boolean iscitizen;
        Scanner s = new Scanner(System.in);
        System.out.println("what is your age");
        age = s.nextInt();
        System.out.println("are you citizen of this country(true or false)?");
        iscitizen = s.nextBoolean();
        if(age>18 && iscitizen){
            System.out.println("your eligible to vote");
        } else{
            System.out.println("youre not eligible to vote");
        }
    }
}
        
    

















