package br.com.alura.mvc.aluramvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/hello")
    // Uma outra forma de adicionar esse atributo é usando o Model
    public String helloWorld(Model model) {
        model.addAttribute("nome", "Pedro Pereira");
        // Aqui nós passamos o nome da view que é o hello.hmlt (não precisa colocar o .html)
        return "hello";
    }

//    @GetMapping("/hello")
//    public String helloWorld(HttpServletRequest request) {
//        request.setAttribute("nome", "Pedro Pereira");
//        // Aqui nós passamos o nome da view que é o hello.hmlt (não precisa colocar o .html)
//        return "hello";
//    }
}
