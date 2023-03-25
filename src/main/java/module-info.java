module com.stempien.biblioteczka {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.stempien.biblioteczka to javafx.fxml;
    exports com.stempien.biblioteczka;
}