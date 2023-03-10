# codechallenge
Cognizant code challenges

# Explanation (Code algorithm) 

1. Considering only 5 line of input
    1 line -> The first line of input is the upper-right coordinates of the plateau
    2 line -> Starting position of Rover 1
    3 line -> Movement requested for the Rover 1
    4 line -> Starting position of Rover 2
    5 line -> Movement requested for the Rover 2
2. Setting the diamention of plateau.
3. Processing each Rover data separately into RoverVo object and processing on each and setting the current position after each movements of the rover into the same object
4. Printing the value after processing each Rover.


# Input Tested
----------------------------
Test Input:
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM

Expected Output: Verified
1 3 N
5 1 E
---------------------------

Test Input:
6 6
3 4 w
LMML
4 2 S
LLMMR

Expected Output: Verified
3 2 E
4 3 E

---------------------------

