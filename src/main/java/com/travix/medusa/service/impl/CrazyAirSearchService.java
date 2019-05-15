package com.travix.medusa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.travix.medusa.mapper.Mapper;
import com.travix.medusa.service.AbstractSearchService;
import com.travix.medusa.service.CollectorService;
/**
 * 
 * @author Sonee
 *
 * @param <CrazyAirRequest>
 * @param <K>
 * @param <Q>
 * @param <CrazyAirResponse>
 */
@Service
@SuppressWarnings("unused")
public class CrazyAirSearchService<CrazyAirRequest, K, Q, CrazyAirResponse>
		extends AbstractSearchService<CrazyAirRequest, K, Q, CrazyAirResponse> {

	private Mapper<CrazyAirRequest, K, Q, CrazyAirResponse> mapper;
	private CollectorService<CrazyAirRequest, CrazyAirResponse> collector;
	private String url;

	@Autowired
	public CrazyAirSearchService(@Qualifier("crazyAirMapper") Mapper<CrazyAirRequest, K, Q, CrazyAirResponse> mapper,
			CollectorService<CrazyAirRequest, CrazyAirResponse> collector,
			@Value("${supplier.url.crazyair}") String url) {
		super(mapper, collector, url);
		this.mapper = mapper;
		this.collector = collector;
		this.url = url;
	}

}
