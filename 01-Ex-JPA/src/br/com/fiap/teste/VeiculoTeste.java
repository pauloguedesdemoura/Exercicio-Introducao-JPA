package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.dao.impl.VeiculoDAOImpl;
import br.com.fiap.entity.Veiculo;

public class VeiculoTeste {

	public static void main(String[] args) {

		//Fabrica de onde vai ser o trabalho do dados
		//Fabrica de manipulação de Entity
		// que vai ter a persistencia no arquivo pesistence 
		EntityManagerFactory fabrica = 
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");		
		
		// agora criar um gerente
		EntityManager em = fabrica.createEntityManager();
		
		// instanciar a classe dao para inserirmos e mandar quem vai fazer o trampo 
		VeiculoDAO dao = new VeiculoDAOImpl(em);
		
		//CADASTRANDO UM VEICULO
		Veiculo veic_1 = new Veiculo("kng-8818", "azul", 2010);		
		try {			
			dao.cadastrar(veic_1);
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		em.close();
		fabrica.close();
	}

}
