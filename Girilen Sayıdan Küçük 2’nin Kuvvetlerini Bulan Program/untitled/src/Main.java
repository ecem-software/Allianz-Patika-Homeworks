import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,i=1;
        System.out.print("Sayı Giriniz: ");
        sayi=input.nextInt();
        boolean control4=true,control5=true;
        /*  girilen sayiya kadar 2 nin kuvvetlerini bulan program
        while(Math.pow(2,i)<sayi){
            System.out.println(Math.pow(2,i));
            i++;
        }*/
        // girilen sayıya kadar olan 4 ve 5 in kuvvetlerini bulan program
        while(control4||control5) {
            if (Math.pow(4, i) < sayi && control4) {
                System.out.print("4'ün kuvveti: " + Math.pow(4, i));
            }else{
                control4=false;
            }
            if (Math.pow(5, i)<sayi && control5){
                System.out.print("     5'in Kuvveti: " + Math.pow(5, i));
            }else{
                control5=false;
            }
            i++;
            System.out.println();
        }
    }
}