package appscomm.sportData2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String doHello(@RequestParam(value="name",defaultValue="chen",required=true)String name,Model model){
		
		model.addAttribute("name", name);
		return "hello";
	}
	@RequestMapping(value="/test",method=RequestMethod.GET)
	@ResponseBody
	public String dotest(@RequestParam(value="name",defaultValue="chen",required=true)String name){
		
		return "kaixin suibianla meiyou la wadela:"+name;
	}
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String dowelcome(HttpServletRequest request){
		return "welcome";
	}

}
