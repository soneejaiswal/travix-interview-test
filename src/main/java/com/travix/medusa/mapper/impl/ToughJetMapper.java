package com.travix.medusa.mapper.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.travix.medusa.domain.BusyFlightsRequest;
import com.travix.medusa.domain.BusyFlightsResponse;
import com.travix.medusa.domain.ToughJetRequest;
import com.travix.medusa.domain.ToughJetResponse;
import com.travix.medusa.mapper.Mapper;

/**
 * 
 * @author Sonee
 *
 */
@Component
@Qualifier("toughJetMapper")
public class ToughJetMapper
		implements Mapper<ToughJetRequest, BusyFlightsRequest, BusyFlightsResponse, ToughJetResponse> {

	@Value("${supplier.name.toughjet}")
	private String toughjet;

	@Override
	public ToughJetRequest mapRequest(BusyFlightsRequest request) {

		return ToughJetRequest.builder().from(request.getOrigin()).to(request.getDestination())
				.inboundDate(request.getReturnDate()).outboundDate(request.getDepartureDate())
				.numberOfAdults(request.getNumberOfPassengers()).build();
	}

	@Override
	public BusyFlightsResponse mapResponse(ToughJetResponse response) {
		return BusyFlightsResponse.builder().airline(response.getCarrier()).arrivalDate(response.getInboundDateTime())
				.departureAirportCode(response.getDepartureAirportName()).departureDate(response.getOutboundDateTime())
				.destinationAirportCode(response.getDepartureAirportName()).fare(response.getBasePrice())
				.supplier(toughjet).build();
	}

}
