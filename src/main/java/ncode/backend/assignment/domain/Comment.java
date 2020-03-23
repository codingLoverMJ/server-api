package ncode.backend.assignment.domain;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "commnet")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long c_no; //comment_number(댓글 고유번호)
	
	@Column
	private String user_id; //사용자 id
	
	@Column
	private String feed_id; //Feed table의 feed_id 참조
	
	@Column
	private String cmnt_content; //댓글 내용
	
	@Column
	@CreatedDate
	private Date reg_date; //댓글 등록일
	
	public Comment (Comment comment) {
		this.c_no = comment.c_no;
		this.user_id = comment.user_id;
		this.feed_id = comment.feed_id;
		this.cmnt_content = comment.cmnt_content;
		this.reg_date = comment.reg_date;
	}

}
