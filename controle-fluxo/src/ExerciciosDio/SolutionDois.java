package ExerciciosDio;

public class SolutionDois {
    public String shiftByOneCharacter(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                // Desloca 'a' até 'y' uma posição para a direita
                if (c == 'z') {
                    result.append('a');
                } else {
                    result.append((char)(c + 1));
                }
            } else if (c >= 'A' && c <= 'Z') {
                // Desloca 'A' até 'Y' uma posição para a direita
                if (c == 'Z') {
                    result.append('A');
                } else {
                    result.append((char)(c + 1));
                }
            } else {
                // Mantém caracteres que não são letras inalterados
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        SolutionDois sol = new SolutionDois();
        System.out.println(sol.shiftByOneCharacter("abc123XYz!")); // bcd123YZa!
    }
}
/*Este é o problema:

Given a string, you need to return a new string where every letter is shifted to its right by 
one place in alphabetical order. The last letters z and Z should be replaced with the first ones: a and A, respectively.
If the character isn't a letter, it should stay the same. It is not allowed to use string built-in methods here.
For example, given the string "abc123XYz!", the function should return "bcd123YZa!". 

Este é o código a ser modificado:

public class Solution {
public String shiftByOneCharacter(String s) {
//TODO: Implement the solution here
return null; 
}
} */