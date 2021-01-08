package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        userInput = userInput.toLowerCase();
        char[] userInputArray = userInput.toCharArray();
        HashMap<Character, Integer> userCount = new HashMap<>();
        input.close();

        for (int i = 0; i < userInputArray.length; i++) {
            if (Character.isAlphabetic(userInputArray[i])) {
                if (!userCount.containsKey(userInputArray[i])) {
                    userCount.put(userInputArray[i], 1);
                } else {
                    userCount.put(userInputArray[i], userCount.get(userInputArray[i]) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> character : userCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

        System.out.println("---------------------------------------");

        String example = "If the product of two terms is zero then common sense says at " +
                "least one of the two terms has to be zero to start with. So if you move all " +
                "the terms over to one side, you can put the quadratics into a form that can be " +
                "factored allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";

        example = example.toUpperCase();
        char[] charArray = example.toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        // for loop over the character array
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isAlphabetic(charArray[i])) {
                if (!charCount.containsKey(charArray[i])) {
                    charCount.put(charArray[i], 1);
                } else {
                    charCount.put(charArray[i], charCount.get(charArray[i]) + 1);
                }
            }
        }

        // look at the current character
        // see if it's in hashmap
        // if it is, put a new version with a count++
        // if it isn't, put a new key with a count =
        // once that loop is done, loop over the hashmap and print to terminal
        for (Map.Entry<Character, Integer> character : charCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
