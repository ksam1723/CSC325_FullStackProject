module edu.farmingdale.csc325_fullstackproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.csc325_fullstackproject to javafx.fxml;
    exports edu.farmingdale.csc325_fullstackproject;
}