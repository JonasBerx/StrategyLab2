package domain;

import java.security.AlgorithmConstraints;

public class CeasarEncoder implements IEncoder
{
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    @Override
    public String encode(String cleartext) {
        int offset = 13;
        StringBuilder encoded = new StringBuilder();
        for (char i : cleartext.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();


    }

    @Override
    public String decode(String ciphertext) {
        int offset = -13;
        StringBuilder decoded = new StringBuilder();
        for (char i : ciphertext.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    decoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    decoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                decoded.append(i);
            }
        }
        return decoded.toString();
    }

}
