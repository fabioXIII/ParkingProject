package parking.ejb;

import javax.ejb.Remote;
import parking.model.*;

@Remote
public interface ProprietarioEJBRemote {
	
	
	
	public void saluta() ;
	
	public ProprietarioResponse findProprietarioById(Integer id);
		
		
	}


