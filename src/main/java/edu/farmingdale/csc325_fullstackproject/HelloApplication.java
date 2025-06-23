package edu.farmingdale.csc325_fullstackproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
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
        String imageUrl = "https://i.gyazo.com/536082de1b58edfe55b2315696d8608e.png";
        Image image = new Image(imageUrl, true);
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);

        VBox leftPane = new VBox(imageView);
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

        TextField imageURL = new TextField();
        imageURL.setPromptText("imageURL");

        VBox textFields = new VBox(firstName, lastName, dept, major, email, imageURL);

        // Creates Space between textFIelds and Buttons
        Region spacer = new Region();
        VBox.setVgrow(spacer, Priority.ALWAYS);

        Button clear = new Button("Clear");
        Button add = new Button("Add");
        Button delete = new Button("Delete");
        Button edit = new Button("Edit");

        // Make buttons bigger
        for (Button button : new Button[]{clear, add, delete, edit}) {
            button.setPrefWidth(150);
            button.setPrefHeight(30);
        }

        VBox rightPane = new VBox(10, textFields, spacer, clear, add,
                delete, edit);

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