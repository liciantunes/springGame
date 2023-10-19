package com.example.alicie.PrjGame.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.alicie.PrjGame.entities.Jogo;
import com.example.alicie.PrjGame.repositories.JogoRepository;

@Service
public class JogoService {
	
	private final JogoRepository jogoRepository;
	
	@Autowired
	public JogoService (JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}
	
	public Jogo saveJogo (Jogo jogo) {
		return jogoRepository.save(jogo);
	}
	
	public List<Jogo> getAllJogo(){
		return jogoRepository.findAll();
	}
	
	public Jogo getJogoByid(Long id) {
		return jogoRepository.findById(id).orElse(null);
	}
	
	public void deleteJogo(Long id) {
		jogoRepository.deleteById(id);
	}
	
	
	
	
	
	
	
	

}
