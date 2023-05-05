package springmvc.controller;




import java.awt.Dialog.ModalExclusionType;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is help controller");
		
		//Creating the object of modal and view
		ModelAndView modelAndView = new ModelAndView();
		//Setting objects in modal and view object
		modelAndView.addObject("name","Raghunath");
		modelAndView.addObject("rollno",4564);
	    LocalDateTime time = LocalDateTime.now();
	    modelAndView.addObject("time",time);
	    
	    List<Integer> list = new ArrayList<Integer>();
	    list.add(345);
	    list.add(349);
	    list.add(876);
	    list.add(879);
	    list.add(878);
	    modelAndView.addObject("marks",list);
		//Setting the view page
		modelAndView.setViewName("help");
		//Returning modal and view object
		return modelAndView;
	}
}
