package cetinlerrandevu.com;

public class Main {
    public static void main(String[] args) {

        RandevuListesi liste = new RandevuListesi();
        Hasta h1 = new Hasta(1,"Sadık Çetin","24-10-2025");
        Hasta h2 = new Hasta(2,"Enes Çalış","25-10-2025");
        Hasta h3 = new Hasta(3,"Efe Yılmaz","26-10-2025");



        liste.randevuEkle(h1);
        liste.randevuEkle(h2);
        liste.randevuEkle(h3);


        System.out.println(" 1.Liste");
        liste.listeyiGoruntule();

        System.out.println("Hasta Arama");
        liste.randevuAra(2);

        System.out.println("Hasta Silme");
        liste.randevuIptal(3);

        System.out.println("Son durum");
        liste.listeyiGoruntule();

    }

}
