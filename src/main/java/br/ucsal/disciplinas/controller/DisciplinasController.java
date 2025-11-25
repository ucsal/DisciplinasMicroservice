package br.ucsal.disciplinas.controller;

import br.ucsal.disciplinas.dto.DisciplinasDTO;
import br.ucsal.disciplinas.model.Disciplinas;
import br.ucsal.disciplinas.service.DisciplinasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/disciplinas")
public class DisciplinasController {

    @Autowired
    private DisciplinasService service;

    @PostMapping
    public ResponseEntity<DisciplinasDTO> save(@RequestBody DisciplinasDTO disciplinas){
        return ResponseEntity.ok(service.save(disciplinas));
    }

    @GetMapping
    public List<Disciplinas> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public DisciplinasDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
