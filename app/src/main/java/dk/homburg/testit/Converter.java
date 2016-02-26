package dk.homburg.testit;

import android.support.annotation.NonNull;

public class Converter {
    @NonNull
    public String invoke(String input) {
        if (input.length() == 0) {
            return input;
        }

        String rest = rest(input);

        return this.firstLetter(input).toUpperCase() + rest;
    }

    @NonNull
    private String rest(String input) {
        return input.substring(1);
    }

    @NonNull
    public String firstLetter(String input) {
        return input.substring(0, 1);
    }
}
