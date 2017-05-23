package PracticeClass;

/**
 * Created by annaxlu on 5/23/17.
 * every int larger than 2 can be expressed as the sum of 2 primes
 */
public class Goldbach {
    public static void main(String[] args) {
        int a = 11;
        int b = 48;
        int c = 150;
        System.out.println(prime_two(a));
        System.out.println(prime_two(b));
        System.out.println(prime_two(c));
    }

    public static String prime_two(int input) {
        if (input < 2) {
            System.out.println("Please use an even integer larger than 2.");
        }
        else if (input % 2 == 0){
            System.out.println("It's even; will be continued.");
            System.out.println("One of the primes is " + checkEvenNum(input));
            System.out.println("Another primes is " + (input - checkEvenNum(input)));
        }

        else {
            System.out.println("It's odd, Please use an even integer larger than 2.");
        }

        return " ";
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int checkEvenNum (int n) {
        for (int i = 2; i <= n/2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                return i;
            }
        }
        return 0;
    }
}
