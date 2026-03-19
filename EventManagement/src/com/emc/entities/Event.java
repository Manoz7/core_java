package com.emc.entities;

public class Event {

	public long id;
	public String name;
	public String description;
	public String startTime;
	public String endTime;
	public boolean started;

//	Parameterized constructors

	public Event(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

}
