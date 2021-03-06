package com.cs.pontointeligente.api.repositories;

import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.cs.pontointeligente.api.entities.Empresa;

@NamedQueries({
	@NamedQuery(name = "EmpresaRepository.listAll", 
			query = "SELECT * FROM empresa") })
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);
	
	@Transactional(readOnly = true)
	List<Empresa> listAll();  
	
}
