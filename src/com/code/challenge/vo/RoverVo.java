package com.code.challenge.vo;

public class RoverVo {

	private int xInitialPos;
	private int yInitialPos;
	private String directionInitial;
	
	private int xCurrentPos;
	private int yCurrentPos;
	private String directionCurrent;
	
	

	public RoverVo(int xInitialPos, int yInitialPos, String directionInitial, int xCurrentPos, int yCurrentPos,
			String directionCurrent) {
		super();
		this.xInitialPos = xInitialPos;
		this.yInitialPos = yInitialPos;
		this.directionInitial = directionInitial;
		this.xCurrentPos = xCurrentPos;
		this.yCurrentPos = yCurrentPos;
		this.directionCurrent = directionCurrent;
	}

	public int getxInitialPos() {
		return xInitialPos;
	}

	public void setxInitialPos(int xInitialPos) {
		this.xInitialPos = xInitialPos;
	}

	public int getyInitialPos() {
		return yInitialPos;
	}

	public void setyInitialPos(int yInitialPos) {
		this.yInitialPos = yInitialPos;
	}

	public String getDirectionInitial() {
		return directionInitial;
	}

	public void setDirectionInitial(String directionInitial) {
		this.directionInitial = directionInitial;
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
		return xCurrentPos + " " + yCurrentPos + " " + directionCurrent;
	}

}
