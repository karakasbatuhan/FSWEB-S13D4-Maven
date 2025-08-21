package org.example;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){

        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double distance(Point p){
        if(p == null){
            System.out.println("Point objesi null.");
            return 0;
        }
        return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
    }

    public double distance(int x, int y){
        return Math.sqrt(Math.pow((this.x - y), 2) + Math.pow((this.y - y), 2));
    }
}
