package model;
import java.io.IOException;

import javafx.beans.property.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import runners.Run;

public class ViewTransitionalModel {
	Parent mainview; 
	
	public ViewTransitionalModel(Parent view) {
		mainview= view;
	}
	
	public void showhomepage() throws IOException {
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../view/homepage.fxml"));
		
		Parent view= loader.load();
	}
	
	public void showgrouppage() throws IOException {
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../view/grouppage.fxml"));
		
		Parent view= loader.load();
		
	}
	
	public void showfortnitegroupchats() throws IOException {
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../view/Fortnitegroupchats.fxml"));
		
		Parent view= loader.load();
	}
	
	public void showminecraft() throws IOException {
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../view/Minecraftgroupchats.fxml"));
		
		Parent view= loader.load();
	}
	
}


