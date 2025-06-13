public class Car {
    
        String model;
        int year;
        String colour;
        void display()
        {
        System.out.println("the car model:" + model +"the car year:" + year);
        }
            
       
    
    
    
}
class Main{
    public static void main (String[] args){
        Car obj = new Car();
        obj.model = "bmw";
        obj.year = 2026;
        obj.display();

    

}

}
    
