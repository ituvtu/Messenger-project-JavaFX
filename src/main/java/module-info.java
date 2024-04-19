module org.example.messenger {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    exports org.example.jfx;
    opens org.example.jfx to javafx.fxml;
}