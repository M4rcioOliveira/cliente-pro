package com.totvs.clientepro.model.dto.telefone;

import com.totvs.clientepro.enums.TipoTelefone;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroTelefoneDTO(

        @NotBlank(message = "Numero de telefone não informado no corpo da requisição.")
        @Pattern(regexp = "^[0-9]{10,11}$", message = "O telefone deve ter 10 ou 11 números.")
        String numero,
        @NotNull(message = "Tipo de telefone não informado no corpo da requisição.")
        TipoTelefone tipo

) {
}
