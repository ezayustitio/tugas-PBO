package assignment_5;

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("insert word: ");
        String input=scanner.nextLine();

        TextGame game=new FancyTextGame();

        boolean result=game.isPalindrome(input);
        System.out.println("result: "+(result ? "palindrome" : "not palindrome"));

        scanner.close();
    }
}
