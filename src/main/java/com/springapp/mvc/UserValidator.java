package com.springapp.mvc;

//import org.apache.commons.validator.routines.IntegerValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User userModel = (User) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "error.required", new String[] {"name"});
    }
}