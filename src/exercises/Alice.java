package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Hello, World");

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Hello, " + name);
        */

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.print("Enter a word or phrase to be searched: ");
        String term = input.nextLine();
        term = term.toLowerCase();

        if (sentence.toLowerCase().contains(term)) {
            System.out.println(term + " was found in the sentence.");
            int index = sentence.toLowerCase().indexOf(term);
            System.out.println("The index of " + term + " is " + index + ". It's length is " + term.length());
            String newSentence = sentence.substring(0, index) + sentence.substring(index + term.length() + 1, sentence.length());
            System.out.println(newSentence);
        } else {
            System.out.println(term + " was not found in the sentence.");
        }




    }
}
