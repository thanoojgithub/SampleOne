
package com.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.Customer;

@XmlRootElement(name = "getCustomerResponse", namespace = "http://com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerResponse", namespace = "http://com/")
public class GetCustomerResponse {

    @XmlElement(name = "return", namespace = "")
    private Customer _return;

    /**
     * 
     * @return
     *     returns Customer
     */
    public Customer getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Customer _return) {
        this._return = _return;
    }

}
