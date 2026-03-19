package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;
import com.emc.entities.Participant;
import com.emc.entities.Venue;

public class Test {

	public static void main(String[] args) {

		Organizer organizer = new Organizer();
		organizer.id = 1525l;
		organizer.name = "Java Programmer";

		System.out.println("Id: " + organizer.id);
		System.out.println("Name: " + organizer.name);

		System.out.println();

//		Event event = new Event();
//		event.id = 15555l;
//		event.name = "Java Session";
//		event.description = "Attend for the certification.";
//		event.startTime = "March 16 2026";
//		event.endTime = "March 17 2026";
//		event.started = false;
		
		Event event = new Event(155l, "Java Session", "Seminar");

		System.out.println("Event Id: " + event.id);
		System.out.println("Event Name: " + event.name);

		Venue venue = new Venue();
		venue.id = 101l;
		venue.name = "Party Palace";

		System.out.println();
		System.out.println("Id: " + venue.id);
		System.out.println("Name: " + venue.name);

		Participant part = new Participant();
		part.id = 666l;
		part.name = "John Cena";
		part.email = "youcantseeme@gmail.com";
		part.checkedIn = true;

		System.out.println();
		System.out.println("Id: " + part.id);
		System.out.println("Name: " + part.name);
		System.out.println("Email Address: " + part.email);
	}

}
