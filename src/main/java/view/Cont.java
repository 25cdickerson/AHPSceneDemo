package view;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import model.ViewTransitionalModel;
import javafx.beans.binding.Bindings;
import javafx.scene.Node;

public class Cont {
    private ViewTransitionalModel model;

    public void setModel(ViewTransitionalModel model) {
        this.model = model;
    }
    
    public void sameWindow(ActionEvent event, String path) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(path));
        BorderPane view = loader.load();
        model = new ViewTransitionalModel(view);
        Cont controller = loader.getController();
        controller.setModel(model);
        Scene scene = new Scene(view);
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void newWindow(ActionEvent event, String path) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(path));
        BorderPane view = loader.load();
        model = new ViewTransitionalModel(view);
        Cont controller = loader.getController();
        controller.setModel(model);
        Scene scene = new Scene(view);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void onsignin(ActionEvent event) throws IOException {
    	sameWindow(event, "../view/grouppage.fxml");
    }

    @FXML
    void onFortnite(ActionEvent event) throws IOException {
    	sameWindow(event, "../view/Fortnitegroupchats.fxml");
    }

    @FXML
    void onMinecraft(ActionEvent event) throws IOException {
        sameWindow(event, "../view/Minecraftgroupchats.fxml");
    }
    
    @FXML
    void onUserSettings(ActionEvent event) throws IOException {
        newWindow(event, "../view/usersettings.fxml");
    }
    
    @FXML
    void onGroupSettings(ActionEvent event) throws IOException {
        newWindow(event, "../view/groupsettings.fxml");
    }
    
    @FXML
    void onNewGroup(ActionEvent event) throws IOException {
        newWindow(event, "../view/newGroup.fxml");
    }
}