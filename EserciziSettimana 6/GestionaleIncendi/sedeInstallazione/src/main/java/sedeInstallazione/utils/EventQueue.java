package sedeInstallazione.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import sedeInstallazione.entities.SensorRe;

@Component
public class EventQueue {
	
	 private List<SensorRe> eventList;

	    public EventQueue() {
	        eventList = new ArrayList<>();
	    }

	    public void addEvent(SensorRe event) {
	        eventList.add(event);
	    }

	    public SensorRe removeEvent() {
	        if (!eventList.isEmpty()) {
	            return eventList.remove(0);
	        }
	        return null;
	    }

	    public SensorRe peekEvent() {
	        if (!eventList.isEmpty()) {
	            return eventList.get(0);
	        }
	        return null;
	    }

	    public boolean containsEvent(SensorRe event) {
	        return eventList.contains(event);
	    }

	    public boolean isEmpty() {
	        return eventList.isEmpty();
	    }

	    public int size() {
	        return eventList.size();
	    }

	    public void clearEvents() {
	        eventList.clear();
	    }

	    public List<SensorRe> getAllEvents() {
	        return new ArrayList<>(eventList);
	    }

}
