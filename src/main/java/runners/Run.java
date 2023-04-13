package runners;

import java.lang.ModuleLayer.Controller;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.ViewTransitionalModel;
import view.Cont;

public class Run extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Run.class.getResource("../view/homepage.fxml"));
		
		Parent view= loader.load();
		
		Cont control= loader.getController();
		control.setModel(new ViewTransitionalModel(view));
		
		Scene S= new Scene(view);
		stage.setScene(S);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}
