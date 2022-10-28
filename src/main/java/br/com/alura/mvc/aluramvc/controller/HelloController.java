package br.com.alura.mvc.aluramvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        // Aqui nós passamos o nome da view que é o hello.hmlt (não precisa colocar o .html)
        return "hello";
    }
}
