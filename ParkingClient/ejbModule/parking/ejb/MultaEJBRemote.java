package parking.ejb;

import javax.ejb.Remote;

import parking.model.Multa;
import parking.model.MultaResponse;

@Remote
public interface MultaEJBRemote {
	
	public MultaResponse insertMulta(Multa model);


}
