package com.cs.pontointeligente.api.repositories;

import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.cs.pontointeligente.api.entities.Empresa;

<<<<<<< HEAD
//@NamedQueries({
//	@NamedQuery(name = "EmpresaRepository.listAll", 
//			query = "SELECT * FROM empresa") })
=======
@NamedQueries({
	@NamedQuery(name = "EmpresaRepository.listAll", 
			query = "SELECT * FROM empresa") })
>>>>>>> 20b579bc1ac3230d77826ca788b81d7431c124f8
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);
	
<<<<<<< HEAD
//	@Transactional(readOnly = true)
//	List<Empresa> listAll();  
=======
	@Transactional(readOnly = true)
	List<Empresa> listAll();  
>>>>>>> 20b579bc1ac3230d77826ca788b81d7431c124f8
	
}
