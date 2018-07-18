import java.awt.*;


/***
 * Clase que define a un triangulo
 */
public class Triangle extends Shape {

    private Color color;

    // CONSTRUCTORES
    public Triangle() {
        super(1, 1);
        this.color = Color.BLACK;
    }

    public Triangle(Color color) {
        super(1, 1);
        this.color = color;
    }

    public Triangle(Integer height, Integer width) {
        super(height, width);
        this.color = Color.BLACK;
    }

    public Triangle(Integer height, Integer width, Color color) {

        super(height, width);
        this.color = color;
    }

    // GETTERS AND SETTERS
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
