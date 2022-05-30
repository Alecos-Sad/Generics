package JavaForAll.ex2;

public class Alpha {

    int code;

    public Alpha(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "<Alpha " + code + " >";
    }
}
