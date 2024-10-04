package br.com.genka.mutationtest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

	@GetMapping(path = "{values}")
	public List<Integer> sort(@PathVariable("values") List<Integer> values) {

		values.sort((value1, value2) -> value1.compareTo(value2));

		return values;
	}
	
}