import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Tutar;
        double kdvOranı;
        System.out.println("Ücret Tutarını giriniz");
        Tutar = scanner.nextDouble();
        double KdvTutarı;
        if (0 < Tutar && Tutar < 1000) {
            kdvOranı = 0.18;
            KdvTutarı = Tutar * kdvOranı;
            System.out.println("Kdv Tutarı :" + KdvTutarı);
            double KdvliFiyat=Tutar+KdvTutarı;
            System.out.println(KdvliFiyat);
        }
        if (Tutar > 1000) {
            kdvOranı = 0.08;
            KdvTutarı = Tutar * kdvOranı;
            System.out.println("Kdv Tutarı :" + KdvTutarı);
            double KdvliFiyat=Tutar+KdvTutarı;
            System.out.println(KdvliFiyat);
        }
        }
    }
