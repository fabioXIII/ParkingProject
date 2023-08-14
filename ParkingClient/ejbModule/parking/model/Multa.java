package parking.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Multa {
	 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_id_multe")
    @SequenceGenerator(name = "seq_id_multe", sequenceName = "seq_id_multe", allocationSize = 1)
    private Long id;
    
    private Double importo;
    
    @ManyToOne
    @JoinColumn(name = "id_vigile")
    private Vigile vigile;
    
    @ManyToOne
    @JoinColumn(name = "targa_auto")
    private Automobile automobile;
}
