package in.sbms.rset;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/")
	public String welcomeMsg() {
		return "WELCOME TO BIHAR";
	}

}
