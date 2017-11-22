package br.com.alineferreira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alineferreira.component.NotaComponent;
import br.com.alineferreira.model.Nota;

@RestController
//@CrossOrigin
@RequestMapping(value = "notas")
public class NotaController {

	@Autowired
    private NotaComponent notaComponent;

    @GetMapping
    private List<Nota> findAll() {
        return notaComponent.buscarTodos();
    }

    @GetMapping(value = "/titulo/{titulo}")
    private Nota findAll(@PathVariable(value = "titulo") String titulo) {
        return notaComponent.buscarNota(titulo);
    }

    @PostMapping
    private void save(@RequestBody Nota nota) {
        notaComponent.salvar(nota);
    }

    @DeleteMapping
    private void deleteAll() {
        notaComponent.apagarTodos();
    }
}

