package com.code.challenge;

public class RoverVo {
	
	int xPreviousPos;
	int yPreviousPos;
	String directionPrevious;
	
	int xCurrentPos;
	int yCurrentPos;
	String directionCurrent;
	
	
	public RoverVo(int xPreviousPos, int yPreviousPos, String directionPrevious, int xCurrentPos, int yCurrentPos,
			String directionCurrent) {
		super();
		this.xPreviousPos = xPreviousPos;
		this.yPreviousPos = yPreviousPos;
		this.directionPrevious = directionPrevious;
		this.xCurrentPos = xCurrentPos;
		this.yCurrentPos = yCurrentPos;
		this.directionCurrent = directionCurrent;
	}


	public int getxPreviousPos() {
		return xPreviousPos;
	}


	public void setxPreviousPos(int xPreviousPos) {
		this.xPreviousPos = xPreviousPos;
	}


	public int getyPreviousPos() {
		return yPreviousPos;
	}


	public void setyPreviousPos(int yPreviousPos) {
		this.yPreviousPos = yPreviousPos;
	}


	public String getDirectionPrevious() {
		return directionPrevious;
	}


	public void setDirectionPrevious(String directionPrevious) {
		this.directionPrevious = directionPrevious;
	}


	public int getxCurrentPos() {
		return xCurrentPos;
	}


	public void setxCurrentPos(int xCurrentPos) {
		this.xCurrentPos = xCurrentPos;
	}


	public int getyCurrentPos() {
		return yCurrentPos;
	}


	public void setyCurrentPos(int yCurrentPos) {
		this.yCurrentPos = yCurrentPos;
	}


	public String getDirectionCurrent() {
		return directionCurrent;
	}


	public void setDirectionCurrent(String directionCurrent) {
		this.directionCurrent = directionCurrent;
	}


	@Override
	public String toString() {
		return xCurrentPos +" "+ yCurrentPos +" "+ directionCurrent;
	}
	
	
	
	

	

}
