package next.school.cesar.springrevisao.repositories;

import next.school.cesar.springrevisao.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
