package parking.model;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import java.sql.Timestamp;

@Entity
public class Parcheggio {
    
    @Id
   
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "id_tipoparcheggio")
    private TipoParcheggio tipoParcheggio;
    
    private String targaAuto;
    
    private Timestamp dataInizio;
    private Timestamp dataFine;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public TipoParcheggio getTipoParcheggio() {
		return tipoParcheggio;
	}
	public void setTipoParcheggio(TipoParcheggio tipoParcheggio) {
		this.tipoParcheggio = tipoParcheggio;
	}
	public String getTargaAuto() {
		return targaAuto;
	}
	public void setTargaAuto(String targaAuto) {
		this.targaAuto = targaAuto;
	}
	public Timestamp getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(Timestamp dataInizio) {
		this.dataInizio = dataInizio;
	}
	public Timestamp getDataFine() {
		return dataFine;
	}
	public void setDataFine(Timestamp dataFine) {
		this.dataFine = dataFine;
	}
    
}