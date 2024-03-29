package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void addCommonData(Model m)
	{
		m.addAttribute("Header","LearnCodeWith Aadi");
		m.addAttribute("Desc","Home for Programmer");
	}
	@RequestMapping("/contact")
	public String showContact(Model model) {
		
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user , Model model)
	{
		if(user.getName().isBlank())
		{
			return "redirect:/contact";
		}
	   int createdUser = this.userService.createUser(user);
	   model.addAttribute("msg","User created with id "+createdUser);
		return "success";
	}
}


/*
 * 
 * By Using @RequestParam Annotation
 * 
 * 
 * @RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password, Model model)
	{
		
		User user = new User();
		user.setName( name);
		user.setEmail(email);
		user.setPassword(password);

//		System.out.println("User name is :" + name);
//		System.out.println("User email is :" + email);
//		System.out.println("User password is :" + password);
//		model.addAttribute("name",name);
//		model.addAttribute("email",email);
//		model.addAttribute("password",password);
		
		model.addAttribute("user",user);

		return "success";
	}
 * */
