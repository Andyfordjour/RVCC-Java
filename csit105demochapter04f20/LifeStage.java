package csit105demochapter04f20;

/**
 * This class is to demonstrate if and boolean values
 *
 * @author Stephen Brower
 */
public class LifeStage {

    private int ageInYears;

    /**
     * constructor
     *
     * @param newAgeInYears to be used for ageInYears field
     */
    public LifeStage(int newAgeInYears) {
        ageInYears = newAgeInYears;
    }

    /**
     * the getAgeInYears method returns value from ageInYears field
     *
     * @return value from ageInYears field
     */
    public int getAgeInYears() {
        return ageInYears;
    }

    /**
     * setAgeInYears method changes the ageInYears field
     *
     * @param newAgeInYears to be used for ageInYears field
     */
    public void setAgeInYears(int newAgeInYears) {
        ageInYears = newAgeInYears;
    }

    /**
     * oldEnoughToVote method determines boolean value based on ageInYears
     *
     * @return boolean value for voting age
     */
    public boolean oldEnoughToVote() {
        boolean votingAge;

        if (ageInYears >= 18) {
            votingAge = true;
        } else {
            votingAge = false;
        }

        return votingAge;
    }

    /**
     * oldEnoughToDrink method determines boolean value based on ageInYears
     *
     * @return boolean value based on ageInYears
     */
    public boolean oldEnoughToDrink() {
        return ageInYears >= 21;
    }
}
