package com.will.practice;

public class MouseMazeTest {
	
	public static void main(String[] args) {
		
		int[][] maze = {
				{2, 2, 2, 2, 2, 2, 2},
				{0, 0, 0, 0, 0, 0, 2},
				{2, 0, 2, 0, 2, 2, 0},
				{2, 0, 0, 2, 0, 2, 0},
				{2, 2, 0, 2, 0, 0, 0},
				{2, 0, 0, 0, 0, 0, 2},
				{2, 2, 2, 2, 2, 0, 2}
		};
		
		int[] mousePos = {1, 0};
		int[] destination = {2, 6};
		
		MouseMaze mouseMaze = new MouseMaze(maze, mousePos, destination);
		mouseMaze.startMove();
	}

}
