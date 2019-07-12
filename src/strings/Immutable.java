package strings;

public class Immutable {

    public static void main(String[] args) {
        String s = "A"; // 產生一個 "A" 字串，由 a 指向
        s = "AB"; // 產生另ㄧ個 "AB" 字串，由 a 指向；"A" 和 "AB" 是不同的物件

        String ss = "A" + "B" + "C" + "D" + "E";
    }
}
