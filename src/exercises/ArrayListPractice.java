package exercises;

import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        ArrayList<String> words = new ArrayList<>();

        words.add("hello");
        words.add("james");
        words.add("how");
        words.add("are");
        words.add("you");
        words.add("doing");

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == 5) {
                System.out.println(words.get(i));
            }
        }


    }
}
