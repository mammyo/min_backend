package board.dto;

import java.util.List;

import lombok.Data;

// t_board 테이블에 데이터를 넣고 빼고 할 때 사용할 객체
// --> 테이블의 구조와 동일(또는 유사한) 형태의 자료 구조를 가져야 한다.
@Data
public class BoardDto {
	private int boardIdx;		// board_idx
	private String title; 		// title
	private String contents; 	// contents
	private int hitCnt; 		// hit_cnt		
	private String creatorId;	// creator_id	
	private String createdDatetime;
	private String updaterId;	
	private String updatedDatetime;
	
	// 첨부 파일 정보를 담고 있는 목록
	private List<BoardFileDto> fileInfoList;
}
