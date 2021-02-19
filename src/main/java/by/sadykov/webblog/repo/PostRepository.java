package by.sadykov.webblog.repo;

import by.sadykov.webblog.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {
    Iterable<Post> findAllByTitleLike(String query);
}
