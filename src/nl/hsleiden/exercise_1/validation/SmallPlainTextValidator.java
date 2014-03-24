package nl.hsleiden.exercise_1.validation;

/**
 * Created by Bart on 18-3-14.
 */
public class SmallPlainTextValidator implements Validator {

    private String message;

    @Override
    public boolean validate(String input) {

        if(input.length() > 6) {
            message = "mag niet groter zijn dan 6 tekens.";
            return false;
        }

        return true;
    }

    @Override
    public String getMessage() {
        return "Invoer " + message;
    }
}
