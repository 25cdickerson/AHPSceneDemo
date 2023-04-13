package model;
import java.io.IOException;

import javafx.beans.property.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import runners.Run;

public class ViewTransitionalModel {
	BorderPane mainview; 
	
	public ViewTransitionalModel(BorderPane view) {
		mainview= view;
	}
	
	public void showhomepage() throws IOException {
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../view/homepage.fxml"));
		
		BorderPane view= loader.load();
		mainview.setCenter(view);
	}
	
	public void showgrouppage() throws IOException {
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../view/grouppage.fxml"));
		
		Parent view= loader.load();
		mainview.setCenter(view);
		
	}
	
	public void showfortnitegroupchats() throws IOException {
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../view/Fortnitegroupchats.fxml"));
		
		Parent view= loader.load();
		mainview.setCenter(view);
	}
	
	public void showminecraft() throws IOException {
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../view/Minecraftgroupchats.fxml"));
		
		Parent view= loader.load();
		mainview.setCenter(view);
	}
	
}


