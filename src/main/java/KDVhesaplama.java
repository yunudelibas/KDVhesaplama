import java.util.Scanner;

public class KDVhesaplama {
    public static void main(String[] args) {
        double  Fiyat,KDV=1;
        Scanner girdi=new Scanner(System.in);
        System.out.print("Ürün fiyatını gir:");
        Fiyat=girdi.nextDouble();
        /*System.out.print("KDV miktarını gir:");
        KDV=girdi.nextDouble();*/
        if (Fiyat<1000&&Fiyat>0) {
            KDV=18;
        }     else if (Fiyat>1000){
            KDV=8;
        }
        System.out.println("KDV:"+KDV);
        System.out.println("KDV'siz Fiyat: "+Fiyat);
        System.out.println("KDV'li Fiyat:"+(Fiyat+Fiyat*KDV/100));
        System.out.println("KDV Tutarı: "+ Fiyat*KDV/100);

    }

}
