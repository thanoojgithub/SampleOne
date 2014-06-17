
package com.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.Employee;

@XmlRootElement(name = "getEmployeeResponse", namespace = "http://com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmployeeResponse", namespace = "http://com/")
public class GetEmployeeResponse {

    @XmlElement(name = "return", namespace = "")
    private Employee _return;

    /**
     * 
     * @return
     *     returns Employee
     */
    public Employee getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Employee _return) {
        this._return = _return;
    }

}
