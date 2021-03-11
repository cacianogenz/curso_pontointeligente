package com.cs.pontointeligente.api.repositories;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.cs.pontointeligente.api.entities.Empresa;

@SpringBootTest
@ActiveProfiles("test")
public class EmpresaRepositoryTest {
	@Autowired
	private EmpresaRepository empresaRepository;
	
	private static final String CNPJ = "51463645000100";

	@BeforeEach
	public void setUp() throws Exception {
		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Empresa de exemplo");
		empresa.setCnpj(CNPJ);
		this.empresaRepository.save(empresa);
	}
	
	@AfterEach
    public final void tearDown() { 
		this.empresaRepository.deleteAll();
	}

	@Test
	public void testBuscarPorCnpj() {
		Empresa empresa = this.empresaRepository.findByCnpj(CNPJ);
		
		assertEquals(CNPJ, empresa.getCnpj());
	}
	
<<<<<<< HEAD
//	@Test
//	public void testListAll() {
//		List<Empresa> emps = this.empresaRepository.listAll();
//		
//		assertEquals(1, emps);
//	}
=======
	@Test
	public void testListAll() {
		List<Empresa> emps = this.empresaRepository.listAll();
		
		assertEquals(1, emps);
	}
>>>>>>> 20b579bc1ac3230d77826ca788b81d7431c124f8
	

}
