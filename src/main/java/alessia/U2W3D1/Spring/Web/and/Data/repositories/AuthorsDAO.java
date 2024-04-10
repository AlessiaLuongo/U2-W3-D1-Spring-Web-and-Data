package alessia.U2W3D1.Spring.Web.and.Data.repositories;

import alessia.U2W3D1.Spring.Web.and.Data.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorsDAO extends JpaRepository<Author, Integer> {

}
