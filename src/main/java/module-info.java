module com.xatixatix.javafxtest.javafx_test {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.xatixatix.javafxtest.javafx_test to javafx.fxml;
    exports com.xatixatix.javafxtest.javafx_test;
}