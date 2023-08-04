import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Fibonnacci {
    static int fibo(int number){if (number==2 || number==1){
        return 1;
    }
        return fibo(number-1)+fibo(number-2);}
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen kaçıncı fibonacci dizisini giriniz");
        int number = input.nextInt();
        System.out.println(fibo(number));
    }
}