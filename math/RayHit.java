package math;

import shape.Shape;

public class RayHit
{
    public Vec3 pos;
    public float dist;
    public Vec3 normal;
    public Shape shape;

    public RayHit(Vec3 pos, float dist, Vec3 normal, Shape shape)
    {
        this.pos = pos;
        this.dist = dist;
        this.normal = normal;
        this.shape = shape;
    }

    public RayHit()
    {
        this.pos = new Vec3(0, 0, 0);
        this.dist = Float.POSITIVE_INFINITY;
        this.normal = new Vec3(0, 0, 0);
        this.shape = null;
    }

    public void add(RayHit hit)
    {
        if (hit.dist < this.dist)
        {
            this.pos = hit.pos;
            this.dist = hit.dist;
            this.normal = hit.normal;
            this.shape = hit.shape;
        }
    }
}