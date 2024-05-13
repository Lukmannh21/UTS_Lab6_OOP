public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan
        String string1 = "Ipa";
        String string2 = "ApI";

        if (CekAnagram.isAnagram(string1, string2)) {
            System.out.println("Iya, keduanya itu anagram.");
        } else {
            System.out.println("keduanya bukan anagram.");
        }
    }
}