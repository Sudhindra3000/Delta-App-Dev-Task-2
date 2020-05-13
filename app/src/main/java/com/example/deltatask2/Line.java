package com.example.deltatask2;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Objects;

public class Line {
    private final int HORIZONTAL = 135, VERTICAL = 468;

    float startX, startY, stopX, stopY;
    private int orientation;
    public int playerIndex;
    Paint paint;

    public Line() {

    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public void setColor(String color) {
        paint.setColor(Color.parseColor(color));
    }

    public Line(Paint paint) {
        this.paint = new Paint(paint);
    }

    public Line(float startX, float startY, float stopX, float stopY) {
        this.startX = startX;
        this.startY = startY;
        this.stopX = stopX;
        this.stopY = stopY;
    }

    public Paint getPaint() {
        return paint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;
        Line line = (Line) o;
        return (Float.compare(line.startX, startX) == 0 &&
                Float.compare(line.startY, startY) == 0 &&
                Float.compare(line.stopX, stopX) == 0 &&
                Float.compare(line.stopY, stopY) == 0)  ||
                (Float.compare(line.startX, stopX) == 0 &&
                        Float.compare(line.startY, stopY) == 0 &&
                        Float.compare(line.stopX, startX) == 0 &&
                        Float.compare(line.stopY, startY) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startX, startY, stopX, stopY);
    }
}
