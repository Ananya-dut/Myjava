import java.util.*;
public class multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the first fraction
        System.out.print("Enter the numerator of the first fraction: ");
        int numerator1 = input.nextInt();
        System.out.print("Enter the denominator of the first fraction: ");
        int denominator1 = input.nextInt();

        // Input the second fraction
        System.out.print("Enter the numerator of the second fraction: ");
        int numerator2 = input.nextInt();
        System.out.print("Enter the denominator of the second fraction: ");
        int denominator2 = input.nextInt();

        // Calculate the product of the numerators
        int productNumerator = numerator1 * numerator2;

        // Calculate the product of the denominators
        int productDenominator = denominator1 * denominator2;

        // Calculate the greatest common divisor (GCD) to simplify the result
        int gcd = gcd(productNumerator, productDenominator);

        // Simplify the result
        int simplifiedNumerator = productNumerator / gcd;
        int simplifiedDenominator = productDenominator / gcd;

        // Display the result
        System.out.println("The product of the fractions is: " + simplifiedNumerator + "/" + simplifiedDenominator);


    }

    // Function to calculate the greatest common divisor (GCD) using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    }



