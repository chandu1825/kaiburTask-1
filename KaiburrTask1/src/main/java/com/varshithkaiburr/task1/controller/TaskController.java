package com.varshithkaiburr.task1.controller;

import java.util.List;
import java.util.Optional;

import com.varshithkaiburr.task1.model.Server;
import com.varshithkaiburr.task1.service.ServerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/servers")
public class TaskController {

    @Autowired
    private ServerImpl serverImpl;

    @GetMapping(value = "/getServer")
    public List<Server> getAllServers() {
        return serverImpl.findAll();
    }

    @GetMapping(value = "/getServer", params = "id")
    public ResponseEntity<?> getServerById(@RequestParam String id) {
        Optional<Server> server = serverImpl.findById(id);
        if (server.isPresent()) {
            return new ResponseEntity<Server>(server.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Server not found!", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/getServer", params = "name")
    public ResponseEntity<?> getServerByName(@RequestParam String name) {
        List<Server> servers = serverImpl.findByName(name);
        if (servers.isEmpty()) {
            return new ResponseEntity<String>("Server not found!", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<Server>>(servers, HttpStatus.OK);
        }
    }

    @PutMapping(value = "/createServer")
    public ResponseEntity<?> createOrUpdateServer(@RequestBody Server server) {
        serverImpl.createOrUpdateServer(server);
        return new ResponseEntity<String>("Server added successfully!", HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteServer")
    public ResponseEntity<?> deleteServer(@RequestParam String id) {
        if (serverImpl.existsServerById(id)) {
            serverImpl.deleteServerById(id);
            return new ResponseEntity<String>("Server deleted successfully!", HttpStatus.OK);
        }
        return new ResponseEntity<String>("Server not exists!", HttpStatus.OK);
    }

}