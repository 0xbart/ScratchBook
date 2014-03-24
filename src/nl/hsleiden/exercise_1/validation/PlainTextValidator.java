package nl.hsleiden.exercise_1.validation;

/**
 * Created by Bart on 18-3-14.
 */
public class PlainTextValidator implements Validator {

    private String message;

    @Override
    public boolean validate(String input) {

        if(input.matches(".*\\d.*")){
            message = "mag geen cijfers bevatten.";
            return false;
        } else if(input.length() > 25) {
            message = "mag niet groter zijn dan 25 tekens.";
            return false;
        }

        return true;
    }

    @Override
    public String getMessage() {
        return "Invoer " + message;
    }
}
