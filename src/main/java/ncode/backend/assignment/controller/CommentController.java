package ncode.backend.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ncode.backend.assignment.domain.Comment;
import ncode.backend.assignment.repository.CommentRepository;

@RestController
public class CommentController {
	
	private CommentRepository commentRepository;
	
	@Autowired
    public CommentController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
	
	// CREATE
    // 댓글 등록
    @PostMapping(value="/commnet")
    public Comment createComment(@RequestBody Comment comment) {
        return commentRepository.save(new Comment(comment));
    }
    
    // READ
    // 모든 댓글 리스트를 반환
    @GetMapping
    public Iterable<Comment> list() {
        return commentRepository.findAll();
    }
    
    
//    // UPDATE
//    // 해당 ID의 댓글을 수정한 뒤 그 결과를 반환
//    @PutMapping(value = "/{id}")
//    public Comment update(@PathVariable Long id, @RequestParam String content) {
//    	Comment comment = commentRepository.findOne(id);
//    	comment.
//    	return commentRepository.save(comment);
//    }
//    // DELETE
//    // 해당 ID의 댓글을 삭제
//    @DeleteMapping
//    public void delete(@RequestParam Long id) {
//    	commentRepository.delete(id);
//    }
}
