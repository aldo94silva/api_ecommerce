package com.ecommerce.api.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class UserDto {
    private Long id;

    @Size(min = 3, max = 80, message = "Nome deve ter entre 3 e 80 caracteres")
    @NotBlank(message = "Nome é obrigatório")
    private String name;

    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Email inválido")
    private String email;

    @Pattern(regexp = "^\\(?\\d{2}\\)?\\s?9?\\d{4}-?\\d{4}$",
            message = "Número de telefone inválido.")
    private String phone;

    @Past(message = "Data de nascimento é obrigatório")
    private LocalDate birthDate;

    @NotBlank(message = "Senha é obrigatório")
    @Size(min = 6, message = "Senha deve ter no mínimo 6 caracteres")
    private String password;

    @NotEmpty(message = "É obrigatório selecionar pelo menos uma função")
    @Pattern(regexp = "(ADMIN|USER|MANAGER)", message = "A função deve ser ADMIN, USER ou MANAGER")
    private String roles;


}
