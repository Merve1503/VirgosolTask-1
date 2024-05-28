public class Task2 {

    /*
    2- Aşağıdaki Java programında System.out.print ve System.out.println kullanarak adınızı, yaşınızı, ve şehrinizi ekrana yazdırınız.
    Programın çıktılarını sırasıyla System.out.print ve System.out.println kullanarak yazdırınız, ancak özel karakterler (\t ve \n) kullanmadan yapınız.
    Not: Ali ve 23 değerlerini değişkene atıyarak yapınız.

    İstenen Çıktı:
    Adım: Ali
    Yaşım: 23
    Şehrim: İstanbul
    */

    public static void main(String[] args) {

        String name = "Merve";
        int age = 31;
        String city = "Antalya";

        System.out.print("Ad: ");
        System.out.println(name);

        System.out.print("Yaş: ");
        System.out.println(age);

        System.out.print("Şehir: ");
        System.out.println(city);

    }

}
