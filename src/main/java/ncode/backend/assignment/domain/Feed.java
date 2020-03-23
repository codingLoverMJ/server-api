package ncode.backend.assignment.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "feed")
@Data
public class Feed {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long feed_id; //feed id
	
	@Column
	private String md_pic; //MD사진
	
	@Column
	private String md_name; //MD이름
	
	@Column
	private String content; //feed 내용
	
	@Column
	private int cmnt_cnt; //comment_cnt(댓글 수)
	
	@Column
	private int like_cnt; //좋아요 수
	
	@Column
	private Date reg_date; //feed 등록일

}
