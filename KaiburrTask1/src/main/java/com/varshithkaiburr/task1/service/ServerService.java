package com.varshithkaiburr.task1.service;

import java.util.List;
import java.util.Optional;

import com.varshithkaiburr.task1.model.Server;

public interface ServerService {

    List<Server> findAll();

    Optional<Server> findById(String Id);

    void createOrUpdateServer(Server server);

    void deleteServerById(String Id);

    List<Server> findByName(String name);
}