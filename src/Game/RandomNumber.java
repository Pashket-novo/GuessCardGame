/**
 * RandomNumber Class generate a random number from 1 to a maximum value specified
 *
 * @author Pavel Zemnukhov
 * @version 1.0 08-May-2020
 */

package Game;

public class RandomNumber {
    private int randomNumber;

    public RandomNumber(int maxRandomNumber) {
        this.randomNumber = maxRandomNumber;
    }

    public int generateRandomNumber() {
        int newRandom = 1 + (int)(Math.random() * (double)this.randomNumber);
        return newRandom;
    }
}
