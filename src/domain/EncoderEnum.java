package domain;

public enum EncoderEnum {
    CAESAR(CeasarEncoder.class),
    MIRROR(MirrorEncoder.class),
    RANDOM(RandomCipherAdapter.class),
    SECRET(SecretCode.class);

    private final Class klas;

    EncoderEnum(Class className) {
        this.klas = className;
    }

    public Class getClassName() {
        return klas;
    }
}
