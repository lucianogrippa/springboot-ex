package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    @Autowired
    VideoTypesRepository repository;

    @Value("${APP_TITLE}")
    private String title;

    @RequestMapping("/")
    ResponseEntity<TypesDTO> home() {
        List<VideoTypes> types = repository.findAll();
        String message =  String.format("title: %s message: %s",title, "Hello World! test da luciano grippa modificato il 23/11/2021 ore 11:55 test web hook con due pods");



        return ResponseEntity.ok().body(new TypesDTO(types,message));
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
