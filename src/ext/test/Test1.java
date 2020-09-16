package ext.test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Test1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button button = new Button("This is Sample button");
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				System.out.println("Hello World");
			}
		});
		StackPane root = new StackPane();
		root.getChildren().add(button);
		
		Scene scene = new Scene(root, 500, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("First FX Application");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
