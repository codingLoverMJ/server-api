package ncode.backend.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ncode.backend.assignment.domain.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{
	Comment findOne(Long id);
}

//CrudRepository 와 JpaRepository의 차이점은?
