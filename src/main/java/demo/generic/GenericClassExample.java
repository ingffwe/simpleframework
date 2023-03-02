package demo.generic;

import lombok.Data;

@Data
public class GenericClassExample<T> {
    private T member;
    public GenericClassExample(T member){
        this.member = member;
    }
    public T handleSomething(T target){
        return target;
    }
    public static <E> void printArray(E[] inputArray){
        for(E element:inputArray){
            System.out.printf("%s",element);
            System.out.printf(" ");
        }
        System.out.println();;
    }

}
