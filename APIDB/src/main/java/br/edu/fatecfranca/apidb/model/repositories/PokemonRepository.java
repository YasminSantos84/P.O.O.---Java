package br.edu.fatecfranca.apidb.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.apidb.model.Pokemon;

//a classe iinterface vai herdar de outra classe interface
//Pokemon é o tipo da tabela, e o long é o tipo de chave
public interface PokemonRepository extends JpaRepository<Pokemon,Long> {
	//Esta interface vai herdar os métodos de CRUD
	//C - create - insert
	//R - retrieve - select
	//U - update -update
	//D - delete - delete
}
