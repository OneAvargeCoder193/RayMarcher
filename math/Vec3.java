package math;

public class Vec3 {
    public float x;
    public float y;
    public float z;

    public Vec3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3 add(Vec3 other)
    {
        return new Vec3(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vec3 sub(Vec3 other) {
        return new Vec3(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public Vec3 mul(float scalar)
    {
        return new Vec3(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    public Vec3 div(float scalar)
    {
        return new Vec3(this.x / scalar, this.y / scalar, this.z / scalar);
    }
    
    public static float length(Vec3 vec)
    {
        return (float)Math.sqrt(vec.x * vec.x + vec.y * vec.y + vec.z * vec.z);
    }

    public static Vec3 normalize(Vec3 vec)
    {
        return vec.div(length(vec));
    }

    public static float dot(Vec3 vec1, Vec3 vec2)
    {
        return (vec1.x * vec2.x) + (vec1.y * vec2.y) + (vec1.z * vec1.z);
    }

    public static Vec3 cross(Vec3 vec1, Vec3 vec2)
    {
        return new Vec3(vec1.y * vec2.z - vec1.z * vec2.y, vec1.z * vec2.x - vec1.x * vec2.z, vec1.x * vec2.y - vec1.y * vec2.x);
    }
}
