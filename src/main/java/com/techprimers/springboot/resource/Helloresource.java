package com.techprimers.springboot.resource;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "Helloworld Resource", description = "Shows the helloWorld")

public class Helloresource {
	@ApiOperation(value = "return hello World ")
	@ApiResponses(value = { @ApiResponse(code = 100, message = "100 is the message"),
			@ApiResponse(code = 300, message = "Successfull Helloworld") })
	@GetMapping
	public String hello() {
		return "Hello World";
	}

	@ApiOperation(value = "Return hello ")
	@PostMapping("/post")
	public String helloAdd(@RequestBody final String hello) {
		return hello;
	}

	@ApiOperation(value = "Return hello")
	@PutMapping("/put")
	public String helloPut(@RequestBody final String hello) {

		return hello;

	}

}
