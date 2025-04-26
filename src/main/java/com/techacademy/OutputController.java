package com.techacademy;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OutputController {
	
	InputController inp = new InputController();
	
	@PostMapping("/output")
	public String Output(@RequestParam("val") String val,Model model) {
		model.addAttribute("val",val);
		
		return "output";
	}
	
	public String getlink(Model model) {
		model.addAttribute("val","0");
		
		return "inp";
	}
	

}
