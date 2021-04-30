import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        /*System.out.println("Give me a basic word: ");
        Scanner word = new Scanner(System.in);
        String basicWord = word.nextLine();

        System.out.println("Give me a phrase: ");
        String phrase = word.nextLine();*/

        Finder func = new Finder();
        //func.find(basicWord, phrase);
        func.find("LOGIC", "I love to work in global logic!");

    }
}
