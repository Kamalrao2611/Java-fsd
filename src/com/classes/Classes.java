package com.classes;


class OuterClass {
    private int outerData = 10;

    class InnerClass {
        public void display() {
            System.out.println("Inner class display: " + outerData);
        }
    }

    public void outerDisplay() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

public class Classes {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerDisplay();
    }
}
