package exercises;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Printing odd numbers");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }

        String sentence = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. I will" +
                " not eat them with a mouse.";

        String[] sentenceArray = sentence.split("\\.");
        System.out.println(Arrays.toString(sentenceArray));
    }
}
