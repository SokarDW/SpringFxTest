package de.knm.springFx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication
public class SpringFxApplication extends AbstractJavaFxApplicationSupport{

	public static void main(String[] args) {
		SpringApplication.run(SpringFxApplication.class, args);
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));

			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("meinCSS.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("yay");
			primaryStage.show();
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fehler bei FXML laden!1");
		}
	}
	
	
}
