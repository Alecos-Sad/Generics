package JavaForAll.ex3;

public class AlphaEx3 {
    int code;

    AlphaEx3(int n) {
        code = n;
    }

    @Override
    public String toString() {
        return "<Alpha " + code + " >";
    }
}
