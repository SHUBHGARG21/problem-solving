import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PermutationEncryption {

    public static String encrypt(String plaintext) {

        List<Character> characters = new ArrayList<>();
        for (char c : plaintext.toCharArray()) {
            characters.add(c);
        }


        Collections.shuffle(characters);

        StringBuilder ciphertext = new StringBuilder();
        for (char c : characters) {
            ciphertext.append(c);
        }

        return ciphertext.toString();
    }

    public static void main(String[] args) {


        String plaintext = "Hello, World!";

        String ciphertext = encrypt(plaintext);


        System.out.println("Plaintext: " + plaintext);
        System.out.println("Encrypted Text: " + ciphertext);
    }
}
