package domain;

public class SecretCode implements IEncoder {
    @Override
    public String encode(String cleartext) {
        return cleartext;
    }

    @Override
    public String decode(String ciphertext) {
        return ciphertext;
    }

}
