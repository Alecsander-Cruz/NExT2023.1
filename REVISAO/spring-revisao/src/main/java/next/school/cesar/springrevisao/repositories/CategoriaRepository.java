package next.school.cesar.springrevisao.repositories;

import next.school.cesar.springrevisao.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
