package domain;

public class MirrorEncoder implements IEncoder {

    @Override
    public String encode(String cleartext) {
        return mirror(cleartext);
    }

    @Override
    public String decode(String ciphertext) {
        return mirror(ciphertext);
    }

    public String mirror(String text) {
        char[] textArr = text.toCharArray();
        int len = textArr.length;
        char[] mirroredArr = new char[len];

        for (int i = 0; i < len; i++) {
            mirroredArr[len - i - 1] = textArr[i];
        }

        return new String(mirroredArr);
    }
}
