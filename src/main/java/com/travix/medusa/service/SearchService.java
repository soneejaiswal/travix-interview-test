package com.travix.medusa.service;

import java.util.Set;

/**
 * performs search across all the flight suppliers & consumers
 * 
 * @author Sonee
 *
 * @param <K>
 * @param <Q>
 */
public interface SearchService<K, Q> {

	/**
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	Set<Q> search(K request) throws Exception;

}
