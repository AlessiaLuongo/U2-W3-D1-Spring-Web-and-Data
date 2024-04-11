package alessia.U2W3D1.Spring.Web.and.Data.repositories;

import alessia.U2W3D1.Spring.Web.and.Data.entities.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlogPostDAO extends JpaRepository<BlogPost, Integer>{

}
