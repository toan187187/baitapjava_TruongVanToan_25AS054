package BT3_1;


public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.imag = imag;
        this.real = real;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i )";
    }

    public boolean isReal() {
        return imag == 0;
        // cách khác:
//        if (imag == 0){
//            return true;
//        } else{
//            return false;
//        }
    }

    public boolean isImaginary() {
        return real == 0;
        // cách khác:
//        if(real==0){
//            return true;
//        } else
//            return false;
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude() {             // CT: căn(a^2+b^2)
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        double newReal = this.real + right.real;
        double newImag = this.imag + right.imag;
        return new MyComplex(newReal,newImag);
    }
}
