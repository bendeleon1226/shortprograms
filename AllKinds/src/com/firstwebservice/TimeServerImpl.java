package com.firstwebservice;

import java.util.Date;
import javax.jws.WebService;

/**
 * The @WebService property endpointInterface links the
 * SIB (this class) to the SEI (com.firstwebservice.TimeServer).
 * 
 * Note that the method implementation are not annotated
 * as @WebMethods.
 *
 */

@WebService(endpointInterface = "com.firstwebservice.TimeServer")
public class TimeServerImpl implements TimeServer {
	public String getTimeAsString() {
		return new Date().toString();
	}

	public long getTimeAsElapsed() {
		return new Date().getTime();
	}

}
