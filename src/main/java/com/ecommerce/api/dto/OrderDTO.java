package com.ecommerce.api.dto;

import com.ecommerce.api.entities.OrderStatus;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
public class OrderDTO {

    private Long id;

    @NotNull(message = "Data de criação é obrigatório")
    @PastOrPresent(message = "a data do pedido não pode ser no futuro")
    private Instant moment;

    @NotNull(message = "Status é obrigatório")
    @Pattern(regexp = "(WAITING_PAYMENT|PAID|SHIPPED|DELIVERED|CANCELLED)", message = "Status inválido")
    private OrderStatus status;

    private PaymantDTO payment;

    @NotEmpty(message = "É obrigatório selecionar pelo menos um item")
    private List<OrderItemDTO> orderItems;


}
