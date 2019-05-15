package com.travix.medusa.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travix.medusa.domain.BusyFlightsRequest;
import com.travix.medusa.domain.BusyFlightsResponse;
import com.travix.medusa.service.SearchService;

/**
 * 
 * @author Sonee
 *
 */
@Service
public class BusyFlightSearchService implements SearchService<BusyFlightsRequest, BusyFlightsResponse> {

	@Autowired
	private List<SearchService<BusyFlightsRequest, BusyFlightsResponse>> supplierServices;

	@Override
	public Set<BusyFlightsResponse> search(BusyFlightsRequest searchRequest) {

		TreeSet<BusyFlightsResponse> searchResults = new TreeSet<>(
				Comparator.comparingDouble(BusyFlightsResponse::getFare));
		supplierServices.forEach(s -> {
			try {
				searchResults.addAll(s.search(searchRequest));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		return searchResults;
	}
}
