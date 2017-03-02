public class ComplexNumber {
    private int real,imaginary;
    public ComplexNumber(int areal, int aimaginary){
        real = areal;
        imaginary = aimaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public ComplexNumber sum(ComplexNumber complex){
        return new ComplexNumber(real + complex.getReal(), imaginary + complex.getImaginary());
    }

    public ComplexNumber product(ComplexNumber complex){
        return new ComplexNumber(real * complex.getReal() - imaginary * complex.imaginary,
                real * complex.getImaginary() + imaginary * complex.getReal());
    }

    public ComplexNumber subtract(ComplexNumber complex){
        return new ComplexNumber(real - complex.getReal(), imaginary - complex.getImaginary());
    }

    public ComplexNumber absoluteValue(){
        return new ComplexNumber(Math.abs(real),Math.abs(imaginary));
    }

    public boolean equals(ComplexNumber complex){
        return real == complex.real && imaginary == complex.getImaginary();
    }
}
