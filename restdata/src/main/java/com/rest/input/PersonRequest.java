package com.rest.input;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersonRequest {
	Person person1;
	Person person2;
	public Person getPerson1() {
		return person1;
	}
	public void setPerson1(Person person1) {
		this.person1 = person1;
	}
	public Person getPerson2() {
		return person2;
	}
	public void setPerson2(Person person2) {
		this.person2 = person2;
	}
	
}
