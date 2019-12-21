package wrapper.character;

public class EnglishCharJudgment {

    public static void main(String[] args) {
        char c = '/';
        System.out.println(new EnglishCharJudgment().isEnglishCharByAscii(c));
    }

    private boolean isEnglishCharByAscii(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }

    private boolean isEnglishCharByIsLetter(char c) {
        return Character.isLetter(c);
    }

    private boolean isEnglishCharByIsisAlphabetic(char c) {
        return Character.isAlphabetic(c);
    }
}
