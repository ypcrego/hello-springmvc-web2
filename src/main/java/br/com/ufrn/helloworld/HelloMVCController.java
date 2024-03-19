package br.com.ufrn.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.ufrn.negocio.HelloNegocio;

@Controller
public class HelloMVCController {

	@Autowired
	private HelloNegocio negocio;
	
	@GetMapping("/hellomvc")
	public String greeting(@RequestParam(name="name", required = false) 
	String name, Model model) {
		model.addAttribute("name", negocio.message(name));
		return "hello";
	}
}
