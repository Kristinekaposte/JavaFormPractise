package com.example.javaformpractice.shapes;

public class CorneredShape implements IShape {
    private int numOfEdges;

    public CorneredShape(int numOfEdges){
        this.numOfEdges=numOfEdges;
    }

    @Override
    public double getArea() {
        return numOfEdges; // integer can be casted to double easier
    }
}
