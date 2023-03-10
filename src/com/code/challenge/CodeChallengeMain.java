package com.code.challenge;

import java.util.Scanner;

import com.code.challenge.constants.AppConstants;
import com.code.challenge.utils.RoverUtils;
import com.code.challenge.vo.RoverVo;


public class CodeChallengeMain {

	public static void main(String[] args) {
		System.out.println("Please enter the input");
		System.out.print("-----------------------");
		try {
			Scanner scanner = new Scanner(System.in);
			CodeChallengeMain obj = new CodeChallengeMain();
			obj.processTheRovers(scanner);
		} catch (Exception e) {
			System.out.println("Exception in main : " + e.getMessage() + e);
		}

	}
	/*
	 * Processing the 2 Rover data separately and setting the values into Rover object
	 */
	private void processTheRovers(Scanner input) throws Exception {
		try {
			
			// Setting rectangular Position
			String diamentionPos = input.nextLine();
			String[] diamentionPosSld = diamentionPos.split("\\s+");

			if (diamentionPosSld.length == 2) { // Only for 2 Rover data
				// Setting the initial position of rovers
				System.out.println("Result is : - ");
				
				for (int i = 0; i < AppConstants.ROVERCOUNT; i++) {
					String postionRover = input.nextLine();
					String instructions = input.nextLine();
					RoverVo roverVo = RoverUtils.initialRoverPosiPulateRoverVO(postionRover);
					// Process movement of rover
					processRoverByInstruction(roverVo, instructions, diamentionPosSld);
					System.out.println(roverVo.toString());
				}

			} else {
				throw new Exception("Invalid rectangular position are diamentionPosSld!");
			}

		} catch (Exception e) {
			throw new Exception("Exception on processTheRovers " + e.getMessage(), e);
		}
	}
	
	/*
	 * validating the input and processing the movement based on the instruction
	 */
	private void processRoverByInstruction(RoverVo roverVo, String instructions, String[] diamentionPosSld)
			throws Exception {
		if (RoverUtils.validateInitialDiamention(roverVo, diamentionPosSld)) {
			char[] instructionsArray = instructions.toCharArray();
			for (int i = 0; i < instructionsArray.length; i++) {
				switch (instructionsArray[i]) {
				case AppConstants.LEFT:
					RoverUtils.moveLeft(roverVo);
					break;
				case AppConstants.RIGHT:
					RoverUtils.moveRight(roverVo);
					break;
				case AppConstants.MOVE:
					RoverUtils.moveAction(roverVo);
					break;
				default:
					// No action
				}
			}
		} else {
			throw new Exception("Mismatches on rectangular position and initial position of rover. Please validate");
		}
	}

}
