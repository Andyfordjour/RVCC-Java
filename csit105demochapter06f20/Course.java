package csit105demochapter06f20;

/**
 * This class stores information about a course.
 *
 * @author Tony Gaddis (et al)
 */

public class Course {

    private String courseName;      // Name of the course
    private Instructor instructor;  // The instructor
    private TextBook textBook;      // The textbook

    /**
     * This constructor accepts arguments for the course name, instructor, and
     * textbook.
     *
     * @param name value for the name field
     * @param instr an Instructor object for the instructor field
     * @param text a TextBook object for the textBook field
     */
    public Course(String name, Instructor instr,
            TextBook text) {
        // Assign the courseName.
        courseName = name;

        // Create a new Instructor object, passing
        // instr as an argument to the copy constructor.
        instructor = new Instructor(instr);

        // Create a new TextBook object, passing
        // text as an argument to the copy constructor.
        textBook = new TextBook(text);
    }

    /**
     * getName method
     *
     * @return value from courseName field
     */
    public String getName() {
        return courseName;
    }

    /**
     * getInstructor method
     *
     * @return copy of Instructor object from instructor field
     */
    public Instructor getInstructor() {
        // Return a copy of the instructor object.
        return new Instructor(instructor);
    }

    /**
     * getTextBook method
     *
     * @return a copy of the textBook object
     */
    public TextBook getTextBook() {
        // Return a copy of the textBook object.
        return new TextBook(textBook);
    }

    /**
     * The toString method returns a string containing the course information.
     *
     * @return a String representing the Course object.
     */
    @Override
    public String toString() {
        // Create a string representing the object.
        String str = "Course name: " + courseName
                + "\n\nInstructor Information:\n"
                + instructor
                + "\n\nTextbook Information:\n"
                + textBook;

        // Return the string.
        return str;
    }
}
