package board.service;

import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import board.entity.BoardEntity;
import board.entity.BoardFileEntity;
import board.entity.CeoEntity;

public interface JpaBoardService {

	List<BoardEntity> selectFavorite() throws Exception;
	List<BoardEntity> selectBoardList() throws Exception; 
	List<CeoEntity> selecCeoList() throws Exception;
	
	BoardEntity selectBoardDetail(int boardIdx) throws Exception;
	
	/*
	void insertBoard(BoardEntity board, MultipartHttpServletRequest request) throws Exception;
	void updateBoard(BoardEntity board) throws Exception;
	*/
	
	// save가 insert와 update 역할을 모두 수행
	void saveCeoEntity(CeoEntity ceoEntity, MultipartHttpServletRequest request) throws Exception;
	
	void saveBoard(BoardEntity board, MultipartHttpServletRequest request) throws Exception;
	
	void deleteBoard(int boardIdx) throws Exception;
	BoardFileEntity selectBoardFileInfo(int idx, int boardIdx) throws Exception;
}