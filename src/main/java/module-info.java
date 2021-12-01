module com.wojtekolesinski.ppa_simple_layout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.wojtekolesinski.ppa_simple_layout to javafx.fxml;
    exports com.wojtekolesinski.ppa_simple_layout;
}