package parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import parking.service.ProprietarioService;

@Controller
@RequestMapping(value="/proprietario")
public class ProprietarioController {
	
	
	@Autowired
	private ProprietarioService proprietarioService;
	
	@RequestMapping(path="/saluta" ,method= RequestMethod.GET)
	public void saluta() {
		proprietarioService.saluta();
		
		
	}
	
	

}
