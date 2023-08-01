import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Gidilecek mesafe nedir?");
        int km=scanner.nextInt();
        int acılısUcreti=10;
        double  ödenecekTutar=acılısUcreti+km*2.20;
       if( ödenecekTutar<20){
           ödenecekTutar=20;
           System.out.println(" 20 altı bu yüzden, Taksi ücreti :"+ ödenecekTutar);

        }else{
           ödenecekTutar=acılısUcreti+km*2.20;
           System.out.println("Taksi ücreti :" + ödenecekTutar);
       }
    }
}