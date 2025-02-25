import java.util.Scanner;

public class Main {
    static int key = 0;
    static String text = "";
    public static void main(String[] args) {

        char[] letters = {'A', 'B', 'C', 'Ç', 'D', 'E', 'F', 'G', 'Ğ', 'H', 'I', 'İ', 'J', 'K', 'L', 'M',
                'N', 'O', 'Ö', 'P', 'R', 'S', 'Ş', 'T', 'U', 'Ü', 'V', 'Y', 'Z'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Which one would you like to choose?\n1-encryption\n2-decryption");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("What would you like to encrypt?");
                String encrypt = sc.nextLine();
                System.out.println("What should the key number be for Caesar encryption?");
                key = sc.nextInt();
                sc.nextLine();
                encryptText(key, encrypt, letters);
                break;

            case 2:
                System.out.println("What would you like to decrypt?");
                String decrypt = sc.nextLine();
                System.out.println("What is your key number?");
                key = sc.nextInt();
                sc.nextLine();
                decryptText(key, decrypt, letters);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

    }

    private static void decryptText(int key, String decrypt, char[] letters) {
        for (int i = 0; i < decrypt.length(); i++) {
            char let =  Character.toUpperCase(decrypt.charAt(i));
            for (int j = 0; j < letters.length; j++) {
                if (let == letters[j]) {
                    text += letters[(j-key)% letters.length];
                }
            }

        }
        System.out.println(text);
    }

    private static void encryptText(int key, String encrypt, char[] letters) {
        for (int i = 0; i < encrypt.length(); i++) {
            char let = Character.toUpperCase(encrypt.charAt(i));
            for (int j = 0; j < letters.length; j++) {
                if (let == letters[j]) {
                    text += letters[(j + key) % letters.length];
                }
            }
        }System.out.println(text);
    }
}