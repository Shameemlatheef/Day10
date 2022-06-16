package com.abs;

public class SceinceStudent extends Student {
 int physics;
 int maths;
 int chemistry;



	












	public SceinceStudent(int physics, int maths, int chemistry) {
	super();
	this.physics = physics;
	this.maths = maths;
	this.chemistry = chemistry;
}
















	@Override
public float getpercentage() {
	int n=physics;
	int m=maths;
	int c= chemistry;
	return ((n+m+c)/3);
}
}
