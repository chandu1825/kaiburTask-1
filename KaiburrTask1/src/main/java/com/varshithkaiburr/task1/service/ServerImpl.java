package com.varshithkaiburr.task1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varshithkaiburr.task1.model.Server;
import com.varshithkaiburr.task1.repository.TaskRepository;

@Service
public class ServerImpl implements ServerService {

    @Autowired
    private TaskRepository TaskRepository;

    @Override
    public List<Server> findAll() {
        return TaskRepository.findAll();
    }

    @Override
    public Optional<Server> findById(String Id) {
        return TaskRepository.findById(Id);
    }

    @Override
    public void createOrUpdateServer(Server server) {
        TaskRepository.save(server);
    }

    @Override
    public void deleteServerById(String Id) {
        TaskRepository.deleteById(Id);
    }

    @Override
    public List<Server> findByName(String name) {
        return TaskRepository.findByName(name);
    }

    public boolean existsServerById(String id) {
        return TaskRepository.existsById(id);
    }

}