package csit105demochapter04f20;

/**
 * The TestGrade class determines a letter grade based on a numeric test score.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class TestGrade {

    private int score;

    /**
     * The constructor accepts an argument that is stored in the score field.
     *
     * @param newScore value for score field
     */
    public TestGrade(int newScore) {
        score = newScore;
    }

    /**
     * The setScore method accepts an argument that is stored in the score
     * field.
     *
     * @param newScore value for score field
     */
    public void SetScore(int newScore) {
        score = newScore;
    }

    /**
     * The getScore method returns the score field.
     *
     * @return value from score field
     */
    public int getScore() {
        return score;
    }

    /**
     * The getLetterGrade method determines and returns the letter grade.
     *
     * @return letter grade equivalent of score field
     */
    public char getLetterGrade() {
        char grade;

        if (score < 0) {
            grade = '?';   // Invalid score
        } else if (score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        return grade;
    }
}
