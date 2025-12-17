package in.suraj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.suraj.entity.Book;

@RepositoryRestResource(path="books")
public interface BookRepo extends JpaRepository<Book, Integer> {

}
