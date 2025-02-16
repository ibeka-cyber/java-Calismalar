import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char let = Character.toLowerCase(sc.next().charAt(0));
        String backVowels = "aouı", frontVowels = "eöüi";

        System.out.println(let + (backVowels.indexOf(let) != -1 ? " is a back vowel" :
                frontVowels.indexOf(let) != -1 ? " is a front vowel" :
                        " is a consonant"));
    }
}
