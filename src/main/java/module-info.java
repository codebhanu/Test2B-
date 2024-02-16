module com.example.classtestb {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.classtestb to javafx.fxml;
    exports com.example.classtestb;
}