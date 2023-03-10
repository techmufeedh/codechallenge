package com.code.challenge.constants;

import java.util.HashMap;
import java.util.Map;

public interface AppConstants {
	
	static final int ROVERCOUNT = 2;
	
	static final char LEFT = 'L';
	static final char RIGHT = 'R';
	static final char MOVE = 'M';
	
	static final String SPACE = " ";
	static final String NORTH = "N";
	static final String EAST = "E";
	static final String WEST = "W";
	static final String SOUTH = "S";
	
	static final Map<String,String> DIRECTION_MAP = new HashMap<String, String>() {{
	    put(EAST, EAST);
	    put(WEST, WEST);
	    put(NORTH, NORTH);
	    put(SOUTH, SOUTH);
	}};

}
