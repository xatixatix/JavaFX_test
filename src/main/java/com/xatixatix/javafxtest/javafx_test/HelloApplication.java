package com.xatixatix.javafxtest.javafx_test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        double screenWidth = Screen.getPrimary().getBounds().getWidth();
        double screenHeight = Screen.getPrimary().getBounds().getHeight();
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(root, screenWidth * 0.7, screenHeight * 0.7, Color.SKYBLUE);
        Text welcomeText = new Text();
        welcomeText.setText("Welcome to my test project!");
        welcomeText.setX(scene.getWidth() / 2 - welcomeText.getX());
        welcomeText.setY(scene.getHeight() * 0.05);
        root.getChildren().add(welcomeText);
        Image icon = new Image("icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("This is the first window!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}