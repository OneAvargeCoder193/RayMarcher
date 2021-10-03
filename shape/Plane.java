package shape;

import java.awt.Color;

import math.*;

public class Plane implements Shape
{

    @Override
    public float getDist(Vec3 p)
    {
        return p.y;
    }

    @Override
    public Vec3 getNormal(Vec3 p) {
        return new Vec3(0, 1, 0);
    }

    @Override
    public Color getColor()
    {
        return new Color(0.5f, 0.5f, 0.5f);
    }
    
}