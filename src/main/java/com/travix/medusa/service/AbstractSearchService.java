package com.travix.medusa.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.ParameterizedTypeReference;

import com.travix.medusa.mapper.Mapper;

/**
 * 
 * @author Sonee
 *
 * @param <T>
 * @param <K>
 * @param <Q>
 * @param <P>
 */
public abstract class AbstractSearchService<T, K, Q, P> implements SearchService<K, Q> {

	private Mapper<T, K, Q, P> mapper;
	private CollectorService<T, P> collector;
	private String url;

	public AbstractSearchService(Mapper<T, K, Q, P> mapper, CollectorService<T, P> collector, String url) {
		this.mapper = mapper;
		this.collector = collector;
		this.url = url;
	}

	@Override
	public Set<Q> search(K request) throws Exception {

		Set<P> responseSet = collector.collect(mapper.mapRequest(request), url,
				new ParameterizedTypeReference<Set<P>>() {
				});

		Set<Q> results = new HashSet<>();
		responseSet.forEach(response -> results.add(mapper.mapResponse(response)));

		return results;
	}

}
