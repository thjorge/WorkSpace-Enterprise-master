package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public interface PacoteDAO extends GenericDAO<Pacote,Integer>{

	List<Pacote> buscarPorQuantidadeDiasMinimo(int dias);
	
	List<Pacote> buscaPorTransporte(Transporte transporte);

	List<Pacote> buscarPorDatas(Calendar inicio, Calendar fim);

	double mediaPrecoPacote();

	int buscaQtdPacotePorData(Calendar inicio,Calendar fim);
	
	Pacote buscaPacoteComMaiorPreco();
}
