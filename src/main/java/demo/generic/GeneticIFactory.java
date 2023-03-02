package demo.generic;

public interface GeneticIFactory<T,N> {
    T nextObject();
    N nextNumber();

}
