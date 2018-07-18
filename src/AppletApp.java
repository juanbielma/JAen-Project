import java.applet.Applet;
import java.awt.*;

public class AppletApp extends Applet
{
    // Declaracion de las variables globales
    private Button increaseSquare;
    private Button decreaseSquare;
    private Button increaseTriangle;
    private Button decreaseTriangle;
    private Square square;
    private Triangle triangle;

    // init method
    public void init()
    {
        // Inicializa los botones
        increaseSquare = new Button("[+] Square");
        decreaseSquare = new Button("[-] Square");

        increaseTriangle = new Button("[+] Triangle");
        decreaseTriangle = new Button("[-] Triangle");

        // Crea un panel para los botones
        Panel buttons = new Panel();
        buttons.setLayout(new FlowLayout());

        // agrega los botones al panel
        buttons.add(increaseSquare);
        buttons.add(decreaseSquare);

        buttons.add(increaseTriangle);
        buttons.add(decreaseTriangle);

        // Inicializa el cuadrado
        square = new Square(10, 10, Color.GREEN, true);
        // Inicializa el triángulo
        triangle = new Triangle(20, 50, Color.RED);

        // Setea el layout a utilizar en el applet y agrega el panel con los botoners
        setLayout(new BorderLayout());
        add("South", buttons);
    }

    // Intercepta la acción de los botones y llama el metodo de acuerdo con el boton clickeado
    public boolean action(Event e, Object o)
    {
        if (e.target == increaseSquare)
            return handleIncrease();
        else if (e.target == decreaseSquare)
            return handleDecrease();
        else if (e.target == increaseTriangle)
            return handleIncreaseTriangle();
        else if (e.target == decreaseTriangle)
            return handleDecreaseTriangle();
        else
            return super.action(e, o);
    }

    // Pinta las figuras (cuadrado y triángulo)
    public void paint(Graphics g)
    {

        // Para el cuadrado le añade el color dado en la inicializacion del objeto
        g.setColor(square.getColor());
        // Genera un cuadrado dando las coordenadas de inicio (10,10) con un ancho y largo especificado en el objeto
        g.fillRect(10, 10, square.getWidth(),square.getHeight());


        //Generación del triangulo
        // Start pont para generar el triangulo
        Integer startPoint = 30;

        // Coordenadas para los puntos del triangulo
        int x[] = {startPoint, (startPoint + triangle.getWidth()), startPoint};
        int y[] = {startPoint, (startPoint + triangle.getWidth()), (startPoint + triangle.getHeight())};

        g.setColor(triangle.getColor());
        // Genera el triangulo dadas las coordenadas de cada uno de sus puntos y el numero de lados que va a pintar
        g.fillPolygon(x, y, 3);

    }

    // Metodo que hace que el cuadrado crezca
    private boolean handleIncrease()
    {
        square.increase(5);
        repaint();
        return true;
    }

    // Metodo que hace que el cuadrado disminuya
    private boolean handleDecrease()
    {
        // Los lados del cuadrado no pueden ser menores a 5
        if (square.getWidth() > 5)
        {
            square.decrease(5);
        }
        repaint();
        return true;
    }

    // Metodo que hace que el triangulo crezca
    private boolean handleIncreaseTriangle()
    {
        triangle.increase(5);
        repaint();
        return true;
    }

    // Metodo que hace que el triangulo disminuya
    private boolean handleDecreaseTriangle()
    {
        // Los lados del triangulo no pueden ser menores a 5
        if (triangle.getWidth() > 5)
        {
            triangle.decrease(5);
        }
        repaint();
        return true;
    }
}
