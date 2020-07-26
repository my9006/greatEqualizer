package com.example.calcuta;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {

	@RequestMapping(value = "/sum", method = RequestMethod.GET)
	public ResponseEntity<String> sum(@RequestParam Integer nifnif, @RequestParam Integer nafnaf, @RequestParam Integer nufnuf) {
		int sum = nifnif + nafnaf + nufnuf;
		return ResponseEntity.ok("Pork amount is" + sum);
	}

	@RequestMapping(value = "/subtract", method = RequestMethod.GET)
	public ResponseEntity<String> subtract(@RequestParam Integer nifnif, @RequestParam Integer nafnaf, @RequestParam Integer nufnuf) {
		int subtract = nifnif - nafnaf - nufnuf;
		return ResponseEntity.ok("Pork deficite is" + subtract);
	}

	@GetMapping("/multiply/{num1}/{num2}")
	public ResponseEntity<Integer> multiply(@PathVariable("num1") int multiplicand, @PathVariable("num2") int multiplier) {
		return ResponseEntity.ok(multiplicand * multiplier);
	}

	@GetMapping("/divide/{num1}/{num2}")
	public ResponseEntity<Float> divide(@PathVariable("num1") int dident, @PathVariable("num2") int divisor) {
		return ResponseEntity.ok((float) dident / divisor);
	}
}