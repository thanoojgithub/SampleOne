
package com.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.EmployeeList;

@XmlRootElement(name = "getEmployeeListResponse", namespace = "http://com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmployeeListResponse", namespace = "http://com/")
public class GetEmployeeListResponse {

    @XmlElement(name = "return", namespace = "")
    private EmployeeList _return;

    /**
     * 
     * @return
     *     returns EmployeeList
     */
    public EmployeeList getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(EmployeeList _return) {
        this._return = _return;
    }

}
