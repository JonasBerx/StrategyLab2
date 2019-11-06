package domain;

public class EncoderFactory {

    IEncoder encoder;

    public static IEncoder createObject(String type) {
        if (type.equals(EncoderEnum.CEASERSALAD)) {
            return new CeasarEncoder();
        }
        //Rest nog doen maar zonder if statements - reflection
//        return null;

        EncoderEnum encoderEnum = EncoderEnum.valueOf(type);
        String className = encoderEnum.getClassName();
        IEncoder encoder = null;

        try {
            Class encoderClass =Class.forName(className);
            Object encoderObject = encoderClass.newInstance();
            encoder = (IEncoder) encoderObject;

        } catch (Exception e) {} //Silently fail
        return encoder;
    }
}
