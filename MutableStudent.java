public class MutableStudent {

    // TODO: Create two private fields:
    // 1. name (String)
    // 2. age (int)
    private String Name;
    private int Age;

    // TODO: Create a constructor that receives name and age.
    // Store the values in the object's fields.
    public MutableStudent(String n, int a){
        this.Name = n;
        this.Age = a;
    }

    // TODO: Create a getter for name.
    public String getName(){
        return Name;
    }

    // TODO: Create a getter for age.
    public int getAge(){
        return Age;
    }

    // TODO: Create a setter for name.
    // This method should CHANGE the existing object's name.
    public void setName(String n){
        this.Name = n;
    }

    // TODO: Create a setter for age.
    // This method should CHANGE the existing object's age.
    public void setAge(int a){
        this.Age = a;
    }

    // TODO: Create a displayInfo() method.
    // Display the student's name and age.
    public void displayInfo(){
        System.out.print("Name: "+getName()+"\t"+"Age: "+getAge());
    }
}
