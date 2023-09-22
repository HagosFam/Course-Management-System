package com.miu.CourseMgtSys.domain;

@FunctionalInterface
public interface FuncationalInterface {
    // demonstrate functional interface here
    void calculate();
}

class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        FuncationalInterface fi = () -> {
            System.out.println("This is the value of pi" + pi);
        };

        fi.calculate();

    }
}