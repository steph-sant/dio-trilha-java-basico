package ExerciciosDio;
import java.util.ArrayList;
import java.util.List;

public class SolutionUm {
    public List<Integer> solutionUm(String s) {
        List<Integer> vowelPositions = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                vowelPositions.add(i);
            }
        }
        return vowelPositions;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        SolutionUm sol = new SolutionUm();
        System.out.println(sol.solutionUm("Hello divas")); // [1, 4, 7]
    }
}
/*Este é o problema:
Write a function that takes a string s, iterates through it, and collects all 0-based positions 
of vowels in it to a list.

Note that you should not use any Java built-in string methods to solve this task. 

For example, System.out.println(new Solution().solution("Hello WORLD")); should output [1, 4, 7]. 
Here, 'e' is a vowel, and its position in the string "Ho is 1. 'o' is also a vowel, and its position is 4.
The last vowel is O at position 7.

//Este é o código a ser modificado: 

import java.util.List; 
public class Solution { 
    public List<Integer> solution(String s) { 
        //TODO: implement solution 
        return null; 
    } 
} 
*/