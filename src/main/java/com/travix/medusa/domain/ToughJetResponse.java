package com.travix.medusa.domain;

/**
 * 
 * @author Sonee
 *
 */
public class ToughJetResponse {

	private String carrier;
	private double basePrice;
	private double tax;
	private double discount;
	private String departureAirportName;
	private String arrivalAirportName;
	private String outboundDateTime;
	private String inboundDateTime;

	private ToughJetResponse(String carrier, double basePrice, double tax, double discount, String departureAirportName,
			String arrivalAirportName, String outboundDateTime, String inboundDateTime) {
		this.carrier = carrier;
		this.basePrice = basePrice;
		this.tax = tax;
		this.discount = discount;
		this.departureAirportName = departureAirportName;
		this.arrivalAirportName = arrivalAirportName;
		this.outboundDateTime = outboundDateTime;
		this.inboundDateTime = inboundDateTime;

	}

	public static ToughJetResponseBuilder builder() {
		return new ToughJetResponseBuilder();
	}

	public String getCarrier() {
		return carrier;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public double getTax() {
		return tax;
	}

	public double getDiscount() {
		return discount;
	}

	public String getDepartureAirportName() {
		return departureAirportName;
	}

	public String getArrivalAirportName() {
		return arrivalAirportName;
	}

	public String getOutboundDateTime() {
		return outboundDateTime;
	}

	public String getInboundDateTime() {
		return inboundDateTime;
	}

	public static final class ToughJetResponseBuilder {
		private String carrier;
		private double basePrice;
		private double tax;
		private double discount;
		private String departureAirportName;
		private String arrivalAirportName;
		private String outboundDateTime;
		private String inboundDateTime;

		private ToughJetResponseBuilder() {

		}

		public ToughJetResponseBuilder carrier(String carrier) {
			this.carrier = carrier;
			return this;
		}

		public ToughJetResponseBuilder basePrice(double basePrice) {
			this.basePrice = basePrice;
			return this;
		}

		public ToughJetResponseBuilder tax(double tax) {
			this.tax = tax;
			return this;
		}

		public ToughJetResponseBuilder discount(double discount) {
			this.discount = discount;
			return this;
		}

		public ToughJetResponseBuilder departureAirportName(String departureAirportName) {
			this.departureAirportName = departureAirportName;
			return this;
		}

		public ToughJetResponseBuilder arrivalAirportName(String arrivalAirportName) {
			this.arrivalAirportName = arrivalAirportName;
			return this;
		}

		public ToughJetResponseBuilder outboundDateTime(String outboundDateTime) {
			this.outboundDateTime = outboundDateTime;
			return this;
		}

		public ToughJetResponseBuilder inboundDateTime(String inboundDateTime) {
			this.inboundDateTime = inboundDateTime;
			return this;
		}

		public ToughJetResponse build() {
			return new ToughJetResponse(carrier, basePrice, tax, discount, departureAirportName, arrivalAirportName,
					outboundDateTime, inboundDateTime);
		}
	}
}
