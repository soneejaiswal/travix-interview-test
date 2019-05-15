package com.travix.medusa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.travix.medusa.domain.ToughJetRequest;
import com.travix.medusa.domain.ToughJetResponse;
import com.travix.medusa.mapper.Mapper;
import com.travix.medusa.service.AbstractSearchService;
import com.travix.medusa.service.CollectorService;

/**
 * 
 * @author Sonee
 *
 * @param <K>
 * @param <Q>
 */
@Service
@SuppressWarnings("unused")
public class ToughJetSearchService<K, Q> extends AbstractSearchService<ToughJetRequest, K, Q, ToughJetResponse> {

	private Mapper<ToughJetRequest, K, Q, ToughJetResponse> mapper;
	private CollectorService<ToughJetRequest, ToughJetResponse> collector;
	private String url;

	@Autowired
	public ToughJetSearchService(@Qualifier("toughJetMapper") Mapper<ToughJetRequest, K, Q, ToughJetResponse> mapper,
			CollectorService<ToughJetRequest, ToughJetResponse> collector,
			@Value("${supplier.url.toughjet}") String url) {
		super(mapper, collector, url);
		this.mapper = mapper;
		this.collector = collector;
		this.url = url;
	}

}
