package domain;

public class RandomCipherAdapter implements IEncoder {

    private RandomCypher cypher = new RandomCypher();

    @Override
    public String encode(String cleartext) {
        return String.valueOf(cypher.encypher(cleartext.toCharArray()));

    }

    @Override
    public String decode(String ciphertext) {
        return String.valueOf(cypher.decypher(ciphertext.toCharArray()));
    }
}
