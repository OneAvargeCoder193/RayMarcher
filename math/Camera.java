package math;

public class Camera
{
    Vec3 pos;
    Vec3 dir;

    public Camera(Vec3 pos, Vec3 dir) 
    {
        this.pos = pos;
        this.dir = dir;
    }

    public Ray createCameraRay(Vec2 uv)
    {
        return new Ray(this.pos, Vec3.normalize(new Vec3(uv.x, uv.y, 1)));
    }
}
