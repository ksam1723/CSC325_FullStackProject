package edu.farmingdale.csc325_fullstackproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
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
        TableColumn<Student, String> col4 = new TableColumn<>("Department");
        TableColumn<Student, String> col5 = new TableColumn<>("Major");
        TableColumn<Student, String> col6 = new TableColumn<>("Email");

        table.getColumns().addAll(col1, col2, col3, col4, col5, col6);

        // LeftPane
        Label profilePic = new Label("O");
        profilePic.setStyle("-fx-font-size: 48px;");
        VBox leftPane = new VBox(profilePic);
        leftPane.setPadding(new Insets(10));

        // RightPane
        TextField firstName = new TextField();
        firstName.setPromptText("First Name");

        TextField lastName = new TextField();
        lastName.setPromptText("Last Name");

        TextField dept = new TextField();
        dept.setPromptText("Department");

        TextField major = new TextField();
        major.setPromptText("Major");

        TextField email = new TextField();
        email.setPromptText("Email");

        Button clear = new Button("Clear");
        Button add = new Button("Add");
        Button delete = new Button("Delete");
        Button edit = new Button("Edit");

        VBox rightPane = new VBox(10, firstName, lastName,
                dept, major, email, clear, add, delete, edit);

        rightPane.setPadding(new Insets(10));

        // Layout
        BorderPane root = new BorderPane();
        root.setTop(menubar);
        root.setLeft(leftPane);
        root.setCenter(table);
        root.setRight(rightPane);


        Scene scene = new Scene(root, 800, 400);
        stage.setScene(scene);
        stage.setTitle("Student Details");
        stage.show();

    }

    public static class Student {

    }

    public static void main(String[] args) {
        launch();
    }
}