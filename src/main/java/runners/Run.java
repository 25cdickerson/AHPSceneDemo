package runners;

import java.lang.ModuleLayer.Controller;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Run extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Run.class.getResource("../view/homepage.fxml"));
		
		Parent view= loader.load();
		
		Controller control= loader.getController();
		
		Scene S= new Scene(view);
		stage.setScene(S);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
	
	public static void setview(Parent view) {
		
	}
}
