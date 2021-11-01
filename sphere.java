public class sphere
{
    public double volume(int radius)
    {
        double volume = (4/3) * Math.PI * Math.pow(radius, 3);
        return volume;
    }

    public double surfaceArea(int radius)
    {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        return surfaceArea;
    }
}
