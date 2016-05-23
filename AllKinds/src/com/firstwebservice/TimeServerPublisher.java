package com.firstwebservice;

import javax.xml.ws.Endpoint;

/**
 * This application publishes the web service whose
 * SIB is com.firstwebservice.TimeServerImpl. For now, the
 * service is published at network address 127.0.0.1.,
 * which is localhost, and at port number 9876, as this
 * port is likely available on any desktop machine. The
 * publication path is /firstwebservice, an arbitrary name.
 * 
 * The Endpoint class has an overloaded publish method.
 * In this two-argument version, the first argument is the 
 * publication URL as a string and the second argument is
 * an instance of the service SIB, in this case
 * com.firstwebservice.TimeServerImpl.
 * 
 * The application runs indefinitely, awaiting service requests.
 * It needs to be terminated at the command prompt with Control-C
 * or the equivalent.
 * 
 * Once the application is started, open a browser to the URL	
 * http://127.0.0.1:9876/firstwebservice?wsdl
 * 
 * to view the service contract, WSDL document. This is an
 * easy test to determine whether the service has deployed
 * successfully. If the test succeeds, a client then can be
 * executed against the service.
 * 
 * 
 *
 */
public class TimeServerPublisher {
	
	public static void main(String[] args){
		//1st argument is the publication URL
		//2nd arguument is an SIB interface
		Endpoint.publish("http://127.0.0.1:9876/firstwebservice", new TimeServerImpl());
		
	}
}
