package parking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Amministrazione {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_id_amministrazione")
    @SequenceGenerator(name = "seq_id_amministrazione", sequenceName = "seq_id_vigile", allocationSize = 1)
	private Integer id;
	

}
