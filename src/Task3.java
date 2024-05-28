public class Task3 {

    /*
    3- Bir Java programı yazınız. Bu program, Ali'nin adını, yaşını, boyunu ve cebindeki para miktarını birleştirip ekrana yazdıracaktır. Programın şu adımları takip etmesi gerekmektedir:

    1. Ali'nin adını bir `String` değişkeni olarak tanımlayınız (örneğin, `String ad = "Ali";`).
    2. Ali'nin yaşını bir `int` değişkeni olarak tanımlayınız (örneğin, `int yas = 23;`).
    3. Ali'nin boyunu bir `double` değişkeni olarak tanımlayınız (örneğin, `double boy = 1.86;`).
    4. Ali'nin cebindeki para miktarını bir `double` değişkeni olarak tanımlayınız (örneğin, `double para = 25680.0;`).
    5. Bu bilgileri birleştirerek ekrana yazdırınız.
    */

    public static void main(String[] args) {

        String ad = "Ali";
        int yas = 23;
        double boy = 1.86;
        double para = 25680.0;

        System.out.println("Benim adım " + ad + "," + " yaşım " + yas + "," + " boyum " + boy + " metre ve cebimde " + para + " TL para var.");

    }

}
