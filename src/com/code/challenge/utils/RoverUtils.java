package com.code.challenge.utils;

import java.util.Arrays;

import com.code.challenge.vo.RoverVo;
import com.code.challenge.constants.AppConstants;

public class RoverUtils {

	public static RoverVo initialRoverPosiPulateRoverVO(String postionRover) {
		String[] positionSplit = postionRover.split("\\s+");
		int x = Integer.parseInt(positionSplit[0]);
		int y = Integer.parseInt(positionSplit[1]);
		String direction = positionSplit[2];
		return new RoverVo(x, y, direction, x, y, direction);
	}

	public static boolean validateInitialDiamention(RoverVo roverVo,String[] diamentionPosSld){
		int xMax=Integer.valueOf(diamentionPosSld[0]);
		int yMax=Integer.valueOf(diamentionPosSld[1]);
		
		int xPos = roverVo.getxInitialPos();
		int yPos = roverVo.getyInitialPos();
		
		if(xMax >=xPos && xPos >=0  && yMax >= yPos && yPos >=0 && validateDirection(roverVo.getDirectionInitial())) {
			return true;
		}else {
			return false;
		}
			
	}
	
	public static boolean validateDirection(String value){
		String[] directions = {AppConstants.NORTH, AppConstants.EAST, AppConstants.WEST, AppConstants.SOUTH};
		if(Arrays.asList(directions).contains(value)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void moveLeft(RoverVo roverVo) {
		String direction = roverVo.getDirectionCurrent();
		switch(direction) {
			case AppConstants.NORTH:
				roverVo.setDirectionCurrent(AppConstants.WEST);
				break;
			case AppConstants.WEST:
				roverVo.setDirectionCurrent(AppConstants.SOUTH);
				break;
			case AppConstants.SOUTH:
				roverVo.setDirectionCurrent(AppConstants.EAST);
				break;
			default:
				roverVo.setDirectionCurrent(AppConstants.NORTH);
		}
	}
	
	public static void moveRight(RoverVo roverVo) {
		String direction = roverVo.getDirectionCurrent();
		switch(direction) {
			case AppConstants.NORTH:
				roverVo.setDirectionCurrent(AppConstants.EAST);
				break;
			case AppConstants.EAST:
				roverVo.setDirectionCurrent(AppConstants.SOUTH);
				break;
			case AppConstants.SOUTH:
				roverVo.setDirectionCurrent(AppConstants.WEST);
				break;
			default:
				roverVo.setDirectionCurrent(AppConstants.NORTH);
		}
	}

	
	public static void moveAction(RoverVo roverVo) {
		String direction = roverVo.getDirectionCurrent();

		if (direction.equals("N")) {
			roverVo.setyCurrentPos(roverVo.getyCurrentPos() +1);
			//yPosTemp = yPosTemp + 1;
		} else if (direction.equals("E")) {
			roverVo.setxCurrentPos(roverVo.getxCurrentPos() +1);
			//xPosTemp = xPosTemp + 1;
		} else if (direction.equals("S")) {
			roverVo.setyCurrentPos(roverVo.getyCurrentPos() -1);
			//yPosTemp = yPosTemp - 1;
		} else if (direction.equals("W")) {
			roverVo.setxCurrentPos(roverVo.getxCurrentPos() -1);
			//xPosTemp = xPosTemp - 1;
		}

	}

}
