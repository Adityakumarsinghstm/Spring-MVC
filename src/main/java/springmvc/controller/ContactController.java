package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String showContact() {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password, Model model)
	{

//		System.out.println("User name is :" + name);
//		System.out.println("User email is :" + email);
//		System.out.println("User password is :" + password);
		model.addAttribute("name",name);
		model.addAttribute("email",email);
		model.addAttribute("password",password);

		return "success";
	}
}
