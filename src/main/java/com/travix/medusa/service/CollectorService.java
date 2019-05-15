package com.travix.medusa.service;

import java.util.Set;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * collects response from suppliers
 * 
 * @author Sonee
 *
 * @param <K>
 * @param <Q>
 */
@Component
public class CollectorService<K, Q> {

	/**
	 * 
	 * @param t
	 * @param url
	 * @param reference
	 * @return
	 * @throws Exception
	 */
	public Set<Q> collect(K t, String url, ParameterizedTypeReference<Set<Q>> reference) throws Exception {

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Set<Q>> responseEntity = restTemplate.exchange(url, HttpMethod.POST, new HttpEntity<>(t),
				reference);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			return responseEntity.getBody();
		} else {
			String exceptionMessage = "Oops something went wrong on url: " + url + " with status code: "
					+ responseEntity.getStatusCode().value();
			throw new Exception(exceptionMessage);
		}
	}
}
