package cuifua.repository;

import cuifua.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book,Integer>
{
}
