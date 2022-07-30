import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        // Kullanıcı Değerleri ve Değerler
        int mat, fzk, kmy, trkc, trh, mzk ;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // Kullanıcı değerlerini alma
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fzk = inp.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        kmy = inp.nextInt();
        System.out.print("Turkce Notunuzu Giriniz: ");
        trkc = inp.nextInt();
        System.out.print("Tarih Notunuzu Giriniz: ");
        trh = inp.nextInt();
        System.out.print("Muzik Notunuzu Giriniz: ");
        mzk = inp.nextInt();

        // Toplam sonuç

        int toplam = (mat + fzk + kmy + trh + trkc + mzk );
        double sonuc = toplam / 6.0 ;

        // Sınıf Geçti ve ya Kaldı Değeri

        boolean sonuc1 = sonuc>=60 ;
        String sonuc2 = (sonuc1) ? "Sinif'tan Gecti":"Sinif'ta Kaldi";

        System.out.println(sonuc2);



    }
}
