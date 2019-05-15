package com.travix.medusa.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travix.medusa.domain.ToughJetResponse;

/**
 * dummy controller for tough jet
 * 
 * @author Sonee
 *
 */
@RestController
@RequestMapping(value = "/api/toughjet")
public class ToughJetController {

	@PostMapping
	public ResponseEntity<Set<ToughJetResponse>> readDummyResponse() {
		Set<ToughJetResponse> responseList = new HashSet<>();
		ToughJetResponse response1 = ToughJetResponse.builder().carrier("test1").basePrice(434.87)
				.inboundDateTime("23-08-2019").departureAirportName("AMS").outboundDateTime("30-08-2019")
				.arrivalAirportName("DEL").build();

		ToughJetResponse response2 = ToughJetResponse.builder().carrier("test2").basePrice(434.87)
				.inboundDateTime("23-08-2019").departureAirportName("AMS").outboundDateTime("30-08-2019")
				.arrivalAirportName("HAN").build();

		responseList.add(response1);
		responseList.add(response2);
		return ResponseEntity.ok().body(responseList);
	}

}
