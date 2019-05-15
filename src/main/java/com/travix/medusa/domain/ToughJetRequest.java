package com.travix.medusa.domain;

/**
 * 
 * @author Sonee
 *
 */
public class ToughJetRequest {

	private String from;
	private String to;
	private String outboundDate;
	private String inboundDate;
	private int numberOfAdults;

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public String getOutboundDate() {
		return outboundDate;
	}

	public String getInboundDate() {
		return inboundDate;
	}

	public int getNumberOfAdults() {
		return numberOfAdults;
	}

	private ToughJetRequest(String from, String to, String outboundDate, String inboundDate, int numberOfAdults) {
		this.from = from;
		this.to = to;
		this.outboundDate = outboundDate;
		this.inboundDate = inboundDate;
		this.numberOfAdults = numberOfAdults;
	}

	public static ToughJetRequestBuilder builder() {

		return new ToughJetRequestBuilder();
	}

	public static final class ToughJetRequestBuilder {

		private String from;
		private String to;
		private String outboundDate;
		private String inboundDate;
		private int numberOfAdults;

		private ToughJetRequestBuilder() {
		}

		public ToughJetRequestBuilder to(String to) {
			this.to = to;
			return this;
		}

		public ToughJetRequestBuilder from(String from) {
			this.from = from;
			return this;
		}

		public ToughJetRequestBuilder outboundDate(String outboundDate) {
			this.outboundDate = outboundDate;
			return this;
		}

		public ToughJetRequestBuilder inboundDate(String inboundDate) {
			this.inboundDate = inboundDate;
			return this;
		}

		public ToughJetRequestBuilder numberOfAdults(int numberOfAdults) {
			this.numberOfAdults = numberOfAdults;
			return this;
		}

		public ToughJetRequest build() {

			return new ToughJetRequest(from, to, outboundDate, inboundDate, numberOfAdults);

		}

	}
}
