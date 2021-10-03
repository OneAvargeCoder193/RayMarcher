package shape;

import math.*;

public class Scene
{
    public Shape[] shapes;
    public Camera camera;

    public Scene(Camera camera, Shape... shapes)
    {
        this.shapes = shapes;
        this.camera = camera;
    }

    public Vec3 getNormal(Vec3 p)
    {
        float d = this.getDist(p);
        Vec2 e = new Vec2(0.01f, 0f);

        Vec3 n = new Vec3(
            d - this.getDist(p.sub(new Vec3(e.x, e.y, e.y))),
            d - this.getDist(p.sub(new Vec3(e.y, e.x, e.y))),
            d - this.getDist(p.sub(new Vec3(e.y, e.y, e.x)))
        );

        return Vec3.normalize(n);
    }

    public float getDist(Vec3 p)
    {
        float dist = 0;

        for (Shape shape : this.shapes)
        {
            float sceneDist = shape.getDist(p);
            if (sceneDist < dist)
            {
                dist = sceneDist;
            }
        }

        return dist;
    }

    public Shape getClosestShape(Vec3 p)
    {
        Shape s = null;

        float dist = Float.POSITIVE_INFINITY;

        for (Shape sh : this.shapes)
        {
            float curDist = sh.getDist(p);
            if (curDist < dist)
            {
                dist = curDist;
                s = sh;
            }
        }

        return s;
    }
}