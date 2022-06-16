/**
 * Class Player specify the attributes and behaviours of a player.
 *
 * @author Pavel Zemnukhov
 * @version 1.0 08-May-2020
 */

package Game;

public class Player {
    private String name;
    private int score;
    private int guess;
    private int highestScore;
    private int numberOfGamesPlayed;
    private int numberOfGamesWon;

    public Player() {
        this.name = "";
        this.score = 0;
        this.guess = 0;
        this.highestScore = 0;
        this.numberOfGamesPlayed = 0;
        this.numberOfGamesWon = 0;
    }

    public Player(String playerName) {
        this.name = playerName;
    }

    public void deductPoint(int pointToBeDeducted) {
        this.score -= pointToBeDeducted;
    }

    public String displayPlayer() {
        String playerState = "name " + this.name + " score " + this.score + " guess " + this.guess + " highestScore " + this.highestScore + " numberOfGamesPlayed " + this.numberOfGamesPlayed + " numberOfGamesWon " + this.numberOfGamesWon;
        return playerState;
    }

    public int getGuess() {
        return this.guess;
    }

    public int getHighestScore() {
        return this.highestScore;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfGamesPlayed() {
        return this.numberOfGamesPlayed;
    }

    public int getNumberOfGamesWon() {
        return this.numberOfGamesWon;
    }

    public int getScore() {
        return this.score;
    }

    public void setGuess(int newGuess) {
        this.guess = newGuess;
    }

    public void setHighestScore(int newHighestScore) {
        this.highestScore = newHighestScore;
    }

    public void setName(String playerName) {
        this.name = playerName;
    }

    public void setNumberOfGamesPlayed(int newNumberOfGamesPlayed) {
        this.numberOfGamesPlayed = newNumberOfGamesPlayed;
    }

    public void setNumberOfGamesWon(int newNumberOfGamesWon) {
        this.numberOfGamesWon = newNumberOfGamesWon;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }
}
