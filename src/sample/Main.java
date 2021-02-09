package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("../GUI/controller/LoginView.fxml"));
        primaryStage.setTitle("Attendance Automation");
        primaryStage.setScene(new Scene(root, 376, 154));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
