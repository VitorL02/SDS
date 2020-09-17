package com.vitorapp.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vitorapp.dspesquisa.entities.Record;
@Repository
public interface RecordRepository extends JpaRepository<Record , Long> {
	

}
