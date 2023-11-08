package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReversedSequenceTest {
    @Test
    void testToString() {
        // arrange
        ReversedSequence value = new ReversedSequence("abcdef");
        String expected = "fedcba";

        // act
        String actual = value.toString();

        // assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testCharAt() {
        // arrange
        ReversedSequence value = new ReversedSequence("abcdef");
        char expected = 'e';

        // act
        char actual = value.charAt(1);

        // assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testLength() {
        // arrange
        ReversedSequence value = new ReversedSequence("abcdef");
        int expected = "fedcba".length();

        // act
        int actual = value.length();

        // assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSubSequence() {
        // arrange
        ReversedSequence value = new ReversedSequence("abcdef");
        String expected = "edc";

        // act
        String actual = value.subSequence(1, 4).toString();

        // assert
        assertThat(actual).isEqualTo(expected);
    }
}
