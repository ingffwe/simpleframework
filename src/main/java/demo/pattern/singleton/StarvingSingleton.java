package demo.pattern.singleton;

public class StarvingSingleton {
    private StarvingSingleton(){};
    private static final StarvingSingleton starvingSingleton = new StarvingSingleton();
    public static StarvingSingleton getInstance(){
        return starvingSingleton;
    }

    public static void main(String[] args) {
        System.out.println(StarvingSingleton.getInstance());
        System.out.println(StarvingSingleton.getInstance());
    }
}
