public class cylinder 
{
    public float volume (int radius, int height)
    {
        double volume = Math.PI * radius * radius * height;
        return (float) volume;
    }

    public float surfaceArea (int radius, int height)
    {
        double surfaceArea = (2 * (Math.PI) * (radius) * (height)) + (2 * (Math.PI) * (radius) * (radius));
        return (float) surfaceArea;
    }

    public float lateralSurfaceArea (int radius, int height)
    {
        double lateralSurfaceArea =  2 * (Math.PI) * (radius) * (height);
        return (float) lateralSurfaceArea;
    }

    public float topBottomArea (int radius)
    {
        double topBottomArea = (Math.PI) * radius * radius;
        return (float) topBottomArea;
    }
}