import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double fiyat, kdvliFiyat, kdvOran1, kdvOran2, kdvTutar ;

        Scanner read = new  Scanner(System.in);
        System.out.println("Lütfen bir fiyat giriniz.");
        fiyat = read.nextDouble();

            kdvOran1 = 0.18 ;
            kdvOran2 = 0.08 ;

            kdvTutar = (fiyat >= 0 && fiyat <=1000) ? (fiyat*kdvOran1) : (fiyat*kdvOran2) ;
            kdvliFiyat = fiyat + kdvTutar ;

            System.out.println("KDV'siz Fiyat : " + fiyat);
            System.out.println("KDV'li Fiyat  :" + kdvliFiyat );
            System.out.println("KDV Tutarı :" + kdvTutar);

        }

    }

