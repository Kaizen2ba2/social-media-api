package dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserDto(@NotBlank @Size(min = 3) String username, @NotBlank @Email String email, @NotBlank @Size(min = 6) String password) {
}
