package com.myapp.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.myapp.bean.CurrencyConversion;

//@FeignClient(name="currency-exchange", url="localhost:8000")
@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);

	@GetMapping("/")
	public String hello();

	@GetMapping("/exchange")
	public String helloUrl();

}
