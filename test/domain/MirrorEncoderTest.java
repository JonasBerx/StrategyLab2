package domain;
import static org.junit.jupiter.api.Assertions.*;

class MirrorEncoderTest {
    private static MirrorEncoder mirrorEncoder;

    @org.junit.jupiter.api.BeforeAll
    static void setup() {
        mirrorEncoder = new MirrorEncoder();
    }

    @org.junit.jupiter.api.Test
    void encode() {
        String orig = "heyho";
        String expected = "ohyeh";
        String actual = mirrorEncoder.encode(orig);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void decode() {
    }
}