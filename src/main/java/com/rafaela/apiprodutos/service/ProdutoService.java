package com.rafaela.apiprodutos.service;

import com.rafaela.apiprodutos.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {
    List<Produto> listarTodos();
    Optional<Produto> buscarPorId(Long id);
    Produto salvar(Produto produto);
    Produto atualizar(Long id, Produto produto);
    void deletar(Long id);
}
