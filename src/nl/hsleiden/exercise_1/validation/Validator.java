package nl.hsleiden.exercise_1.validation;

/**
 * Created by Bart on 18-3-14.
 */
public interface Validator {

    public boolean validate(final String input);
    public String getMessage();

}
