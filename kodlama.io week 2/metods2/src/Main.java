public class Main {
    public static void main(String[] args) {
        String mesaj="Bugün hava çok güzel";
        String yenimesaj = sehirVer();
        System.out.println(yenimesaj);
        int sayi = topla(5,100);
        System.out.println(sayi);
        int toplam = topla2(2,2,2,4,5,5,8,4,6,589,452);
        System.out.println(toplam);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");

    }
    public static void gucelle(){
        System.out.println("Güncellendi");

    }

    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    public static String sehirVer(){
        return "Ankara";
    }
    //Variable Arguments
    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi: sayilar){
            toplam += sayi;
        }
        return toplam;
    }
}