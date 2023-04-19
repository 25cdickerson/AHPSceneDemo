package view;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Callback;
import model.Group;
import model.ViewTransitionalModel;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;

public class Cont {
	
    private ViewTransitionalModel model;
    private Stage globalStage;

    public void setModel(ViewTransitionalModel model) {
        this.model = model;
    }
    
    public Scene sameWindow(ActionEvent event, String path) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(path));
        BorderPane view = loader.load();
        model = new ViewTransitionalModel(view);
        Cont controller = loader.getController();
        controller.setModel(model);
        Scene scene = new Scene(view);
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        globalStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        return scene;
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
        globalStage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    
    @FXML
    void onsignin(ActionEvent event) throws IOException {
    	initializeListViewGroupPage(sameWindow(event, "../view/grouppage.fxml"));
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
    
    // List View Items
    @FXML
    private ListView<Group> groupView;
    
    ArrayList<Group> groups = new ArrayList<Group>();

	public void initializeListViewGroupPage(Scene s) {
		groupView = (ListView<Group>) s.lookup("ListView");
		groups.add(new Group("Minecraft", "../view/Minecraftgroupchats.fxml"));
		groups.add(new Group("Fortnite", "../view/Fortnitegroupchats.fxml"));
		
		groupView.getItems().addAll(groups);
		groupView.setCellFactory(param -> new ListCell<Group>() {
			@Override
			protected void updateItem(Group item, boolean empty) {
				super.updateItem(item, empty);
				if(empty || item == null) {
					setText(null);
				}
				else {
					setText(item.getName());
				}
			}
		});
		
		groupView.setItems(FXCollections.observableArrayList(groups));
		
		groupView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Group>() {
			@Override
			public void changed(ObservableValue<? extends Group> observable, Group oldValue, Group newValue) {
				
		        FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource(newValue.getURL()));
		        BorderPane view;
				try {
					view = loader.load();
					model = new ViewTransitionalModel(view);
			        Cont controller = loader.getController();
			        controller.setModel(model);
			        Scene scene = new Scene(view);
			        Stage stage = globalStage;
			        stage.setScene(scene);
			        stage.show();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}});
	}
}