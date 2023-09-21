package com.example;
import com.example.Setup.LoadGame;


public class Main {
    
    public static void main(String[] args) throws Exception{
        LoadGame game = new LoadGame();
        game.StartGame();
        System.out.println("Posicionamiento de 4 dinos:");
        game.tablero.setDino();
        game.tablero.setDino();
        game.tablero.setDino();
        game.tablero.setDino();
        game.tablero.printBoard();
        game.askInitialPos();

    }
}