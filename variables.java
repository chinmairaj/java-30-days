public class variables {
    int studentage=21;
    int student1age=20;
    int student2age=student1age-1;
    void display(){
        System.out.println("roll no is" + studentage);
        System.out.println("roll no is" + student1age);
        System.out.println("roll no is" + student2age);
    }
    public static void main(String[] args) {
        variables obj = new variables();
        System.out.println(obj.studentage);
        System.out.println(obj.student1age);
        obj .display();
       /*  String clever = "chinmai is clever" ;
        System.out.println(clever);*/

    }
    
}
