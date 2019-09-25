package domain;

public class EncoderContext {
    private IEncoder encoder;

    public EncoderContext(IEncoder encoder) {
        this.encoder = encoder;
    }

    public String encode(String cleartext) {
        return encoder.encode(cleartext);
    }

    public String decode(String ciphertext) {
        return encoder.decode(ciphertext);
    }
}
