module ax.ha.it.graphics {
    requires javafx.controls;
    requires javafx.fxml;


    opens ax.ha.it.graphics to javafx.fxml;
    exports ax.ha.it.graphics;
}