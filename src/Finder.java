import java.util.*;

public class Finder {
    void find(String basicWord, String phrase) {
        System.out.println("Word: " + basicWord + "\nPhrase: " + phrase);
        phrase = phrase.toUpperCase();
        String[] divided = phrase.split(" ");
        char[][] words = new char[divided.length][];
        List<Category> result = new ArrayList<Category>();
        basicWord = basicWord.toUpperCase();
        int singCounter = 0, chosenSign = 0, i = 0, maxlength = 0, counter = 0, flag=0, wordLength=0, totalLength=0;

        Set<Character> basicChars = new HashSet<Character>();
        for (char c : basicWord.toCharArray()) {
            basicChars.add(c);
        }

        for (String str : divided
        ) {
            words[i] = new char[str.length()];
            words[i] = str.toCharArray();
            i++;
        }

        for (int j = 0; j < words.length; j++) {
            if (words[j].length > maxlength)
                maxlength = words[j].length;
            counter = 0;
            flag = 0;
            wordLength=0;
            totalLength=0;
            Set<Character> setChars = new HashSet<>();
            for (int k = 0; k < words[j].length; k++) {
                if (words[j][k] >= 65 && words[j][k] <= 90) {
                    singCounter++;
                    wordLength++;
                }
                if (basicChars.contains(words[j][k]) == true) {
                    counter++;
                    chosenSign++;
                    setChars.add(words[j][k]);
                    totalLength++;
                }
            }
            Category obj = new Category(setChars, counter, wordLength, totalLength);
            if(result.isEmpty()) {
                result.add(obj);
            } else {
                for (Category cat: result
                     ) {
                    if(cat.compareTo(obj.getChars(), obj.getAmount(), obj.getWordLength())) {
                        flag = 1;
                    }
                }
                if(flag==0) result.add(obj);
            }
        }
        for (Category c: result
             ) {
            System.out.printf("{ (");
            c.outChars();
            System.out.printf("), "+ c.getWordLength()+"} = ");
            System.out.format("%.2f (%d/%d)", (float)(c.getTotalChars()*c.getRepetition())/ chosenSign, c.getTotalChars()*c.getRepetition(), chosenSign);
            System.out.printf("\n");
        }
        System.out.format("TOTAL Frequency: %.2f (%d/%d)", (float) chosenSign / singCounter, chosenSign, singCounter);
    }

}
