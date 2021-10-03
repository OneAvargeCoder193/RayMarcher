package math;

import shape.*;

public class Ray
{
    public Vec3 origin;
    public Vec3 dir;

    public Ray(Vec3 origin, Vec3 dir)
    {
        this.origin = origin;
        this.dir = dir;
    }

    public RayHit getRayHit(Scene scene) {
        Shape s = null;
        float distOrigin = 0;

        for (int i = 0; i < 100; i++) {
            Vec3 p = this.origin.add(this.dir.mul(distOrigin));
            float sceneDist = scene.getDist(p);
            distOrigin += sceneDist;
            s = scene.getClosestShape(p);
            if (distOrigin > 100 || sceneDist < 0.01)
                break;
        }

        Vec3 p = this.origin.add(this.dir.mul(distOrigin));

        if (s.getDist(p) > 0.01) {
            s = null;
        }

        return new RayHit(p, distOrigin, scene.getNormal(p), s);
    }
}