package org.springframework.sample.support;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/sample")
public class SampleController {

	@GetMapping(path = "/{value}")
	public Bean get(@PathVariable("value") String value) {
		if (!value.matches("\\w+")) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		} else if ("error".equals(value)) {
			throw new RuntimeException("Manual Error");
		}
		return new Bean(value);
	}

	@ResponseStatus
	@ExceptionHandler(RuntimeException.class)
	public String exceptionHandler(HandlerMethod handlerMethod, Exception exception) {
		return exception.getMessage();
	}
}
