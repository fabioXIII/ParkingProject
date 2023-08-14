package parking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Tesserino {
	@Id

	private Integer id ;
	private String tesserino;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTesserino() {
		return tesserino;
	}
	public void setTesserino(String tesserino) {
		this.tesserino = tesserino;
	}

}
