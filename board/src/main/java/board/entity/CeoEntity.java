package board.entity;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ceo_list")
@NoArgsConstructor
@Data
public class CeoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ceoIdx;

	@Column(nullable = false)
	private String busname;


}