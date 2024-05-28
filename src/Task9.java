public class Task9 {

    /*
    9- Ali ve Veli, marketten alışveriş yaparken aldıkları ürünlerin fiyatlarını hesaplamak istiyorlar.
    Ali, bir ürünün fiyatını 123.456 TL olarak görüyor. Ancak Ali, ondalık kısmı görmek istemiyor ve bu fiyatı tam sayı olarak dönüştürmek istiyor.
    Veli ise, kendi birikimlerini tam sayı olarak hesapladıktan sonra byte cinsine dönüştürmek istiyor.
    Son olarak, Ali ve Veli aldıkları ürünlerin toplam fiyatını hesaplamak istiyorlar.

    Ali ve Veli'nin bu dönüşümleri yaparak toplam fiyatı hesaplayan bir Java programı yazınız.
    */

    public static void main(String[] args) {

        // Ali'nin ürün fiyatı (ondalık kısmı görmezden gelinmiş olarak)
        double alininUrunFiyati = 123.456;
        int alininTamSayiFiyati = (int) alininUrunFiyati;

        // Veli'nin birikimleri (tam sayıya dönüştürülmüş olarak)
        double velininBirikimleri = 5000.75;
        byte velininTamSayiBirikimleri = (byte) velininBirikimleri;

        // Ali ve Veli'nin toplam harcaması
        double toplamHarcama = alininUrunFiyati + velininBirikimleri;

        // Sonuçların ekrana yazdırılması
        System.out.println("Ali'nin ürün fiyatı (ondalıksız): " + alininTamSayiFiyati + " TL");
        System.out.println("Veli'nin birikimleri (byte olarak): " + velininTamSayiBirikimleri);
        System.out.println("Ali ve Veli'nin toplam harcaması: " + toplamHarcama + " TL");

    }

}
