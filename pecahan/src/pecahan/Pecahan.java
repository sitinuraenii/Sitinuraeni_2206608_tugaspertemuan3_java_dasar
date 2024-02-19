/*Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan
pecahan dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan!*/

package pecahan;
import java.util.Scanner;
public class Pecahan {
    public static void main(String[] args) {
        Scanner pecahan = new Scanner(System.in);
        System.out.print("Masukan angka pertama: ");
        float angka1 = pecahan.nextFloat();
        System.out.print("Masukan angka kedua: ");
        float angka2 = pecahan.nextFloat();
        System.out.print("Masukan angka ketiga: ");
        float angka3 = pecahan.nextFloat();

        float jml = angka1 + angka2 + angka3;
        float kurang = angka1 - angka2 - angka3;
        float kali = angka1 * angka2 * angka3;
        float bagi = angka1 / angka2 / angka3;

        System.out.println("\nHasil penjumlahan: " + jml);
        System.out.println("Hasil pengurangan: " +  kurang);
        System.out.println("Hasil perkalian: " + kali);
        System.out.println("Hasil pembagian: " + bagi);

        pecahan.close();
    }
    
}
