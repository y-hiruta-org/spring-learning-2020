package jp.co.lsstyle.spring_learning_2020.spring_tn_4.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("echo")
public class EchoController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewInput(Model model) {

		EchoForm form = new EchoForm();
		model.addAttribute(form);
		return "echo/input";

	}

}
