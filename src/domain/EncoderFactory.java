package domain;

public class EncoderFactory {

    public IEncoder createObject(String type) {
        EncoderEnum encoderEnum = EncoderEnum.valueOf(type);
        Class className = encoderEnum.getClassName();
        IEncoder encoder = null;

        try {
            Object encoderObject = className.newInstance();
            encoder = (IEncoder) encoderObject;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } //No more will i stay silent!!
        return encoder;
    }
}
