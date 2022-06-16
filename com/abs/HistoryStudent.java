package com.abs;

public class HistoryStudent extends Student{
int history;
int civics;


	
	











	public HistoryStudent(int history, int civics) {
	super();
	this.history = history;
	this.civics = civics;
}















	@Override
	public float getpercentage() {
		return ((history+civics)/2);
	}

}
