/*----------------------------------------------------------------------------------------------------------------------
	Point sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util.math.geometry;

import static java.lang.Math.sqrt;

public class Point {
    public int x;
    public int y;

    Point(Point other)
    {
        this(other.x, other.y);
    }

    public Point()
    {
    }

    public Point(int x)
    {
        this.x = x;
    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public double distance()
    {
        return distance(0, 0);
    }

    public double distance(Point other)
    {
        return distance(other.x, other.y);
    }

    public double distance(int x, int y) //primary, core
    {
        return sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public void offset(int dxy)
    {
        offset(dxy, dxy);
    }

    public void offset(int dx, int dy)
    {
        x += dx;
        y += dy;
    }

    public String toString()
    {
        return String.format("{x : %d, y : %d}", x, y);
    }
}

