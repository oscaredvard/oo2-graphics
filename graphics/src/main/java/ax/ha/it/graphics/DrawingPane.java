package ax.ha.it.graphics;

import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 * View part of the MVC architecture.
 * Create Shapes and add them to this Pane
 *
 * @author joakim
 */
public class DrawingPane extends Pane {

    private DrawingState drawingState;

    /**
     * Constructor
     */
    public DrawingPane() {

        setOnMousePressed(mouseEvent -> {
            // ToDo: Handle MouseEvents according to state
        });

        setOnMouseReleased(mouseEvent -> {
            // ToDo: Handle MouseEvents according to state
        });

        setOnMouseMoved(mouseEvent -> {
            // ToDo: Handle MouseEvents according to state
        });

        setOnMouseDragged(mouseEvent -> {
            // ToDo: Handle MouseEvents according to state
        });

        setOnMouseClicked(mouseEvent -> {
            // ToDo: Handle MouseEvents according to state
        });

        setBorder(new Border(new BorderStroke(Paint.valueOf("black"),
                BorderStrokeStyle.SOLID,
                CornerRadii.EMPTY,
                BorderWidths.DEFAULT)));

        // Need to set the 'clip' property of the Pane to avoid drawing Shapes outside of the pane.
        // Simplified version of https://news.kynosarges.org/2016/11/03/javafx-pane-clipping/
        final Rectangle outputClip = new Rectangle();
        setClip(outputClip);
        layoutBoundsProperty().addListener((ov, oldValue, newValue) -> {
            outputClip.setWidth(newValue.getWidth());
            outputClip.setHeight(newValue.getHeight());
        });
    }

    void setDrawingState(DrawingState state) {
        this.drawingState = state;
    }

    public void clear() {
        // Clearing a List in Java is surprisingly cumbersome, but
        // utilizing subList helps:
        // See also https://www.w3resource.com/java-tutorial/arraylist/arraylist_subList.php
        getChildren().subList(0, getChildren().size()).clear();
    }
}