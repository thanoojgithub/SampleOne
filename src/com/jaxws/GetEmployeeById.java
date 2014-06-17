
package com.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.EmployeeId;

@XmlRootElement(name = "getEmployeeById", namespace = "http://com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmployeeById", namespace = "http://com/")
public class GetEmployeeById {

    @XmlElement(name = "arg0", namespace = "")
    private EmployeeId arg0;

    /**
     * 
     * @return
     *     returns EmployeeId
     */
    public EmployeeId getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(EmployeeId arg0) {
        this.arg0 = arg0;
    }

}
