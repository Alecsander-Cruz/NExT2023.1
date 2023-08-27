package next.school.cesar.springrevisao.controllers;

import next.school.cesar.springrevisao.entities.Produto;
import next.school.cesar.springrevisao.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public ResponseEntity<List<Produto>> getProdutos(){
        if(produtoRepository.count() <= 0){
            return new ResponseEntity<List<Produto>>(produtoRepository.findAll(), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Produto>>(produtoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Produto> addProduto(@RequestBody Produto produto){
        produtoRepository.save(produto);
        return new ResponseEntity<Produto>(produto, HttpStatus.CREATED);
    }

}
