import java.util.Set;

public class Category {

    private Set<Character> chars;
    private int amount;
    private int wordLength;
    private int repetition = 1;
    private int totalChars = 0;

    public Category(Set<Character> chars, int amount, int wordLength, int totalChars) {
        this.chars = chars;
        this.amount = amount;
        this.wordLength = wordLength;
        this.totalChars = totalChars;
    }

    public Category() {
    }

    public Set<Character>getChars() {
        return chars;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWordLength() {
        return wordLength;
    }

    public int getRepetition() {
        return repetition;
    }

    public int getTotalChars() {
        return totalChars;
    }

    public void outChars() {
        for (Character ch: chars
        ) {
            System.out.printf(ch+", ");
        }
    }

    public boolean compareTo(Set<Character> otherChars, int otherAmount, int otherWordLength) {
        if (otherAmount == this.amount && otherWordLength == this.wordLength && otherChars.equals(this.chars)) {
            repetition += 1;
            return true;
        } else return false;

    }
}
