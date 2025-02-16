import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int prime = sc.nextInt();
        boolean isPrime=true;
        if(prime==1) System.out.println(prime+" is not prime");
        else for(int i=2; i< prime; i++ ) if(prime%i==0) isPrime=false;
        System.out.println(isPrime ? prime+" is prime" : prime+" is not prime");
    }
}
