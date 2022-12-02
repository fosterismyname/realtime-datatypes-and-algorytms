package ru.mirea.seventhpart.task2;

public class MathFunc {

    private final double re;
    private final double im;

    public MathFunc(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public MathFunc powCompl() {
        double mRe = re * re - im * im;
        double mIm = 2 * re * im;
        return new MathFunc(mRe, mIm);
    }

    public double absCompl() {
        return Math.sqrt((re*re) + (im*im));
    }

    @Override
    public String toString() {
        return re + " + " + im + "i";
    }
}