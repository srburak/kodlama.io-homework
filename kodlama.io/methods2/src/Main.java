public class Main {
    public static void main(String[] args) {
        String mesaj = "Bug�n hava �ok g�zel";
        // String yeniMesaj=mesaj.substring(0,2);
        // String yeniMesaj=topla(); //Hata verir ��nk� int d�nd�r�yor
        String yeniMesaj = sehirVer(); // Hata yok ��nk� String d�nd�r�yor
        System.out.println(yeniMesaj);


        int sayi = topla(15, 7);
        System.out.println(sayi);


        int toplam=topla2(2,3,4,5,6,10);
        System.out.println(toplam);

    }

    // Void operasyonunda bir �eyi yap dersiniz
    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    //Sadece 2 adet say� g�nderebiliyorsun
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) {
        int toplam=0;
        for(int sayi:sayilar) {

            toplam+=sayi;

        }
        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }
    }
