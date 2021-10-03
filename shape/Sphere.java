package shape;

import java.awt.Color;

import math.*;

public class Sphere implements Shape
{

    private Vec3 pos;
    private float radius;

    public Sphere(Vec3 pos, float radius)
    {
        this.pos = pos;
        this.radius = radius;
    }

    @Override
    public float getDist(Vec3 p)
    {
        return Vec3.length(this.pos.sub(p)) - this.radius;
    }

    @Override
    public Vec3 getNormal(Vec3 p) {
        return Vec3.normalize(p.sub(this.pos));
    }

    @Override
    public Color getColor()
    {
        return new Color(1f, 0f, 0f);
    }
}