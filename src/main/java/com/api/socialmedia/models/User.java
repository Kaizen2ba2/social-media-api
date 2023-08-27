package com.api.socialmedia.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Size(min = 3)
    private String username;
    @Email
    @NotBlank
    private String email;
    @Size(min = 6)
    private String password;
}
