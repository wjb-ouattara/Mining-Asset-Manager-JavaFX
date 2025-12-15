module com.mining.miningassetmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mining.miningassetmanager to javafx.fxml;
    exports com.mining.miningassetmanager;
}