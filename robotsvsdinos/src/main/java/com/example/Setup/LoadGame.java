package com.example.Setup;
import java.util.Scanner;

import com.example.Models.Board;

public class LoadGame {
    public Board tablero;

    public void StartGame() throws Exception{
        tablero = new Board();
    }

    public boolean inputFormat(String message){
        return Character.isDigit(message.charAt(0)) && message.charAt(1) == ',' && message.charAt(2) == ' ' && Character.isDigit(message.charAt(3));
    }

    public void askInitialPos(){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        do {
            System.out.print("Introduce la posición inicial del robot: (en formato X, Y): ");
            String initialPos = sc.nextLine();
            if(inputFormat(initialPos)){
                x = Character.getNumericValue(initialPos.charAt(0));
                y = Character.getNumericValue(initialPos.charAt(3));
                System.out.println("las coordenadas indicadsa son " + x + ", " + y);
                sc.close();
                break;
            }else{
                System.out.println("Por favor, introduce unas coordenadas válidas.");
            }
                        
        } while (true);
        
        
    }
}
