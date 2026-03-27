package com.roomrental.backend.validation.validator;

import com.roomrental.backend.dto.request.UserRequest;
import com.roomrental.backend.validation.PasswordMatch;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchValidator implements ConstraintValidator<PasswordMatch, UserRequest> {

    @Override
    public boolean isValid(UserRequest userRequest, ConstraintValidatorContext context) {
        if (userRequest.getPassword() == null || userRequest.getConfirmPassword() == null) {
            return false;
        }
        return userRequest.getPassword().equals(userRequest.getConfirmPassword());
    }
}
