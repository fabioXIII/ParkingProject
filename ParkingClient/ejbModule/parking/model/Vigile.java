package parking.model;


	
	
	import javax.persistence.Entity;

	import javax.persistence.Id;


	@Entity
	public class Vigile {
	    
	    @Id

	    private Integer id;
	    
	    private String nome;
	    
	    private String cognome;
	    
	    private String email;
	    
	    private Double guadagno;
	    
	    private String password; // Aggiunta della colonna "password"

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

		public Double getGuadagno() {
			return guadagno;
		}

		public void setGuadagno(Double guadagno) {
			this.guadagno = guadagno;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	    // Getter e Setter per gli attributi della classe Vigile
      
	}



