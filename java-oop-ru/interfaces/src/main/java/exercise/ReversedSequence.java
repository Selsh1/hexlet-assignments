package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String value;

    public ReversedSequence(String value) {
        this.value = new StringBuffer(value).reverse().toString();
    }

    @Override
    public int length() {
        return this.value.length();
    }

    @Override
    public char charAt(int index) {
        return this.value.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.value.subSequence(start, end);
    }

    @Override
    public String toString() {
        return value;
    }
}
// END
