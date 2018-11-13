package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.*;
import javafx.fxml.*;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class Controller implements Initializable{
	
	@FXML
    Button btn_0, btn_00, btn_point, btn_equal, btn_1, btn_2, btn_3, 
    	btn_add, btn_4, btn_5, btn_6, btn_sub, btn_7, btn_8, btn_9,
    	btn_mul, btn_ce, btn_c, btn_del, btn_div;
	@FXML
	TextField tv;
	
	private void handleButtonAction(ActionEvent event) {
        // Button was clicked, do something...
        tv.setText("Button Action\n");
   }
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 btn_equal.setOnAction(this::handleButtonAction);
		 btn_point.setOnAction(this::handleButtonAction);
		 btn_0.setOnAction(this::handleButtonAction);
		 btn_00.setOnAction(this::handleButtonAction);
		 btn_1.setOnAction(this::handleButtonAction);
		 btn_2.setOnAction(this::handleButtonAction);
		 btn_3.setOnAction(this::handleButtonAction);
		 btn_4.setOnAction(this::handleButtonAction);
		 btn_5.setOnAction(this::handleButtonAction);
		 btn_6.setOnAction(this::handleButtonAction);
		 btn_7.setOnAction(this::handleButtonAction);
		 btn_8.setOnAction(this::handleButtonAction);
		 btn_9.setOnAction(this::handleButtonAction);
		 btn_add.setOnAction(this::handleButtonAction);
		 btn_sub.setOnAction(this::handleButtonAction);
		 btn_mul.setOnAction(this::handleButtonAction);
		 btn_div.setOnAction(this::handleButtonAction);
		 btn_c.setOnAction(this::handleButtonAction);
		 btn_del.setOnAction(this::handleButtonAction);
		 btn_ce.setOnAction(this::handleButtonAction);
	}

}
