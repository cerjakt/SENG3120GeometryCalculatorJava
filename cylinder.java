public class cylinder 
{
    public double volume (int radius, int height)
    {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }

    public double surfaceArea (int radius, int height)
    {
        double surfaceArea = (2 * (Math.PI) * (radius) * (height)) + (2 * (Math.PI) * (radius) * (radius));
        return surfaceArea;
    }

    public double lateralSurfaceArea (int radius, int height)
    {
        double lateralSurfaceArea =  2 * (Math.PI) * (radius) * (height);
        return lateralSurfaceArea;
    }

    public double topBottomArea (int radius)
    {
        double topBottomArea = (Math.PI) * radius * radius;
        return topBottomArea;
    }
}