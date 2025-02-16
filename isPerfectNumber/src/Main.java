//Mükemmel sayı: bölenlerinin toplamı kendisine eşit olan sayıdır.
//6 -->1,2,3
//28 -->1,2,4,7,14
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(),sum=0;
        for (int i = 1; i < number; i++) {if (number % i == 0) sum += i;}
        System.out.printf (sum == number ? "Yes,number is a perfect number":
            "No,number is not a perfect number");
    }
}