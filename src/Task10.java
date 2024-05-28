public class Task10 {

    /*
    10- Ali ve Veli, bir akşam yemeği için dışarı çıkmayı planlıyorlar. Ali'nin yemeğe çıkabilmesi için iki şart var:
    Hava güzel olmalı ve Ali'nin yeterli parası olmalı.
    Havanın güzel olup olmadığını boolean havaGuzel değişkeni ile,
    Ali'nin yeterli parası olup olmadığını ise boolean yeterliPara değişkeni ile temsil ediyoruz.

    Java'da bu iki şartın sağlanıp sağlanmadığını kontrol eden ve sonucu ekrana yazdıran bir program yazınız.
    */

    public static void main(String[] args) {

        // Değişkenlerin tanımlanması
        boolean havaGuzel = true; // Hava güzel ise true, değilse false
        boolean yeterliPara = true; // Yeterli para varsa true, yoksa false

        // Şartların kontrolü
        if (havaGuzel && yeterliPara) {

            System.out.println("Ali yemeğe çıkabilir."); // Her iki şart da sağlanıyorsa

        } else {

            System.out.println("Ali yemeğe çıkamaz."); // En az bir şart sağlanmıyorsa

        }
    }
}
