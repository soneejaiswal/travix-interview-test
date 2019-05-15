package com.travix.medusa.controller;

import java.util.Set;
import java.util.concurrent.ExecutionException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travix.medusa.domain.BusyFlightsRequest;
import com.travix.medusa.domain.BusyFlightsResponse;
import com.travix.medusa.service.SearchService;

/**
 * Busy flight search controller to fetch flights from the list of suppliers
 * 
 * @author Sonee
 *
 */
@RestController
@RequestMapping("/api/search")
public class BusyFlightSearchController {

	@Autowired
	private SearchService<BusyFlightsRequest, BusyFlightsResponse> busyFlightsService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Set<BusyFlightsResponse>> search(@Valid @RequestBody final BusyFlightsRequest serachRequest,
			BindingResult result) throws ExecutionException, InterruptedException {

		try {
			return ResponseEntity.ok().body(busyFlightsService.search(serachRequest));
		} catch (Exception e) {

			return null;
		}
	}
}
