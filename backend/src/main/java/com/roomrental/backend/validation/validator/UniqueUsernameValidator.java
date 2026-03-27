package com.roomrental.backend.validation.validator;

import com.roomrental.backend.repository.UserRepository;
import com.roomrental.backend.validation.UniqueUsername;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

    private final UserRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        if (username == null || username.isEmpty()) return true;
        return userRepository.findByUsername(username).isEmpty();
    }
}
