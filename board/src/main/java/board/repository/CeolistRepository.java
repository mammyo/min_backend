package board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import board.entity.CeoEntity;

public interface CeolistRepository extends CrudRepository<CeoEntity, Integer> {
	
	List<CeoEntity> findAllByOrderByCeoIdxDesc();

}