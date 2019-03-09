package br.com.fiap.dao;

import br.com.fiap.entity.Motorista;
import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitException;

public interface MotoristaDAO {

	void cadastrar(Motorista motorista);
	
	void atualizar(Motorista motorista);
	
	void deletar(int codigo) throws CodigoInvalidoException ;
	
	Motorista buscar(int codigo);
	
	void commit() throws CommitException;
	
	
}
