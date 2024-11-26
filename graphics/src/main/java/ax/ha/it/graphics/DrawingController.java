package ax.ha.it.graphics;

import javafx.fxml.FXML;

/**
 * Controller part of MVC architecture.
 * @author joakim
 */
public class DrawingController {

    @FXML
    private DrawingPane drawingPane;

    public void initialize() {
        drawingPane.setDrawingState(DrawingState.POLYLINE);
    }

    @FXML
    private void drawPolyline() {
        drawingPane.setDrawingState(DrawingState.POLYLINE);
    }

    @FXML
    private void drawRectangle() {
        drawingPane.setDrawingState(DrawingState.RECTANGLE);
    }

    @FXML
    private void clear() {
        drawingPane.clear();
    }

    @FXML
    private void undo() {
        // ToDo: Undo a previous command
    }

    @FXML
    private void redo() {
        // ToDo: Redo a previous command
    }

}

