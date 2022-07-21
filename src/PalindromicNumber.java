import java.util.Scanner;

public class PalindromicNumber {
    static boolean isPalindrom(int a) {
        int tempA = a;
        int newNumber = 0;
        while (tempA > 0) {
            int lastDigit;
            lastDigit = tempA % 10;
            tempA /= 10;
            newNumber = (newNumber * 10) + lastDigit;

        }
        if (a == newNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int number = scanner.nextInt();
        System.out.println(isPalindrom(number) ? number + " Sayısı Palindrom Sayıdır. " : number + " Sayısı Palindrom Sayı Değildir.");
    }
}