module be.odisee.gemiddeldeoplossing {
    requires javafx.controls;
    requires javafx.fxml;


    opens be.odisee.gemiddeldeoplossing to javafx.fxml;
    exports be.odisee.gemiddeldeoplossing;
}