//Create a class named Employee with fields firstname,lastname,age and designation. The class should:
// 1. have all types of constructors to initialize the object
// 2. class should also have setter methods to update a particular field
// 3. Override its toString method to display a meaningful message using all these fields.
class Employee
{
    private String firstname;
    private String lastname;
    private int age;
    private String designation;
    //Constructor without parameter
    public Employee() {
        this("Unknown", "Unknown", 0, "Undefined");
    }
    //Parametrized Constructor
    public Employee(String firstname, String lastname, int age, String designation) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.designation = designation;
    }
    //Setters
    public void setfirstname(String firstname)
    {
        this.firstname=firstname;
    }
    public void setlastname(String lastname)
    {
        this.lastname=lastname;
    }
    public void setage(int age)
    {
        this.age=age;
    }
    public void setdesignation(String designation)
    {
        this.designation=designation;
    }
    //to String Overriden to Show Employee details.
    @Override
    public String toString()
    {
        return String.format(
                "Employee Details:%nName: %s %s%nAge: %d%nDesignation: %s",
                firstname, lastname, age, designation
        );
    }
}



public class Question5 {
    public static void main(String[] args) {
      Employee e1=new Employee();
      Employee e2=new Employee("Prince","Rana",23,"Trainee");
      e1.setfirstname("Manish");
      e1.setlastname("Singh");
      e1.setage(22);
      e1.setdesignation("Trainee");
      System.out.println(e1.toString());
      System.out.println(e2.toString());
    }
}
