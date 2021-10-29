package com.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.bean.CurrencyConversion;
import com.myapp.proxy.CurrencyExchangeProxy;

@RestController
//@RequestMapping("/conversion")
public class HelloControllerConversion {

	/*
	 * @Autowired private CurrencyExchangeProxy proxy;
	 * 
	 * @GetMapping("/") public String hello() { return
	 * "currency-conversion DEFAULT"; }
	 * 
	 * @GetMapping("/conversion") public String helloUrl() { return
	 * "currency-conversion URL"; }
	 * 
	 * @GetMapping("/exchange") public String helloExchange() { String defaultPage =
	 * proxy.hello(); return defaultPage + " " + " hello(path=/) "; }
	 * 
	 * @GetMapping("/exchange-url") public String helloExchangeUrl() { String
	 * urlPage = proxy.helloUrl(); return urlPage + " " +
	 * "  helloUrl(path=/exchange) "; }
	 */

}
