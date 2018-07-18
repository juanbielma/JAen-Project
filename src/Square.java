import java.awt.*;

/***
 * Clase que define a un cuadrado o rectandulo
 */
public class Square extends Shape {

    private Color color;
    private boolean equalSides;

    /// CONSTRUCTORES
    public Square() {
        super(1, 1);
        this.color = Color.BLACK;
        this.equalSides = true;
    }

    public Square(Color color) {
        super(1, 1);
        this.color = color;
        this.equalSides = true;
    }

    public Square(Integer height, Integer width) {
        super(height, width);
        this.color = Color.BLACK;
        this.equalSides = true;
    }

    public Square(Integer height, Integer width, Color color) {

        super(height, width);
        this.color = color;
        this.equalSides = true;
    }

    public Square(Integer height, Integer width, Color color, boolean equalSides) {
        super(height, width);
        this.color = color;
        this.equalSides = equalSides;
    }

    // Getters and Setters

    public boolean isEqualSides() {
        return equalSides;
    }

    public void setEqualSides(boolean equalSides) {
        this.equalSides = equalSides;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
