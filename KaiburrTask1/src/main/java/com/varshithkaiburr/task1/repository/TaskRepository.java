package com.varshithkaiburr.task1.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.varshithkaiburr.task1.model.Server;

@Repository
public interface TaskRepository extends MongoRepository<Server, String> {

	List<Server> findByName(String name);
}