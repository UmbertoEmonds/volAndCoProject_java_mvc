package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("View/sample.fxml"));
		primaryStage.setTitle("Vol&Co");
		primaryStage.setScene(new Scene(root));
		primaryStage.setResizable(false);
		//primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/res/icon.png")));
		URL cssURL = getClass().getResource("View/style.css");
		root.getStylesheets().add(cssURL.toExternalForm());

		primaryStage.show();

	}

	public static void main(String[] args) {

		launch(args);
	}
}
