package zone.nora.simpleencryption;

import java.util.Base64;

public class SimpleEncryption {
    public static String encrypt(String content, String key) {
        String s = process(content.toCharArray(), key.toCharArray());
        return new String(Base64.getEncoder().encode(s.getBytes()));
    }

    public static String decrypt(String content, String key) {
        return process(new String(Base64.getDecoder().decode(content.getBytes())).toCharArray(), key.toCharArray());
    }

    private static String process(char[] content, char[] key) {
        int i = 0;
        String s = "";
        for (char c : content) {
            s += (char) (c ^ key[i % key.length]);
            i++;
        }
        return s;
    }
}
