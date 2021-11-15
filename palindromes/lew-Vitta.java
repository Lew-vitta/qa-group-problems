package Palindrome;

import java.util.ArrayList;
import java.util.List;

public class palindrome {
    // Takes a list of words in, and returns a list of palindromes contained within the list of words.
    public List palindromeFinder(List words){
        // create array list we will return
        List<String> palindromes = new ArrayList<>();

        // for each (words) in the list of words
        for (Object word : words) {
            // assign the word to temporary string, and specify it as a (String) not object
            String manipulator = (String) word;
            StringBuilder backwards = new StringBuilder();

            System.out.println(manipulator);
            // for each letter in the word i/manipulator (back-to-front), append the letter to String backwards
            for (int j = manipulator.length() - 1; j >= 0; j--) {
                backwards.append(manipulator.charAt(j));
                // take the substring of the backwards word at each point, if it's not equal to a substring of the actual word as we go along
                // then we know it will never be a palindrome
                if(!manipulator.substring(0, backwards.length()).equals(backwards.toString())) {
                    break;
                }
            }
            // if backwards == manipulator, we know it's a palindrome thus add it the palindrome list
            if (backwards.toString().equals(manipulator)) {
                palindromes.add(backwards.toString());
            }
        }
    return palindromes;
    }
}

