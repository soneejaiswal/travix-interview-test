package com.travix.medusa.domain;

/**
 * 
 * @author Sonee
 *
 */
public class BusyFlightsResponse {

	private String airline;
	private String supplier;
	private double fare;
	private String departureAirportCode;
	private String destinationAirportCode;
	private String departureDate;
	private String arrivalDate;

	private BusyFlightsResponse(String airline, String supplier, double fare, String departureAirportCode,
			String destinationAirportCode, String departureDate, String arrivalDate) {
		this.airline = airline;
		this.supplier = supplier;
		this.fare = fare;
		this.departureAirportCode = departureAirportCode;
		this.destinationAirportCode = departureAirportCode;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
	}

	public static BusyFlightsResponseBuilder builder() {
		return new BusyFlightsResponseBuilder();
	}

	public String getAirline() {
		return airline;
	}

	public String getSupplier() {
		return supplier;
	}

	public double getFare() {
		return fare;
	}

	public String getDepartureAirportCode() {
		return departureAirportCode;
	}

	public String getDestinationAirportCode() {
		return destinationAirportCode;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public static class BusyFlightsResponseBuilder {

		private String airline;
		private String supplier;
		private double fare;
		private String departureAirportCode;
		private String destinationAirportCode;
		private String departureDate;
		private String arrivalDate;

		private BusyFlightsResponseBuilder() {
		}
		
		public BusyFlightsResponseBuilder airline(String airline) {
			this.airline = airline;
			return this;
		}
		
		public BusyFlightsResponseBuilder supplier(String supplier) {
			this.supplier = supplier;
			return this;
		}

		public BusyFlightsResponseBuilder fare(double fare) {
			this.fare = fare;
			return this;
		}

		public BusyFlightsResponseBuilder departureAirportCode(String departureAirportCode) {
			this.departureAirportCode = departureAirportCode;
			return this;
		}

		public BusyFlightsResponseBuilder destinationAirportCode(String destinationAirportCode) {
			this.destinationAirportCode = destinationAirportCode;
			return this;
		}

		public BusyFlightsResponseBuilder departureDate(String departureDate) {
			this.departureDate = departureDate;
			return this;
		}

		public BusyFlightsResponseBuilder arrivalDate(String arrivalDate) {
			this.arrivalDate = arrivalDate;
			return this;
		}



		public BusyFlightsResponse build() {
			return new BusyFlightsResponse(airline, supplier, fare, departureAirportCode, destinationAirportCode,
					departureDate, arrivalDate);
		}

	}

}
