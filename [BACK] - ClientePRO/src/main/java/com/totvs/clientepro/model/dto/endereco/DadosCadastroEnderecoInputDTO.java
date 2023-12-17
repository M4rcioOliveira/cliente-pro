package com.totvs.clientepro.model.dto.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record DadosCadastroEnderecoInputDTO(

        @NotBlank(message = "CEP não informado no corpo da requisição.")
        @Pattern(
                regexp = "^.{8}$",
                message = "Formato de CEP inválido. Deve ser de apenas 8 caracteres;"
        )
        String cep,
        @NotBlank(message = "Bairro não informado no corpo da requisição.")
        @Size(min = 1, max = 50, message = "O bairro deve ter entre 1 e 50 caracteres.")
        String bairro,

        @NotBlank(message = "Cidade não informada no corpo da requisição.")
        @Size(min = 1, max = 50, message = "A Cidade deve ter entre 1 e 50 caracteres.")
        String cidade,
        @NotBlank(message = "UF não informada no corpo da requisição.")
        @Pattern(
                regexp = "^.{2}$",
                message = "Formato de UF inválido. Deve ser de apenas 2 caracteres;"
        )
        String uf,
        @Size(max = 5, message = "O numero deve conter até 5 digitos.")
        String numero,
        @Size(max = 100, message = "O complemento deve conter até 100 caracteres.")
        String complemento

) {
}
