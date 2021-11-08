package br.org.generation.farmaciagen.repository;

import br.org.generation.farmaciagen.model.Categoria;
import br.org.generation.farmaciagen.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public List<Categoria> findByCategoriaContainingIgnoreCase(String categoria);
}
