package view;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.ViewTransitionalModel;
import javafx.beans.binding.Bindings;

public class Cont {
	ViewTransitionalModel model;
	
	public void setModel(ViewTransitionalModel newmodel) {
		model=newmodel;
	}
	
	@FXML
	private Button signin;
	@FXML
	private TextField username;
	@FXML
	private TextField pw;
	
	@FXML
	void onsignin(ActionEvent event) throws IOException {
		model.showgrouppage();
	}
	
	@FXML
	void onFortnite(ActionEvent event) throws IOException {
		model.showfortnitegroupchats();
	}
	
	@FXML
	void onMinecraft(ActionEvent event) throws IOException {
		model.showminecraft();
	}
}
