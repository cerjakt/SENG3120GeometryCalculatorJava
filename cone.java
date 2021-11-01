public class cone
{
    public double slant(int radius, int height)
    {
        double slant = Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
        return slant;
    }

    public double surfaceArea(int radius, int height)
    {
        double surfaceArea = ((Math.PI) * (radius)) * ((radius) + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
        return surfaceArea;
    } 

    public double volume(int radius, int height)
    {
        double volume = (Math.PI) * Math.pow(radius, 2) * (height/3);
        return volume;
    }

    public double latSurfaceArea(int radius, int height)
    {
        double latSurfaceArea = ((Math.PI) * (radius)) * Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
        return latSurfaceArea;
    }
}

