/**
* File: PAssign07
* Class: CSCI 1302
* Author: Diego Geraldo-Vargas
* Created on: Apr 2, 2026
* Last Modified: Apr 9, 2026
* Description: Creates a keypad with numbers and letters.
*/

import keypad.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import keypad.KeyPadPanePlus;

public class PAssign07 extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		BorderPane mainPane = new BorderPane();
		
		KeyPadPanePlus keyPane = new KeyPadPanePlus();
		
		mainPane.setCenter(keyPane);
		
		Scene scene = new Scene(mainPane, 250, 250);
		
		primaryStage.setTitle("My KeyPadPane");
		primaryStage.setScene(scene); 
		primaryStage.show();
	}

	public static void main(String[] args) { 
		launch(args);
	}
}


