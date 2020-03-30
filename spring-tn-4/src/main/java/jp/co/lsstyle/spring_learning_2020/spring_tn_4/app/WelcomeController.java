package jp.co.lsstyle.spring_learning_2020.spring_tn_4.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
