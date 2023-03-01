public class Main {
    public static void main(String[] args) {
        sayiBulma();
    }

    public static void sayiBulma(){
        int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
        int aranacak=10;
        boolean varMi=false;

        for (int i = 1; i < sayilar.length; i++) {
            if (i==aranacak) {
                varMi=true;
            }
            else {
                varMi=false;
            }
        }

        if (varMi) {
            mesajVer("sayi dizide mevcuttur : " + aranacak);
        }else {
            mesajVer("sayi bulunmamaktadır : " + aranacak);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}