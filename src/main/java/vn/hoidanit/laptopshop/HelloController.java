package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Hello sdsdsd!";

	}
	@GetMapping("/user")
	public String userPage() {
		return "Hello user!";

	}
	@GetMapping("/admin")
	public String admin() {
		return "Hello admin!";

	}

}
