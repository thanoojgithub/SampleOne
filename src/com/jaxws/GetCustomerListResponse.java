
package com.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.CustomerList;

@XmlRootElement(name = "getCustomerListResponse", namespace = "http://com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerListResponse", namespace = "http://com/")
public class GetCustomerListResponse {

    @XmlElement(name = "return", namespace = "")
    private CustomerList _return;

    /**
     * 
     * @return
     *     returns CustomerList
     */
    public CustomerList getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(CustomerList _return) {
        this._return = _return;
    }

}
