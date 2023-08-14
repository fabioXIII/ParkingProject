package parking.ejb;
import parking.crud.*;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import parking.model.Multa;
import parking.model.MultaResponse;

/**
 * Session Bean implementation class MultaEJB
 */
@Stateless
@LocalBean
public class MultaEJB implements MultaEJBRemote {
	
	MultaCrud crud = new MultaCrud();

    /**
     * Default constructor. 
     */
    public MultaEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public MultaResponse insertMulta(Multa model) {
		crud.insertMulta(model);
		MultaResponse m= new MultaResponse();
		try {
			m.setData(model);
		} catch (Exception e) {
			m.setErr(e.getMessage());
			m.setErr("001");
		}
		return m;
	}

	
}
