package betybatik.engine;

import java.security.SecureRandom;
import java.util.Random;

public class App_Engine {
    public static final char[] RandomId = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();//Fungsi untuk inisialisasi gabungan alfabet dengan numeric untuk randomID
    public static String randomString(char[] characterSet, int length) {//Pembuatan fungsi untuk menentukan variable dan panjang ID Random
    Random random = new SecureRandom();
    char[] result = new char[length];
    for (int i = 0; i < result.length; i++) {
        int randomCharIndex = random.nextInt(characterSet.length);
        result[i] = characterSet[randomCharIndex];
    }
    return new String(result);
}
}
