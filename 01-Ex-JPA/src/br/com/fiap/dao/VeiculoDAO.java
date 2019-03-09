package br.com.fiap.dao;

import br.com.fiap.entity.Veiculo;
import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitException;

public interface VeiculoDAO {
	
	void cadastrar(Veiculo veiculo);
	
	void atualizar(Veiculo veiculo);
	
	void deletar(int codigo) throws CodigoInvalidoException;
	
	Veiculo busca(int codigo);
	
	void commit() throws CommitException;
	
	

}
