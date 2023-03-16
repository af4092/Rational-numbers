import java.util.Scanner;
public class TestRational {
    public static void main(String[] args) {
        int firstNumerator, firstDenominator, secondNumerator, secondDenominator;
        Scanner input = new Scanner(System.in);
        System.out.print("enter numerator: ");
        firstNumerator = input.nextInt();
        System.out.print("enter denominator: ");
        firstDenominator = input.nextInt();
        System.out.print("enter another numerator: ");
        secondNumerator = input.nextInt();
        System.out.print("enter another denominator: ");
        secondDenominator = input.nextInt();
        System.out.println(new String(new char[35]).replace("\0", "\u2500"));

        Rational r1 = new Rational(firstNumerator, firstDenominator);
        Rational r2 = new Rational(secondNumerator, secondDenominator);
        System.out.println(r1+" + "+r2+" = "+r1.add(r2));
        System.out.println(r1+" - "+r2+" = "+r1.substract(r2));
        System.out.println(r1+" * "+r2+" = "+r1.multiply(r2));
        System.out.println(r1+" / "+r2+" = "+r1.divide(r2));
        System.out.println(r2+" is "+r2.doubleValue());
        }
}
