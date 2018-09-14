package com.liang.jtab.indicator;

import android.graphics.Canvas;

public abstract class Indicator {
    public float left = 0;
    public float right = 0;
    private float widthScale = 0.5f;
    private int width = -1;
    private int height = 10;

    private boolean transitionScroll;

    public abstract void draw(Canvas canvas, float left, float right, int tabHeight);

    public float getWidthScale() {
        return widthScale;
    }

    public Indicator setWidthScale(float widthScale) {
        this.widthScale = widthScale;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Indicator setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Indicator setHeight(int height) {
        this.height = height;
        return this;
    }

    public Indicator setTransitionScroll(boolean transitionScroll) {
        this.transitionScroll = transitionScroll;
        return this;
    }

    public boolean isTransitionScroll() {
        return transitionScroll;
    }
}
