package com.vitorapp.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitorapp.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record , Long> {
	

}
