package com.rafaela.apiprodutos.service;

import com.rafaela.apiprodutos.model.Produto;
import com.rafaela.apiprodutos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Override
    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<Produto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    @Override
    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    @Override
    public Produto atualizar(Long id, Produto produto) {
        Produto existente = repository.findById(id).orElseThrow();
        existente.setNome(produto.getNome());
        existente.setPreco(produto.getPreco());
        existente.setQuantidade(produto.getQuantidade());
        return repository.save(existente);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
