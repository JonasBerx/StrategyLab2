package domain;

public class EncoderFactory {

    IEncoder encoder;

    public static IEncoder createObject(EncoderEnum type) {
        if (type.equals(EncoderEnum.CEASERSALAD)) {
            return new CeasarEncoder();
        }
        //Rest nog doen maar zonder if statements - reflection
        return null;
    }
}
