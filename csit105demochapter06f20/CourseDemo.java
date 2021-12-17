package csit105demochapter06f20;

/**
 * This program demonstrates the Course class.
 *
 * @author Tony Gaddis (et al)
 */

public class CourseDemo {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an Instructor object.
        Instructor myInstructor
                = new Instructor("Brower", "Stephen", "West 324(but now Zoom)");

        // Create a TextBook object.
        TextBook myTextBook
                = new TextBook("Starting Out with Java",
                        "Gaddis", "Pearson");

        // Create a Course object.
        Course myCourse
                = new Course("CSIT 105 - Foundations of Comp. Sci.", myInstructor,
                        myTextBook);

        // Display the course information.
        System.out.println(myCourse);
    }
}
