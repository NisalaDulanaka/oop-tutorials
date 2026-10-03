package uk.ac.westminster.products_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public record RegisterInput (
    @Size(min = 0, max = 3) String name,
    @Email String email
) {}
