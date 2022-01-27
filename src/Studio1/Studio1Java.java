package Studio1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Studio1Java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine().toLowerCase();
//            String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
//                    " Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> letterCount = new HashMap<>();
        char[] charactersInString = str.toCharArray();
        for (char character : charactersInString) {
//                if((Character.codePointAt(charactersInString,character)>98) || (Character.codePointAt(charactersInString,character)<122)) {

            if (letterCount.containsKey(character)) {
                letterCount.replace(character, letterCount.get(character) + 1);
            } else {
                letterCount.put(character, 1);
            }

        }
        letterCount.forEach((key, value) -> System.out.println(key + "=" + value));
//            }for(HashMap<Character,Integer> element:letterCount){
//                System.out.println(element);

    }
}


