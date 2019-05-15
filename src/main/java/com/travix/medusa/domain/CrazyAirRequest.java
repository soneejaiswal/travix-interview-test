package com.travix.medusa.domain;

/**
 * 
 * @author Sonee
 *
 */
public class CrazyAirRequest {

	private String origin;
	private String destination;
	private String departureDate;
	private String returnDate;
	private int passengerCount;

	private CrazyAirRequest(String origin, String destination, String departureDate, String returnDate,
			int passengerCount) {

		this.origin = origin;
		this.destination = destination;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.passengerCount = passengerCount;

	}

	public static CrazyAirRequestBuilder builder() {
		return new CrazyAirRequestBuilder();
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public final static class CrazyAirRequestBuilder {

		private String origin;
		private String destination;
		private String departureDate;
		private String returnDate;
		private int passengerCount;

		private CrazyAirRequestBuilder() {
		}

		public CrazyAirRequestBuilder origin(String origin) {
			this.origin = origin;
			return this;
		}

		public CrazyAirRequestBuilder destination(String destination) {
			this.destination = destination;
			return this;
		}

		public CrazyAirRequestBuilder departureDate(String departureDate) {
			this.departureDate = departureDate;
			return this;
		}

		public CrazyAirRequestBuilder returnDate(String returnDate) {
			this.returnDate = returnDate;
			return this;
		}

		public CrazyAirRequestBuilder passengerCount(int passengerCount) {
			this.passengerCount = passengerCount;
			return this;
		}

		public CrazyAirRequest build() {
			return new CrazyAirRequest(origin, destination, departureDate, returnDate, passengerCount);
		}

	}
}
