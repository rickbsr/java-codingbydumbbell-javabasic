package collections;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class UnsupportedOperationException {

    private final static String[] DAY_OF_WEEK = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void main(String[] args) {
        List<String> days;

        // by Arrays$ArrayList
        days = Arrays.asList(DAY_OF_WEEK);
        System.out.println(days);
        System.out.println(days.get(0));

        // UnsupportedOperationException
        days = Arrays.asList(DAY_OF_WEEK);
        days.add("Test");

        // ClassCastException
        days = (ArrayList<String>) Arrays.asList(DAY_OF_WEEK);
        days.add("Test");

        // by ArrayList
        days = new ArrayList<>(Arrays.asList(DAY_OF_WEEK));
        days.add("Test"); // Pass

        System.out.println(days);
    }
}
