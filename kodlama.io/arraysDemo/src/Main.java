public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = new String[4];
        ogrenciler[0]="Ali";
        ogrenciler[1]="Nur";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ömer";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        //2. Yontem

        for(String ogrenci:ogrenciler) {
            System.out.println(ogrenci);

        }
    }
}