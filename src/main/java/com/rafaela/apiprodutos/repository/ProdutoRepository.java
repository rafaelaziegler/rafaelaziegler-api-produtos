package com.rafaela.apiprodutos.repository;

import com.rafaela.apiprodutos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
