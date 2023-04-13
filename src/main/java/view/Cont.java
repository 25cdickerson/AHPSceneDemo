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
import model.ViewTransitionalModel;
import javafx.beans.binding.Bindings;

public class Cont {
    private ViewTransitionalModel model;

    public void setModel(ViewTransitionalModel model) {
        this.model = model;
    }

    @FXML
    void onsignin(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../view/grouppage.fxml"));
        BorderPane view = loader.load();
        model = new ViewTransitionalModel(view);
        Cont controller = loader.getController();
        controller.setModel(model);
        Scene scene = new Scene(view);
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void onFortnite(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../view/Fortnitegroupchats.fxml"));
        BorderPane view = loader.load();
        model = new ViewTransitionalModel(view);
        Cont controller = loader.getController();
        controller.setModel(model);
        Scene scene = new Scene(view);
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void onMinecraft(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../view/Minecraftgroupchats.fxml"));
        BorderPane view = loader.load();
        model = new ViewTransitionalModel(view);
        Cont controller = loader.getController();
        controller.setModel(model);
        Scene scene = new Scene(view);
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}