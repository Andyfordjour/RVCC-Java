package csit105demochapter06f20;

/**
 * This class stores a person's first, last, and middle names. The class is
 * dangerous because it does not prevent operations on null reference fields.
 *
 * @author Tony Gaddis (et al)
 */

public class FullName {

    private String lastName, // To hold a last name
            firstName, // To hold a first name
            middleName; // To hold a middle name

    /* if this constructor was used, then NameTester would not crash
   public FullName()
   {
       lastName = "";
       firstName = "";
       middleName = "";
   }
     */
    /**
     * The following method sets the lastName field.
     *
     * @param str value for the lastName field
     */
    public void setLastName(String str) {
        lastName = str;
    }

    /**
     * The following method sets the firstName field.
     *
     * @param str value for the firstName field
     */
    public void setFirstName(String str) {
        firstName = str;
    }

    /**
     * The following method sets the middleName field.
     *
     * @param str value for the middleName
     */
    public void setMiddleName(String str) {
        middleName = str;
    }

    /**
     * The following method returns the length of the full name.
     *
     * @return total length of the full name
     */
    public int getLength() {
        return lastName.length() + firstName.length()
                + middleName.length();
    }

    /**
     * The following method returns the full name.
     *
     * @return a String representing the FullName object
     */
    @Override
    public String toString() {
        return firstName + " " + middleName + " "
                + lastName;
    }
}
