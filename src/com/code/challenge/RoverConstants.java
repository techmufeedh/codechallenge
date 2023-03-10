package com.code.challenge;

import java.util.HashMap;
import java.util.Map;

public class RoverConstants {
	
	private static final char LEFT = 'L';
	private static final char RIGHT = 'R';
	private static final char MOVE = 'M';
	
	static final String SPACE = " ";
	static final String EAST = "E";
	static final String WEST = "W";
	static final String NORTH = "N";
	static final String SOUTH = "S";
	
	static final Map<String,String> DIRECTION_MAP = new HashMap<String, String>() {{
	    put(EAST, EAST);
	    put(WEST, WEST);
	    put(NORTH, NORTH);
	    put(SOUTH, SOUTH);
	}};

}
