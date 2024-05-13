import java.util.Arrays;
// ni buat operasi array kek lower case replace dkk

public class CekAnagram {

    // pake metod buat ngecek apakah dua string itu anagram
    public static boolean isAnagram(String kata1, String kata2) {

        kata1 = kata1.replaceAll("\\s", "").toLowerCase();
        // spasi nya di hilangkan terus diubah ke huruf kecil
        kata2 = kata2.replaceAll("\\s", "").toLowerCase();

        // di cek panjang kata1 sama kata 2 sama apa nggak
        if (kata1.length() != kata2.length()) {
            return false;
        }

        // string diubah ke char biar hurufnya bisa di sort
        char[] arrayKata1 = kata1.toCharArray();
        char[] arrayKata2 = kata2.toCharArray();
        Arrays.sort(arrayKata1);
        Arrays.sort(arrayKata2);

        // terus tinggal di bandingkan
        return Arrays.equals(arrayKata1, arrayKata2);
    }
}