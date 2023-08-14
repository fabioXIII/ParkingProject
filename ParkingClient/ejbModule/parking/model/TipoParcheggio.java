package parking.model;

import javax.persistence.*;
@Entity
public class TipoParcheggio {
	
	
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_id_automobile")
//    @SequenceGenerator(name = "seq_id_automobile" ,sequenceName= "seq_id_automobile" ,allocationSize = 1)
	private Integer id;
	private String tipoParcheggio;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipoParcheggio() {
		return tipoParcheggio;
	}
	public void setTipoParcheggio(String tipoParcheggio) {
		this.tipoParcheggio = tipoParcheggio;
	}

}
