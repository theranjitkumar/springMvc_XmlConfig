package springMvc_XmlConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class HomeController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("message", "Spring MVC XML Config Example");
        System.out.println("home");
        return "index";
    }
    
    @RequestMapping(path="/about", method = RequestMethod.GET)
    public ModelAndView about( ModelAndView mv) {
    	mv.setViewName("about");
    	mv.addObject("message", "Spring MVC XML Config Example");
    	System.out.println("about");
    	return mv;
    	
    }

}
