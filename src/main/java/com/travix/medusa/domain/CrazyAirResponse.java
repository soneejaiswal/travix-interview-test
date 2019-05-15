package com.travix.medusa.domain;
/**
 * 
 * @author Sonee
 *
 */
public class CrazyAirResponse {

	private String airline;
	private double price;
	private String cabinclass;
	private String departureAirportCode;
	private String destinationAirportCode;
	private String departureDate;
	private String arrivalDate;

	private CrazyAirResponse(String airline, double price, String cabinclass, String departureAirportCode,
			String destinationAirportCode, String departureDate, String arrivalDate) {
		this.airline = airline;
		this.price = price;
		this.cabinclass = cabinclass;
		this.departureAirportCode = departureAirportCode;
		this.destinationAirportCode = departureAirportCode;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;

	}

	public static CrazyAirResponseBuilder builder() {
		return new CrazyAirResponseBuilder();
	}

	public String getAirline() {
		return airline;
	}

	public double getPrice() {
		return price;
	}

	public String getCabinclass() {
		return cabinclass;
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

	public static final class CrazyAirResponseBuilder {
		private String airline;
		private double price;
		private String cabinclass;
		private String departureAirportCode;
		private String destinationAirportCode;
		private String departureDate;
		private String arrivalDate;

		private CrazyAirResponseBuilder() {

		}

		public CrazyAirResponseBuilder airline(String airline) {
			this.airline = airline;
			return this;
		}

		public CrazyAirResponseBuilder price(double price) {
			this.price = price;
			return this;
		}

		public CrazyAirResponseBuilder cabinclass(String cabinclass) {
			this.cabinclass = cabinclass;
			return this;
		}

		public CrazyAirResponseBuilder departureAirportCode(String departureAirportCode) {
			this.departureAirportCode = departureAirportCode;
			return this;
		}

		public CrazyAirResponseBuilder destinationAirportCode(String destinationAirportCode) {
			this.destinationAirportCode = destinationAirportCode;
			return this;
		}

		public CrazyAirResponseBuilder departureDate(String departureDate) {
			this.departureDate = departureDate;
			return this;
		}

		public CrazyAirResponseBuilder arrivalDate(String arrivalDate) {
			this.arrivalDate = arrivalDate;
			return this;
		}

		public CrazyAirResponse build() {
			return new CrazyAirResponse(airline, price, cabinclass, departureAirportCode, destinationAirportCode,
					departureDate, arrivalDate);
		}

	}
}
