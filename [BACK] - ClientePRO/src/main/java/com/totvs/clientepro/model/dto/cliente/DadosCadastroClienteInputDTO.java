package com.totvs.clientepro.model.dto.cliente;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.totvs.clientepro.model.dto.endereco.DadosCadastroEnderecoInputDTO;
import com.totvs.clientepro.model.dto.telefone.DadosCadastroTelefoneDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.util.List;

public record DadosCadastroClienteInputDTO(

        @NotBlank
        @NotBlank(message = "CPF ou CNPJ não informado no corpo da requisição.")
        @Pattern(
                regexp = "^(\\d{11}|\\d{14})$",
                message = "Formato de documento inválido. Deve ser um CPF de 11 dígitos ou um CNPJ de 14 dígitos."
        )
        @JsonProperty("cpf_cnpj")
        String cpfCnpj,
        @NotBlank(message = "Nome não informado no corpo da requisição.")
        @Size(min = 11, max = 50, message = "O nome deve ter entre 11 e 50 caracteres.")
        String nome,
        @NotBlank
        @NotBlank(message = "E-mail não informado no corpo da requisição.")
        @Email(message = "Formato de e-mail-inválido.")
        String email,
        @NotNull(message = "Bloco de endereço não informado no corpo da requisição.")
        @Valid
        DadosCadastroEnderecoInputDTO endereco,
        @NotNull(message = "Bloco de lista de telefones não informado no corpo da requisição.")
        @Valid
        List<DadosCadastroTelefoneDTO> telefones


) {
}
