public class Task4 {

    /*
    4- Aşağıdaki açıklamaları dikkate alarak, özel karakterlerin kullanımıyla ilgili bir Java programı yazınız.
    Programda, Ali'nin adını, yaşını, boyunu ve banka hesabındaki para miktarını ekrana yazdırınız.
    Her bilgi satırını yeni bir satıra geçecek şekilde ve her bilgi arasında bir tab boşluğu olacak şekilde yazdırınız.

    Açıklamalar:
    - `\n`: Yeni satır. Sonraki satırın başına gider.
    - `\t`: Tab tuşu. Sonraki tab sekmesine kadar imleci götürür.
    */

    public static void main(String[] args) {

        String ad = "Ali";
        int yas = 23;
        double boy = 1.86;
        double para = 25680.0;

        System.out.println("Benim adım " + ad + ".\tYaşım: " + yas + "\nBoyum: " + boy + " metre.\tBanka hesabımda " + para + " TL para var.");

    }

}
