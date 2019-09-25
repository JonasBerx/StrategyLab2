package domain;

public interface IEncoder {
    public String encode(String cleartext);
    public String decode(String ciphertext);
}
