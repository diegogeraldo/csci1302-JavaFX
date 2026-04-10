/**
 * File: csci1302/keypad/KeyPadPanePlus.java
 * Package: keypad
 * @author Christopher Williams
 * Created on: Mar 01, 2020
 * Description:  Small example of extending the KeyPadPane class
 * 		and accessing a protected data member within that class
 */
package keypad;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

public class KeyPadPanePlus extends KeyPadPane {
	public KeyPadPanePlus() {
		btn1.setText("\n1");
		btn2.setText("ABC\n2");
		btn3.setText("DEF\n3");
		btn4.setText("GHI\n4");
		btn5.setText("JKL\n5");
		btn6.setText("MNO\n6");
		btn7.setText("PQRS\n7");
		btn8.setText("TUV\n8");
		btn9.setText("WXYZ\n9");
		btnBlank1.setText("\n*");
		btn0.setText("\n0");
		btnBlank2.setText("\n#");
		
		Button[] newButtons = { btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnBlank1, btn0, btnBlank2};
		
		ArrayList<Button> newList =  new ArrayList<>(Arrays.asList(newButtons));
		
		for(Button b : newList) {
			b.setPrefHeight(100);
			b.setPrefWidth(100);
			b.setAlignment(Pos.CENTER);
		}
	}
}