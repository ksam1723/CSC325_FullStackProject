package edu.farmingdale.csc325_fullstackproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        // Menu
        MenuBar menubar = new MenuBar();
        menubar.getMenus().addAll(
                new Menu("File"),
                new Menu("Edit"),
                new Menu("Theme"),
                new Menu("Help")
        );



    }

    public static void main(String[] args) {
        launch();
    }
}