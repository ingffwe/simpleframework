package demo.reflect;

public class ReflectTarget {
    public static void main(String[] args) {
        ReflectTarget reflectTarget = new ReflectTarget();
        Class reflectTargetClass1 = reflectTarget.getClass();
        System.out.println(reflectTargetClass1.getName());
    }
}
