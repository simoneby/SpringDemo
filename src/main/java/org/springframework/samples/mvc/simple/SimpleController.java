package org.springframework.samples.mvc.simple;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

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

	@GetMapping("/add/user")
	@ResponseBody
	public String addUser(@RequestParam(name="name") String name, @RequestParam(name="email") String email){
		String requestURL = "http://164.90.213.129:8081/demo/add" + "?" + "name=" + name + "&email=" + email;
        URL wikiRequest = null;
        String response = "Failed to add"  + name + " to database";
        try {
            wikiRequest = new URL(requestURL);
            URLConnection connection = wikiRequest.openConnection();
            connection.setDoOutput(true);
            Scanner scanner = new Scanner(wikiRequest.openStream());
            response = scanner.useDelimiter("\\Z").next();
            scanner.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Saved or not saved?: " + response;
	}
	{

	}
}



