package parking.service;
import java.util.*;
import parking.ejb.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;




	

	public class Lookup {

		public static void main(String[] args) {
			
			try {			
				Properties props = new Properties();
		        InitialContext ctx;
		        ProprietarioEJBRemote ret=null;
		        props.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.LDAPInitialContextFactory");
		        ctx = new InitialContext(props);
		        ret = (ProprietarioEJBRemote) ctx.lookup("java:global/ParkingEAR/Parking/ProprietarioEJB!parking.ejb.ProprietarioEJBRemote");
		        ret.saluta();
		        
			 } catch (NamingException ex) {
				 
	             ex.printStackTrace();
	          }
		
			}
			
	             
		}


