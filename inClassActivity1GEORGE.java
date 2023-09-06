
import java.util.Scanner;
public class inClassActivity1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a phrase: ");
        String phrase = scan.nextLine();
        System.out.print("What character number do you want: ");
        int chaNum = scan.nextInt();
        System.out.println("Character " + chaNum + " is " + phrase.substring(chaNum, chaNum + 1));
        System.out.println("Please enter another phrase: ");
        String phrase2 = scan.nextLine();
        System.out.println("Comparing the two strings: " + phrase2.length());
        System.out.println("Concatenating the two strings: " + phrase + phrase2);
        System.out.println("Are the strings equal(case sensitive)?: " + phrase.equals(phrase2));
        String phraseTemp = phrase;
        String phraseTemp2 = phrase2;
        phrase.toLowerCase();
        phrase2.toLowerCase();
        System.out.println("Are the strings equal(NOT case sensitive)?: " + phrase.equals(phrase2));
        System.out.println("What letter are you looking for in the first phrase: ");
        String letter = scan.nextLine();
        System.out.println(letter + " first occurs at " + phrase.indexOf(letter));
        System.out.println("What letter do you want replaced with the letter " + letter + "?: ");
        String repLetter = scan.nextLine();
        System.out.println("The new phrase is: " + phraseTemp.replace(letter,repLetter));
        System.out.println("What substring do you want (put a space in between the number): ");
        String subStr = scan.nextLine();
        int firstName = subStr.charAt(0);
        int secondName = subStr.charAt(3);
        System.out.println("Substring returned: " + phrase.substring(firstName, secondName));
        System.out.println("Starting at what number do you want to start a substring that goes to the end of the phrase: ");
        int subStr2 = scan.nextInt();
        System.out.println(phrase);
        phrase.toUpperCase();
        System.out.println(phrase);










    }
}
