package com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "customerService")
public interface ICustomerService {

	@WebMethod(operationName = "getCustomer")
	@WebResult(targetNamespace = "http://com", name = "customer")
	public Customer getCustomer(@WebParam(name = "cId") int cId);

	@WebMethod(operationName = "getCustomerList")
	@WebResult(targetNamespace = "http://com", name = "customerList")
	public CustomerList getCustomerList();

}
