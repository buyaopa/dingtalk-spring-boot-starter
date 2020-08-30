package com.jaemon.dingtalk.dinger.entity;

import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * PhonesTag
 *
 * @author Jaemon@answer_ljm@163.com
 * @version 2.0
 */
@XmlRootElement(name = "phones")
@Setter
public class PhonesTag {
    private boolean atAll = false;
    private List<PhoneTag> phones;

    @XmlElements(value={@XmlElement(name="phone", type= PhoneTag.class)})
    public List<PhoneTag> getPhones() {
        return phones;
    }

    @XmlAttribute
    public boolean getAtAll() {
        return atAll;
    }
}