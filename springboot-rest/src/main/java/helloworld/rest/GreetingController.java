package helloworld.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@PostMapping(value = "/greeting", consumes="application/json", produces = "application/json")
	@ResponseBody
	public GreetingResponse greeting(@RequestBody Greeting greeting) {
		return new GreetingResponse("Hello, " + greeting.getName());
	}
}
