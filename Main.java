import graphics.Display;
import shape.*;
import math.*;

public class Main
{
    public static void main(String[] args)
    {
        Scene scene = new Scene(new Camera(new Vec3(0, -5, 0), new Vec3(0, 1, 0)), new Sphere(new Vec3(0, 0, 0), 1f));
        Display display = new Display("Ray Tracing", scene);
        display.run();
    }
}