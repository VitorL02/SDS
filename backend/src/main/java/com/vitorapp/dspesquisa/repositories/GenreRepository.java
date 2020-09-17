package com.vitorapp.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vitorapp.dspesquisa.entities.Genre;
@Repository
public interface GenreRepository extends JpaRepository<Genre , Long> {
	

}
