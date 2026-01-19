package Isabela_S.produtosapi.controller;

import Isabela_S.produtosapi.model.Produto;
import Isabela_S.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("produtos") //complemento da url para o postman
public class ProdutoController {

    //Controller vai precisar de alguém que saiba buscar e salvar produtos
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    //A url do Request já entra em PostMapping
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);
        var id = UUID.randomUUID().toString(); //gera códigos únicos, para o Id da aplicação
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable("id") String Id) {
       //PathVariable valor que vem no caminho da URL para o chamado Postman
       //Optional<Produto> produto = produtoRepository.findById(id);
       //return produto.isPresent() ? produto.get() : null; //condicao ? valorSeVerdadeiro : valorSeFalso

        return produtoRepository.findById(Id).orElse(null);

    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") String Id) {
        produtoRepository.deleteById(Id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable("id")String Id,
                          @RequestBody Produto produto){
        produto.setId(Id);
        produtoRepository.save(produto);
    }

    @GetMapping
    public List<Produto> buscar(@RequestParam("nome") String nome){
        return produtoRepository.findByNome(nome);
    }
}
