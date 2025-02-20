class Student{
    String Name ;
    int Age ;
    String Address;
    int Roll;

    public void printinfo () {
        System.out.println("Name : "+this.Name);
        System.out.println("Age : "+this.Age);
        System.out.println("Address : "+this.Address);
        System.out.println("Roll : "+this.Roll);
    }

}

public class Opps {
    public static void main(String[] args) {
        Student Student1 = new Student();
        Student1.Name = "Abhishek";
        Student1.Age = 20 ;
        Student1.Address = "New Delhi India";
        Student1.Roll = 25 ;

        Student Student2 = new Student();
        Student2.Name = "Aman";
        Student2.Age = 23 ;
        Student2.Address = "New Delhi India";
        Student2.Roll = 26 ;

        System.out.println("first Student Details");
        Student1.printinfo ();
        System.out.println("Second Student Details");
        Student2.printinfo();
    }
}