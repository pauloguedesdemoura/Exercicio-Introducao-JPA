package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.MotoristaDAO;
import br.com.fiap.entity.Motorista;
import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitException;

public class MotoristaDAOImpl implements MotoristaDAO {

	private EntityManager em;
	
	
	public MotoristaDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public void cadastrar(Motorista motorista) {
      em.persist(motorista);		
	}

	public void atualizar(Motorista motorista) {
		em.merge(motorista);
		
	}

	public void deletar(int codigo) throws CodigoInvalidoException {
		Motorista mt = buscar(codigo);
		if(mt ==null) {
			throw new CodigoInvalidoException();
		}
			em.remove(mt);
	}

	public Motorista buscar(int codigo) {		
		return em.find(Motorista.class, codigo);		
	}

	public void commit() throws CommitException {
		
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw new CommitException();
		}
	}

}
