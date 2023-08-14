package parking.model;
import java.util.*;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class Proprietario implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_id_proprietario")
    @SequenceGenerator(name = "seq_id_proprietario", sequenceName= "seq_id_proprietario" ,allocationSize = 1)
	private Integer id;
	private String nome;
	private String cognome;
	private String email;
	private String password;
	
	@OneToOne(fetch = FetchType.LAZY )
    @JoinColumn( name = "id_tesserino")
	private Tesserino tesserino;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Tesserino getTesserino() {
		return tesserino;
	}

	public void setTesserino(Tesserino tesserino) {
		this.tesserino = tesserino;
	}
	

	
}
