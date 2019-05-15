package com.travix.medusa.mapper.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.travix.medusa.domain.BusyFlightsRequest;
import com.travix.medusa.domain.BusyFlightsResponse;
import com.travix.medusa.domain.CrazyAirRequest;
import com.travix.medusa.domain.CrazyAirResponse;
import com.travix.medusa.mapper.Mapper;

/**
 * 
 * @author Sonee
 *
 */
@Component
@Qualifier("crazyAirMapper")
public class CrazyAirMapper
		implements Mapper<CrazyAirRequest, BusyFlightsRequest, BusyFlightsResponse, CrazyAirResponse> {

	@Value("${supplier.name.crazyair}")
	private String crazyAir;

	@Override
	public CrazyAirRequest mapRequest(BusyFlightsRequest request) {

		return CrazyAirRequest.builder().origin(request.getOrigin()).destination(request.getDestination())
				.departureDate(request.getDepartureDate()).returnDate(request.getReturnDate())
				.passengerCount(request.getNumberOfPassengers()).build();
	}

	@Override
	public BusyFlightsResponse mapResponse(CrazyAirResponse response) {

		return BusyFlightsResponse.builder().airline(response.getAirline()).supplier(crazyAir).fare(response.getPrice())
				.departureAirportCode(response.getDepartureAirportCode())
				.destinationAirportCode(response.getDestinationAirportCode()).departureDate(response.getArrivalDate())
				.arrivalDate(response.getArrivalDate()).build();
	}

}
