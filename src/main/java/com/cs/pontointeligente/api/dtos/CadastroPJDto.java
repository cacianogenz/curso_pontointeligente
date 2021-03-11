package com.cs.pontointeligente.api.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

public class CadastroPJDto {
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private String cpf;
	private String razaoSocial;
	private String cnpj;
	
	public CadastroPJDto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@NotEmpty(message = "Não pode ser vazio.")
	@Length(min = 3, max = 200, message="Nome deve conter entre 3 a 200 caracteres")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@NotEmpty(message="não pode ser vazio")
	@Length(min = 5, max = 200, message= "email deve conter entre 5 a 200 caracteres")
	@Email(message = "email invalido")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@NotEmpty(message= "senha não pode ser vazio")
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@NotEmpty(message= "cpf não pode ser vazio")
	@CPF(message="cpf invalido")
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@NotEmpty(message= "Razão não pode ser vazio")
	@Length(min = 5, max=200, message = "Razão deve ter entre 5 ee 200 caracteres")
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@NotEmpty(message = "cnpj no pode ser vazio")
	@Length(min = 5, max=200, message = "cpj deve ter entre 5 ee 200 caracteres")
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
}
