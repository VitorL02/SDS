package com.vitorapp.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitorapp.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre , Long> {
	

}
