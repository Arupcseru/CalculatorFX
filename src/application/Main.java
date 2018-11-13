package application;
	
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.*;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			FXMLLoader loader = new 
			        FXMLLoader(getClass().getResource("CalculatorDesign.fxml"));
			        loader.setController(new Controller());
			
			Parent root=loader.load();
//			Parent root = FXMLLoader.load(getClass().getResource("CalculatorDesign.fxml"));
			Scene scene = new Scene(root,365,340);
			stage.setTitle("FXML Calculator");
		    stage.setScene(scene);
		    stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}
