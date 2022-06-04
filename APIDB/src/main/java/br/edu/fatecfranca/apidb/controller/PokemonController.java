package br.edu.fatecfranca.apidb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.apidb.model.Pokemon;
import br.edu.fatecfranca.apidb.model.repositories.PokemonRepository;

//informa que a classe responde por requisições restfull
@RestController
public class PokemonController {
	//característica principal do spring
	//injeção de dependência
	//objeto pode utilizar métodos de sua interface sem ser instanciado
	@Autowired
	PokemonRepository injecao;
	
	//método get para consultar os pokemons na rota/pokemon
	@GetMapping("/Pokemon")
	//Permite que a API seja consumida de um ip especifico, neste caso qualquer ip
	@CrossOrigin(origins="*")
	public List<Pokemon>get(){
		//select * from Pokemon
		return injecao.findAll();
	}
	//Método para inserir um pokemón na rota /pokemon
	@PostMapping("/Pokemon")
	@CrossOrigin(origins="*")
	public Pokemon add(@RequestBody Pokemon pokemon) {
		Pokemon novoPokemon = injecao.save(pokemon);
		return novoPokemon;
	}	
	
	@DeleteMapping("/Pokemon/{id}")
	@CrossOrigin(origins="*")
	public String remove(@PathVariable Long id) {
		try {//Tenta remover
			injecao.deleteById(id);
			return "Remoção com sucesso";
		}
		catch(Exception e) {//Pegar erro
			return "Pokemon não encontrado para remoção";
		}
		
	}

	//Método para inserir um pokemón na rota /pokemon
	@PutMapping("/Pokemon")
	@CrossOrigin(origins="*")
	public Pokemon updates(@RequestBody Pokemon pokemon) {
		Pokemon alteradoPokemon = injecao.save(pokemon);
		return alteradoPokemon;
}
	
}
