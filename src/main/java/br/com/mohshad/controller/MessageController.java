package br.com.mohshad.controller;

import br.com.mohshad.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private MessageService messageService;

    private final String prefixKey = "generic.message";

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getTest() {
        return ResponseEntity.status(HttpStatus.OK).body(messageService.getRequestLocalizedMessage(prefixKey, "i18n"));
    }
}
