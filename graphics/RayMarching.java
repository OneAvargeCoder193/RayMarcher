package graphics;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;

import math.*;
import shape.*;

public class RayMarching extends JPanel
{

    private int WIDTH;
    private int HEIGHT;

    private Scene scene;

    public RayMarching(int width, int height, Scene scene)
    {
        super();
        this.WIDTH = width;
        this.HEIGHT = height;

        this.scene = scene;
    }

    public RayHit rayMarch(Ray ray)
    {
        return ray.getRayHit(this.scene);
    }

    public Color getPixelColor(Vec2 uv)
    {
        Ray ray = this.scene.camera.createCameraRay(uv);
        RayHit hit = this.rayMarch(ray);
        if (hit.shape != null)
        {
            return hit.shape.getColor();
        } else
        {
            return new Color(0f, 1f, 1f);
        }
    }

    public void paintComponent(Graphics g)
    {
        BufferedImage result = new BufferedImage(this.WIDTH, this.HEIGHT, BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < this.HEIGHT; y++)
        {
            for (int x = 0; x < this.WIDTH; x++)
            {
                Vec2 uvCoord = new Vec2(x / (float)this.WIDTH, 1 - y / (float)this.HEIGHT);
                Vec2 uv = uvCoord.sub(new Vec2(0.5f, 0.5f));
                
                Color pixelCol = this.getPixelColor(uv);
                result.setRGB(x, y, pixelCol.getRGB());
            }
        }
        g.drawImage(result, 0, 0, null);
    }
}