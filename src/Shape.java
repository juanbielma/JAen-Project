/**
 * Clase padre que define a una figura
 ***/
 public class Shape {
    private Integer height;
    private Integer width;

    /// CONSTRUCTORES

    public Shape() {
    }

    public Shape(Integer height, Integer width) {
        this.height = height;
        this.width = width;
    }

    // Getters and Setters

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    // Métodos publicos para aumentar el ancho y largo
    public void increase(Integer sum) {
        this.width += sum;
        this.height += sum;
    }

    // Métodos publicos para disminuir el ancho y largo
    public void decrease(Integer minus) {
        this.width -= minus;
        this.height -= minus;
    }
}
