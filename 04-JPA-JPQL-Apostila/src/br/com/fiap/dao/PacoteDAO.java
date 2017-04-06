package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Reserva;
import br.com.fiap.entity.Transporte;

public interface PacoteDAO extends GenericDAO<Pacote,Integer>{

	List<Pacote> listar();
	List<Pacote>buscarPorQuantidadeDiasMinimo(int dias);
	List<Pacote> buscarPorTransporte(Transporte transporte);
	List<Pacote> buscarPorDatas(Calendar inicio, Calendar fim);
	
}
