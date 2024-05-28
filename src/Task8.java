public class Task8 {

    /*
    8- Java'da iki tamsayıyı toplamak, çıkarmak, çarpmak, bölmek ve bölümünden kalanını hesaplayan için bir program yazınız.
    Sayılar `15` ve `2` olsun:
    */

    public static void main(String[] args) {

        int a = 15;
        int b = 2;

        int toplam = a + b;
        System.out.println(a + " + " + b + " = " + toplam);

        int fark = a - b;
        System.out.println(a + " - " + b + " = " + fark);

        int çarpım = a * b;
        System.out.println(a + " * " + b + " = " + çarpım);

        int bölüm = a / b;
        System.out.println(a + " / " + b + " = " + bölüm);

    }

}
