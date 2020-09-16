package com.vitorapp.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitorapp.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game , Long> {
	

}
