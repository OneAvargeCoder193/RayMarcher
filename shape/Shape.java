package shape;

import math.*;
import java.awt.Color;

public interface Shape
{
    public float getDist(Vec3 p);
    public Vec3 getNormal(Vec3 p);
    public Color getColor();
}