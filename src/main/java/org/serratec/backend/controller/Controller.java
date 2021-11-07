package org.serratec.backend.controller;

import java.util.List;

import org.serratec.backend.domain.Aluno;
import org.serratec.backend.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST alunos")
@CrossOrigin(origins="*")
public class Controller {

	
	@Autowired
	AlunoRepository  alunoRepository;
	
	
	@GetMapping("/alunos")
	@ApiOperation(value="Retorna lista de alunos")
	public List<Aluno> listaAlunos(){
		return alunoRepository.findAll();
		
	}
	
	@GetMapping("/aluno/{id}")
	@ApiOperation(value="Retorna um alunos")
	public Aluno buscaAluno(@PathVariable(value="id")long id){
		return alunoRepository.findById(id);
		
	}
	@PostMapping("/aluno")
	@ApiOperation(value="Metodo para criar um alunos")
	public Aluno criar(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
		
	}
	
	@DeleteMapping("/aluno")
	@ApiOperation(value="Metodo para deletar um  aluno")
	public void deletaAluno(@RequestBody Aluno aluno) {
	 alunoRepository.delete(aluno);
		
	}
	
	@PutMapping("/aluno")
	@ApiOperation(value="Metodo para editar um aluno")
	public Aluno atualizaAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
		
	}
}
