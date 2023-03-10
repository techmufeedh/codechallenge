package com.code.challenge;

public class RoverUtils {
	
	public static RoverVo initialRoverPosiPulateRoverVO(String postionRover){
		String[] positionSplit=postionRover.split("\\s+");
		int x = Integer.parseInt(positionSplit[0]);
		int y = Integer.parseInt(positionSplit[1]);
		String direction = positionSplit[2];
		return new RoverVo(x, y, direction, x, y, direction);
	}
	
	public String moveLeft(String direction) {
		if (direction.equals("N")) {
			direction = "W";
		} else if (direction.equals("W")) {
			direction = "S";
		} else if (direction.equals("S")) {
			direction = "E";
		} else
			direction = "N";
		
		return direction;

	}

	public String moveRight(String direction) {

		if (direction.equals("N")) {
			direction = "E";
		} else if (direction.equals("E")) {
			direction = "S";
		} else if (direction.equals("S")) {
			direction = "W";
		} else
			direction = "N";
		
		return direction;

	}
	
	public boolean validateDirection(String directionCurrent) {

		if (directionCurrent.equals("N") || directionCurrent.equals("S") || directionCurrent.equals("E")
				|| directionCurrent.equals("W"))
			return true;
		else
			return false;

	}

}
