package cetinlerrandevu.com;

class RandevuListesi {
    Node head;

    // Constructor
    public RandevuListesi() {
        this.head = null;
    }

    // acilDurumEkle(): Liste başına ekler
    public void acilDurumEkle(Hasta hasta) {
        Node yeni = new Node(hasta);
        yeni.sonraki = head;
        head = yeni;
        System.out.println(hasta.AdSoyad + " (ACİL) liste başına eklendi.\n");
    }

    // randevuEkle(): Liste sonuna ekler
    public void randevuEkle(Hasta hasta) {
        Node yeni = new Node(hasta);
        if (head == null) {
            head = yeni;
        } else {
            Node temp = head;
            while (temp.sonraki != null) {
                temp = temp.sonraki;
            }
            temp.sonraki = yeni;
        }
        System.out.println(hasta.AdSoyad + " liste sonuna eklendi.\n");
    }

    // randevuIptal(): Hasta ID'ye göre silme
    public void randevuIptal(int hastaID) {
        if (head == null) {
            System.out.println("Liste boş, silinecek hasta yok.\n");
            return;
        }

        if (head.veri.HastaId == hastaID) {
            System.out.println("Hasta " + head.veri.AdSoyad + " listeden silindi.\n");
            head = head.sonraki;
            return;
        }

        Node temp = head;
        Node onceki = null;

        while (temp != null && temp.veri.HastaId != hastaID) {
            onceki = temp;
            temp = temp.sonraki;
        }

        if (temp == null) {
            System.out.println("Hasta bulunamadı (ID: " + hastaID + ").\n");
        } else {
            System.out.println("Hasta " + temp.veri.AdSoyad + " listeden silindi.\n");
            onceki.sonraki = temp.sonraki;
        }
    }

    // randevuAra(): Hasta ID'ye göre arama
    public void randevuAra(int hastaID) {
        Node temp = head;
        while (temp != null) {
            if (temp.veri.HastaId == hastaID) {
                System.out.println("Hasta bulundu:");
                temp.veri.bilgilerigoster();
                return;
            }
            temp = temp.sonraki;
        }
        System.out.println("Hasta bulunamadı (ID: " + hastaID + ").\n");
    }

    // listeyiGoruntule(): Tüm hastaları sırayla yazdır
    public void listeyiGoruntule() {
        if (head == null) {
            System.out.println("Randevu listesi boş.\n");
            return;
        }

        System.out.println("---- Randevu Listesi ----");
        Node temp = head;
        while (temp != null) {
            temp.veri.bilgilerigoster();
            temp = temp.sonraki;
        }
    }
}
