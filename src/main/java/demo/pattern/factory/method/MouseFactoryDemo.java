package demo.pattern.factory.method;

import demo.pattern.factory.entity.Mouse;

public class MouseFactoryDemo {
    public static void main(String[] args) {
        MouseFactory mouseFactory = new HpmouseFactory();
        Mouse mouse = mouseFactory.createMouse();
        mouse.sayHi();
    }
}
