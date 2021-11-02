public class cone
{
    public float slant(int radius, int height)
    {
        double slant = Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
        return (float) slant;
    }

    public float surfaceArea(int radius, int height)
    {
        double surfaceArea = ((Math.PI) * (radius)) * ((radius) + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
        return (float) surfaceArea;
    } 

    public float volume(int radius, int height)
    {
        double volume = (Math.PI) * Math.pow(radius, 2) * (height/3);
        return (float) volume;
    }

    public float lateralSurfaceArea(int radius, int height)
    {
        double latSurfaceArea = ((Math.PI) * (radius)) * Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
        return (float) latSurfaceArea;
    }
}

