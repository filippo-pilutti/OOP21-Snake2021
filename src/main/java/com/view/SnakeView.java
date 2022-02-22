package main.java.com.view;

import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.util.List;

import main.java.com.utility.Position;

/**
 * Interface that models the view for the snake game entity.
 *
 */
public interface SnakeView extends DrawableGameEntity {

    /**
     * 
     * @return the {@link List<Rectangle>} of the snake's body.
     */
    List<Rectangle> getBody();

    /**
     * 
     * @return a {@link List<Rectangle>} that graphically represents on screen the
     *         body of the snake.
     */
    List<Rectangle> getBodyRects();

    /**
     * 
     * @return a {@link Point2D} that represents the position on the screen of the
     *         center of the snake's head.
     */
    Point2D getHeadCenter();

    /**
     * Sets the snake's body.
     * @param list
     */
    void setBody(List<Position> list);
}
