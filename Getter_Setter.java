// Define a class;
class Employees{
    private int id;
    private String Name;

    // setter to set/update the value of id;
    public void setId(int i){
        this.id = i;
    }
    // getter to return the value of id;
    public int getId(){
        return id;
    }
    // setter to set/update the value of Name;
    public void setName(String n){
        this.Name = n;
    }
    // getter to return the value of Name;
    public String getName(){
        return Name;
    }
}

public class Getter_Setter{
    public static void main(String []args){

        Employees Details = new Employees();
        Details.setId(201);
        Details.setName("Abhishek Kumar");

        Employees Details2 = new Employees();
        Details2.setId(202);
        Details2.setName("Aman Shrivstav");

        // output;
        System.out.println("First Employee Details");
        System.out.println("Employee id : "+Details.getId());
        System.out.println("Employee Name : "+Details.getName());
        System.out.println();
        System.out.println("Second Employee Details");
        System.out.println("Employee id : "+Details2.getId());
        System.out.println("Employee Name : "+Details2.getName());
    }
}