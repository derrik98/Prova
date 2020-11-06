package project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class javaFX extends Application{
	
	Label label1;
	Button button1;
	int i = 1;
	
	public static void main(String[] args) {
		launch(args);

	}
	
	@Override
	public void start(Stage stage) throws Exception{
		stage.setTitle("Prima prova");
		label1 = new Label("la mia prma prova");
		VBox root = new VBox();
		
		Scene scene = new Scene(root, 500, 500);
		stage.setScene(scene);
		
		button1 = new Button("il mio primo bottone");
		button1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("ciao");
				label1.setText("Try" + i);
				i++;
			}
		});
		
		root.getChildren().addAll(label1, button1);
		stage.show();
	}

}