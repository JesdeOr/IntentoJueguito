package com.example.Models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class Board{
    private static Properties properties = new Properties();
    private static final String pathToPropertiesFile = "robotsvsdinos\\src\\main\\resources\\MatchData.properties";
    public int[][] board;
    public int BOARD_LENGTH;
    public int BOARD_WIDTH;

    public Board(){
        try {
            setLength();
            setWidth();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.board = new int[BOARD_LENGTH][BOARD_WIDTH];
    }

    public void setWidth(){
        try {
            properties.load(new BufferedReader(new FileReader(pathToPropertiesFile)));
            BOARD_WIDTH = Integer.parseInt(properties.getProperty("BOARD_WIDTH"));
        } catch (Exception e) {
           e.printStackTrace();
        }  
    }
    public void setLength() throws Exception{
        try {
            properties.load(new BufferedReader(new FileReader(pathToPropertiesFile)));
            BOARD_LENGTH = Integer.parseInt(properties.getProperty("BOARD_LENGTH"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void printBoard(){
        for (int[] rows : board) {
            for (int column : rows) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
    public void setDino(){
        int rndX = (int)Math.round(Math.random() * (board.length-1));
        int rndY = (int)Math.round(Math.random() * (board[0].length-1));
        
        board[rndX][rndY] = 1;
    }

    public void setRobot(int x, int y){
        board[x][y] = 2;
    }
}
