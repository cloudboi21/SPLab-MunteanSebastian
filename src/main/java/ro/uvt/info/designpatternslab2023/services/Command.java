package ro.uvt.info.designpatternslab2023.services;

import org.springframework.http.ResponseEntity;


public interface Command<T> {

    T execute();
}