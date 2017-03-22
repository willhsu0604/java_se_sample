package com.will.practice;

import java.util.ArrayList;
import java.util.List;

public class MouseMaze {
	
	int[][] maze = null;
	int[] mousePos = null;
	int[] destination = null;
	private int currentDirctionIndex = 0;
	private List<int[]> histories = new ArrayList<>();
	
	public MouseMaze(int[][] maze, int[] mousePos, int[] destination) {
		this.maze = maze;
		this.mousePos = mousePos;
		this.destination = destination;
	}
	
	public void startMove() {
		
		while(mousePos[0] != destination[0] || mousePos[1] != destination[1]) {
			int[] nextDirection = getNextPos(mousePos, currentDirctionIndex);
			this.print();
			boolean alreadyPassed = false;
			boolean notOverBound = nextDirection[0] < maze.length && nextDirection[1] < maze[0].length;
			for(int i = 0; i < histories.size(); i ++) {
				if(histories.get(i)[0] == nextDirection[0] && histories.get(i)[1] == nextDirection[1]) {
					alreadyPassed = true;
					break;
				}
			}
			histories.add(mousePos);
			int[][] nextPos = getAllAvailableNextPoses(mousePos);
			if(notOverBound && maze[nextDirection[0]] != null && maze[nextDirection[0]][nextDirection[1]] == 0) {
				mousePos = nextDirection;
			} else {
				currentDirctionIndex = (currentDirctionIndex + 1) % 4;
			}
			
			if(nextPos.length == 1 || alreadyPassed) {
				for(int i = histories.size() - 1; i >= 0; i --) {
					int[] historyPos = histories.get(i);
					int[][] availablePoses = getAllAvailableNextPoses(historyPos);
				
					int[] newPos = null;
					for(int j = availablePoses.length - 1; j >= 0; j --) {
						boolean isNewPath = true;
						for(int k = histories.size() - 1; k >= 0; k --) {
							if(availablePoses[j][0] == histories.get(k)[0] && availablePoses[j][1] == histories.get(k)[1]) {
								isNewPath = false;
							}
						}
						if(isNewPath) {
							newPos = availablePoses[j];
						}
					}
					if(newPos != null) {
						mousePos = newPos;
						break;
					}
				}
			}
		}
		mousePos = destination;
		print();
	}
	
	public int[][] getAllAvailableNextPoses(int[] intPos) {
		List<int[]> positions = new ArrayList<>();
		int[] pos = null;
		for(int i = 0; i < 4; i ++) {
			pos = getNextPos(intPos, i);
			try {
				if(pos[0] >=0 && pos[1] >= 0 && maze[pos[0]] != null && maze[pos[0]][pos[1]] == 0) {
					positions.add(pos);
				}
			} catch(ArrayIndexOutOfBoundsException e) {
				
			}
		}
		return positions.toArray(new int[positions.size()][]);
	}
	
	public int[] getNextPos(int[] pos, int directionIndex) {
		if(directionIndex == 0) {
			return new int[]{pos[0], pos[1] + 1};
		} else if (directionIndex == 1) {
			return new int[]{pos[0] + 1, pos[1]};
		} else if (directionIndex == 2) {
			return new int[]{pos[0], pos[1] - 1};
		} else {
			return new int[]{pos[0] - 1, pos[1]};
		}
	}
	
	public void print() {
		for(int i = 0; i < maze.length; i ++) {
			for(int j = 0; j < maze[i].length; j ++) {
				if(i == mousePos[0] && j == mousePos[1]) {
					System.out.print('O');
				} else if (i == destination[0] && j == destination[1]) {
					System.out.print('*');
				} else if(maze[i][j] == 0) {
					System.out.print(' ');
				} else if (maze[i][j] == 2) {
					System.out.print('X');
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
