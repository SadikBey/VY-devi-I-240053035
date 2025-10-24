package cetinlerrandevu.com;

public class Hasta {
    int HastaId;
    String AdSoyad;
    String rendevuTarih;

    public Hasta(int HastaId, String AdSoyad, String rendevuTarih){
        this.HastaId = HastaId;
        this.AdSoyad = AdSoyad;
        this.rendevuTarih = rendevuTarih;
    }
    public void bilgilerigoster(){
        System.out.println("--------Hasta Bilgileri--------");
        System.out.println("Hasta Numarası: "+ HastaId);
        System.out.println("Ad ve Soyad: " + AdSoyad);
        System.out.println("Rendevu Tarihi " + rendevuTarih);
    }

}
