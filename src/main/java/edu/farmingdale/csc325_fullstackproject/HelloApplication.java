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
        // MenuBar
        MenuBar menubar = new MenuBar();
        menubar.getMenus().addAll(
                new Menu("File"),
                new Menu("Edit"),
                new Menu("Theme"),
                new Menu("Help")
        );
        // TableView
        TableView table = new TableView();
        table.setPlaceholder(new Label("No content in table"));

        TableColumn col1 = new TableColumn("ID");
        TableColumn col2 = new TableColumn("First Name");
        TableColumn col3 = new TableColumn("Last Name");
        TableColumn col4 = new TableColumn("Depart,emt");
        TableColumn col5 = new TableColumn("Major");
        TableColumn col6 = new TableColumn("Email");

        table.getColumns().addAll(col1, col2, col3, col4, col5, col6);



    }

    public static void main(String[] args) {
        launch();
    }
}