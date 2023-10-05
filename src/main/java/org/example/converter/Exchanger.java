package org.example.converter;

public class Exchanger {
    protected Type input;
    protected Type output;
    protected double value;

    public Exchanger(double value, Type input, Type output) {
        this.input = input;
        this.output = output;
        this.value = value;
    }

    public Type getInput() {
        return input;
    }

    public Type getOutput() {
        return output;
    }

    public double getValue() {
        return value;
    }

    public void setInput(Type input) {
        this.input = input;
    }

    public void setOutput(Type output) {
        this.output = output;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
