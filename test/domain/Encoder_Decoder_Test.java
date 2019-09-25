package domain;
import static org.junit.jupiter.api.Assertions.*;

class Encoder_Decoder_Test {
    private static MirrorEncoder mirrorEncoder;
    private static CeasarEncoder ceasarEncoder;

    @org.junit.jupiter.api.BeforeAll
    static void setup() {
        mirrorEncoder = new MirrorEncoder();
        ceasarEncoder = new CeasarEncoder();
    }

    @org.junit.jupiter.api.Test
    void encodeMirror() {
        String orig = "heyho";
        String expected = "ohyeh";
        String actual = mirrorEncoder.encode(orig);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void decodeMirror() {
        String expected = "heyho";
        String orig = "ohyeh";
        String actual = mirrorEncoder.decode(orig);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void encodeCeasar() {
        String orig = "abcde";
        String expected = "nopqr";
        String actual = ceasarEncoder.encode(orig);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void decodeCeasar() {
        String expected = "abcde";
        String orig = "nopqr";
        String actual = ceasarEncoder.decode(orig);
        assertEquals(expected, actual);
    }
}