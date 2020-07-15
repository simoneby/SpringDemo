package org.springframework.samples.mvc.simple;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

//	@GetMapping("/simple")
//	public String simple() {
//		return "Hello world!";
//	}

	@GetMapping("/simple")
		public String simple() {
			return  Ping.sendRequest();
		}
	}

