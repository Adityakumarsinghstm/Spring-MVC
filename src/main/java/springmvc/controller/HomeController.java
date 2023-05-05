package springmvc.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model )
	{
		model.addAttribute("name", "Aditya kumar");
		model.addAttribute("id",3432);
		List<String> friend = new ArrayList<String>();
		friend.add("Rohit");
		friend.add("Ankit");
	    friend.add("Manish");
	    model.addAttribute("friends",friend);
		System.out.println("This is home url");
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about url");
		return "about";
	}
}
