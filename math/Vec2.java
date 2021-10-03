package math;

public class Vec2
{
    public float x;
    public float y;

    public Vec2(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public Vec2 add(Vec2 other) {
        return new Vec2(this.x + other.x, this.y + other.y);
    }

    public Vec2 sub(Vec2 other) {
        return new Vec2(this.x - other.x, this.y - other.y);
    }

    public Vec2 mul(float scalar) {
        return new Vec2(this.x * scalar, this.y * scalar);
    }

    public Vec2 div(float scalar) {
        return new Vec2(this.x / scalar, this.y / scalar);
    }
}
