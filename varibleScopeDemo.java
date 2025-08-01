public class varibleScopeDemo {
   int a = 10;
    int b ;
    void display(){
        
        System.out.println(b);
    }
    int d = 89;
    int c = d;
    public static void main(String[] args) {
        varibleScopeDemo obj1 = new varibleScopeDemo ();
        varibleScopeDemo obj2 = new varibleScopeDemo ();
        obj1.b = 45;
        obj2.b = 65;
      // varibleScopeDemo.a = 58;// if its static no need of any object just classname.variable
         obj1.display();
         obj2.display();
         

        
    }

    
}

    

