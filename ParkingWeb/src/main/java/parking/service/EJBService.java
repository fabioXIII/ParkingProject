package parking.service;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EJBService <T> {

	private T getRemote(String jndi) throws NamingException {
		Properties props = new Properties();
        InitialContext ctx;
        T ret=null;
        props.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
     
        ctx = new InitialContext(props);
           

        ret = (T)ctx.lookup(jndi);
             
             
              
        return ret;
		
		
	}
	public T getProprietarioEJBRemote() throws NamingException {
		return getRemote("java:global/ParkingEAR/Parking/ProprietarioEJB!parking.ejb.ProprietarioEJBRemote");
		
	}
	
	public T getMultaEJBRemote() throws NamingException{
		return getRemote("java:global/ParkingEAR/Parking/MultaEJB!parking.ejb.MultaEJBRemote");
	}
}



