package com.techelevator;

public class SquareWall extends RectangleWall{

    private final int sideLength;


    public SquareWall(String name, String color, int sideLength) {
        super(name,color,sideLength,sideLength);
        this.sideLength = sideLength;
    }

    public String toString() {
        return getName() + " (" + sideLength+ "x" + sideLength
                + ") square";
    }
}
