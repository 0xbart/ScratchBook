package nl.hsleiden.exercise_1.validation;

/**
 * Created by Bart on 18-3-14.
 */
public class PhoneNumberValidator implements Validator {

    private String message;

    @Override
    public boolean validate(final String input) {
        if(input.matches(".*\\c.*")) {
            message = "mag geen letters bevatten.";
            return false;
        }

        if(input.length() > 10) {
            message = "mag maar 10 tekens bevatten.";
            return false;
        }
        return true;
    }

    @Override
    public String getMessage() {
        return "Telefoonnummer" + " " + message;
    }
}
