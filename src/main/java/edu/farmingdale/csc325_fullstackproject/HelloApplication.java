package edu.farmingdale.csc325_fullstackproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
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
        TableView<Student> table = new TableView<>();
        table.setPlaceholder(new Label("No content in table"));

        TableColumn<Student, String> col1 = new TableColumn<>("ID");
        TableColumn<Student, String> col2 = new TableColumn<>("First Name");
        TableColumn<Student, String> col3 = new TableColumn<>("Last Name");
        TableColumn<Student, String> col4 = new TableColumn<>("Depart,emt");
        TableColumn<Student, String> col5 = new TableColumn<>("Major");
        TableColumn<Student, String> col6 = new TableColumn<>("Email");

        table.getColumns().addAll(col1, col2, col3, col4, col5, col6);
        // LeftPane
        Label profilePic = new Label("Profile Picture");
        profilePic.setStyle("-fx-font-size: 32px;");
        VBox leftPane = new VBox();
        leftPane.setPadding(new Insets(10));

    }

    public static class Student {

    }

    public static void main(String[] args) {
        launch();
    }
}