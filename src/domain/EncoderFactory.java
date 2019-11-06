package domain;

public class EncoderFactory {

//    IEncoder encoder;

    public IEncoder createObject(String type) {
        //Rest nog doen maar zonder if statements - reflection
//        return null;

        EncoderEnum encoderEnum = EncoderEnum.valueOf(type);
        Class className = encoderEnum.getClassName();
        IEncoder encoder = null;

        try {
            Object encoderObject = className.newInstance();
            encoder = (IEncoder) encoderObject;

        } catch (Exception e) {} //Silently fail
        return encoder;
    }
}
