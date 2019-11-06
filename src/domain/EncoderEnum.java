package domain;

public enum EncoderEnum {
    CEASERSALAD("CeasarEncoder"),
    MIRROR("MirrorEncoder"),
    RANDOM("RandomCipherAdapter"),
    SECRET ("SecretCode");

    private final String className;

    EncoderEnum(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
