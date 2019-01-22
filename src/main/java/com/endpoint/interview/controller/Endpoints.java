package com.endpoint.interview.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Endpoints {

    @CrossOrigin(origins = "*")
    @GetMapping("/example/{id}")
    @ResponseBody
    public ResponseEntity<GetResponse> get(@PathVariable(name="id", required=true) String id) {

        GetResponse response = new GetResponse();
        response.id = id;

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/example")
    @ResponseBody
    public ResponseEntity<PostResponse> post(@RequestBody PostRequest postRequest) {

        PostResponse response = new PostResponse();
        response.id = postRequest.id;

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
