package parking.ejb;

import javax.ejb.LocalBean;
import parking.crud.*;
import javax.ejb.Stateless;

import parking.model.ProprietarioResponse;

/**
 * Session Bean implementation class ProprietarioEJB
 */
@Stateless
@LocalBean
public class ProprietarioEJB implements ProprietarioEJBRemote {

	ProprietarioCrud  crud = new ProprietarioCrud();
    /**
     * Default constructor. 
     */
    public ProprietarioEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void saluta() {
		// TODO Auto-generated method stub
		System.out.println("ciao");
		
	}

	@Override
	public ProprietarioResponse findProprietarioById(Integer id ) {
		ProprietarioResponse p = new ProprietarioResponse();

	try{
		p.setData(crud.findProprietarioById(id));
		
	}catch(Exception e ) {
		p.setErr(e.getMessage());
		p.setErr_code("ERR0RE001");
				
	}
		
		
		return p;
	}

}
