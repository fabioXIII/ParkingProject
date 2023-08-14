package parking.controller;

import javax.naming.NamingException;
import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import parking.model.*;
import parking.service.MultaService;

@Controller
@RequestMapping(value= "/multa")
public class MultaController {
	
    @Autowired
	private MultaService multaService;
    
    @RequestMapping(value="/showForm" ,method = RequestMethod.GET )
    public String showForm() {
		return "insertMulta";
    	
    }
    
    @RequestMapping(value= "/insertMulta", method = RequestMethod.POST)
    public String insertMulta(Multa model) {
    	MultaResponse m = new MultaResponse();
		try {
		     	m= multaService.insertMulta(model)
;
		} catch (NamingException e) {
			m.setErr(e.getMessage());
			m.setErr_code("001");
			e.printStackTrace();
		}
		return "redirect:/multa/showForm";
    	
    }
	
}
