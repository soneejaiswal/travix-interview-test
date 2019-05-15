package com.travix.medusa.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travix.medusa.domain.CrazyAirResponse;

/**
 * Dummy controller for crazy air
 * 
 * @author Sonee
 *
 */
@RestController
@RequestMapping(value = "/api/crazyair")
public class CrazyAirController {

	@PostMapping
	public ResponseEntity<Set<CrazyAirResponse>> readDummyResponse() {
		Set<CrazyAirResponse> responseList = new HashSet<>();
		CrazyAirResponse response1 = CrazyAirResponse.builder().airline("test").arrivalDate("23-08-2019")
				.cabinclass("E").departureAirportCode("AMS").departureDate("30-08-2019").destinationAirportCode("DEL")
				.price(300.65).build();

		CrazyAirResponse response2 = CrazyAirResponse.builder().airline("test*").arrivalDate("23-08-2019")
				.cabinclass("E").departureAirportCode("AMS").departureDate("30-08-2019").destinationAirportCode("HAN")
				.price(300.65).build();

		responseList.add(response1);
		responseList.add(response2);
		return ResponseEntity.ok().body(responseList);
	}
}
