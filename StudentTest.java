public class StudentTest {

    public static void main(String[] args) {
        // PART 1: Mutable Student
        // TODO: Create a MutableStudent object.
        MutableStudent ms = new MutableStudent("John Doe", 20);

        // TODO: Display the student's original information.
        ms.displayInfo();

        System.out.println();

        // TODO: Use the setter methods to change the student's data.
        ms.setAge(21);

        // TODO: Display the student again.
        ms.displayInfo();
        // Question: Did the SAME object change?


        System.out.println();

        // PART 2: Immutable Student
        // TODO: Create an ImmutableStudent object.
        ImmutableStudent is = new ImmutableStudent("Jane Doe", 22);
        // TODO: Display the student's information.
        is.displayInfo();

        // Try to answer this in a comment:
        // Why can you not change the ImmutableStudent object using setter methods?
        // The variables are final, therefore setter methods become useless because the variables will not take in any new information.


        // PART 3: Compare
        // Add comments that answer:
        // 1. Which class is mutable?
        //The mutable class "Mutable Student" allows for the Name and/or Age to be changed.
        // 2. Which class is immutable?
        //The immutable class "Immutable Student" does not allow for any changes of the information. Any additional information can be added, but not changed.
        // 3. What is the biggest difference you noticed?
        //Immutable classes are great for creating multiple permanent items within one class, but mutable is better for items that can be updated at any point.
    }
}
