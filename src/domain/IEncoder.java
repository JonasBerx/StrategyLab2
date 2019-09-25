package domain;

public interface IEncoder {
    String encode(String cleartext);
    String decode(String ciphertext);
}
