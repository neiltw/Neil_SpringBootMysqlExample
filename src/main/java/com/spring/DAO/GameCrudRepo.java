package com.spring.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.Models.Game;

@Transactional
@Repository
public interface GameCrudRepo  extends CrudRepository<Game, Integer>{
	List<Game> findAll();
}
