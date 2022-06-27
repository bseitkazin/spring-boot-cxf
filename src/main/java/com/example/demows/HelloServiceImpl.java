package com.example.demows;

import javax.jws.WebService;

@WebService(
		serviceName = "Hello",
		portName = "HelloPort",
		targetNamespace = "http://service.ws.sample/",
		endpointInterface = "com.example.demows.HelloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		
		return "Hello " + name;
	}

}
