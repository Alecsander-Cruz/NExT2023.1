package next.school.cesar.springrevisao.controllers;

import next.school.cesar.springrevisao.entities.Categoria;
import next.school.cesar.springrevisao.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public ResponseEntity<List<Categoria>> getCategorias(){
        if(categoriaRepository.count() <= 0){
            return new ResponseEntity<List<Categoria>>(categoriaRepository.findAll(), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Categoria>>(categoriaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Categoria> addCategoria(@RequestBody Categoria categoria){
        categoriaRepository.save(categoria);
        return new ResponseEntity<Categoria>(categoria, HttpStatus.CREATED);
    }
}
