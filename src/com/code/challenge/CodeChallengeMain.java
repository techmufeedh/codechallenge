package com.code.challenge;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CodeChallengeMain {
	
	public static void main(String[] args) {
		System.out.print("Please enter the input");
		try {
			Scanner scanner = new Scanner(System.in);
			CodeChallengeMain obj = new CodeChallengeMain();
			obj.processTheRovers(scanner);
		} catch (Exception e) {
			System.out.println("Exception in main : "+e.getMessage() +e);
		}
		
	}
	
	private void processTheRovers(Scanner input) throws Exception {
		try {
			int roverCount = 2;
			// Setting rectangular Position
			String diamentionPos = input.nextLine();
			String[] diamentionPosSld = diamentionPos.split("\\s+");
			
			if(diamentionPosSld.length == 2 ) {
				// Setting the initial position of rovers
				
				for(int i= 0; i<roverCount;i++) {
					String postionRover = input.nextLine();
					String instructions = input.nextLine();
					RoverVo roverVo =  RoverUtils.initialRoverPosiPulateRoverVO(postionRover);
					
					processRoverByInstruction(roverVo,instructions,diamentionPosSld);
					System.out.println(roverVo.toString());
				}
					
			}else {
				throw new Exception("Invalid rectangular position are diamentionPosSld!");
			}
			
			//String[][] rectagularPathPos =new String[split[0]][4]
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private void processRoverByInstruction(RoverVo roverVo,String instructions,String[] diamentionPosSld){
		
	}

}
