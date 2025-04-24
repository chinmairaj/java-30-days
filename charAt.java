public class charAt {
    public static void main(String[] args) {
        
    
        /*  String s = "chinmai";
         String ans = "";
       /*  System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(4));
        System.out.println(s.charAt(5));
        System.out.println(s.charAt(6));*/
        /*  System.out.print(s.charAt(i));
        for(int i=s.length() -1; i>=0;i--){
           ans= ans + s.charAt(i);

        }
        System.out.println(ans);
        if(ans.equals(s)){
            System.out.println("yes macha,its  palindrome");
        }
        else{
            System.out.println("yes macha,its not  palindrome");
        }*/
        boolean palindrome = true;
        String s = "anna" ;
        int n = s.length();
        for(int i=0; i<n/2; i++){
               // System.out.println(i);
                if(s.charAt(i)!=s.charAt(n-i-1)){
                    palindrome = false;
                }
             }
                if(palindrome){
                        System.out.println("yes");
                }
                else{
                    System.out.println("no");
                
        }

        }
        
    }
    

