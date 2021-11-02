public class sphere
{
    public float volume(int radius)
    {
        double volume = (4/3) * Math.PI * Math.pow(radius, 3);
        return (float) volume;
    }

    public float surfaceArea(int radius)
    {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        return (float) surfaceArea;
    }
}
