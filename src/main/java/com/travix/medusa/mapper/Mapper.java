package com.travix.medusa.mapper;

import com.travix.medusa.mapper.impl.CrazyAirMapper;
import com.travix.medusa.mapper.impl.ToughJetMapper;

/**
 * map the request and response format between different suppliers and a consumer class
 * asking data from these suppliers.
 * 
 * @see {@link CrazyAirMapper} and {@link ToughJetMapper} for implementation
 *      details
 * 
 * @author Sonee
 *
 * @param <T>
 * @param <K>
 * @param <P>
 * @param <Q>
 */
public interface Mapper<T, K, P, Q> {

	/**
	 * 
	 * @param request
	 * @return
	 */
	T mapRequest(K request);

	/**
	 * 
	 * @param response
	 * @return
	 */
	P mapResponse(Q response);

}
