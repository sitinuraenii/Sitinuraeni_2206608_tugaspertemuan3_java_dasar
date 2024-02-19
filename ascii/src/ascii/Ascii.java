/*Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII dari karakter ‘A’ dan
karakter ‘B’!*/

package ascii;

public class Ascii {

    public static void main(String[] args) {
        char A = 'A';
        char B = 'B';

        int asciiA = (int) A; /*65*/
        int asciiB = (int) B;/*66*/

        int jml = asciiA + asciiB;

        System.out.println("Hasil penjumlahan ASCII dari 'A' dan 'B' = " + jml);
    }
    
}
