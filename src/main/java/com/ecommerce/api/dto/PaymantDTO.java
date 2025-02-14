package com.ecommerce.api.dto;


import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.Instant;

@Data
public class PaymantDTO {

    private Long id;

   @NotNull(message = "Data de pagamento é obrigatório")
    private Instant moment;
}
