package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'\n" +
                "\n";
        System.out.println("Enter the word to look for in the phrase:");
        String word = input.nextLine();
        System.out.println (phrase.toLowerCase().contains(word.toLowerCase()));
        int idx = phrase.indexOf(word);
        System.out.println("The word is at index:" +idx);
        System.out.println("The length is " +word.length());
       // String newPhrase = phrase.replace(word," ");
//        System.out.println(phrase.substring(0,idx));
//        System.out.println(phrase.substring(idx,phrase.length()));
//        String newPhrase = phrase.substring(0,idx)+phrase.substring(idx+phrase.length());
        String newPhrase = phrase.substring(0,idx)+phrase.substring(idx+word.length(),phrase.length());
        System.out.println("The new phrase is :" );
        System.out.println(newPhrase);

    }
}