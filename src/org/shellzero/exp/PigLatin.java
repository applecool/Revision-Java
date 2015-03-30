package org.shellzero.exp;

import java.util.Scanner;
public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final String vowels = "aeiouAEIOU";
        System.out.println("Enter your word.");
        String word = sc.nextLine();
        while (!word.equalsIgnoreCase("done"))
        {
            String beforeVowel = "";
            int cut = 0;
            while (cut < word.length() && !vowels.contains("" + word.charAt(cut)))
            {
                beforeVowel += word.charAt(cut);
                cut++;
            }
            if (cut == 0)
            {
                cut = 1;
                word += word.charAt(0) + "w";
            }
            System.out.println(word.substring(cut) + beforeVowel + "ay");
            System.out.println("Enter your word.");
            word = sc.nextLine();
        }
    }
}