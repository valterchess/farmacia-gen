package br.org.generation.farmaciagen.repository;

import br.org.generation.farmaciagen.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public List<Produto> findByNomeContainingIgnoreCase(String nome);

    public List<Produto> findByNomeAndLaboratorio(String nome, String laboratorio);

    public List<Produto> findByNomeOrLaboratorio(String nome, String laboratorio);

    @Query(value = "select * from tb_produtos where preco between :inicio and :fim", nativeQuery = true)
    public List<Produto> buscaProdutosEntre(@Param("inicio")BigDecimal inicio, @Param("fim") BigDecimal fim);
}
