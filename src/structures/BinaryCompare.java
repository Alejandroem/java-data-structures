package structures;

public interface BinaryCompare<T> {
    // Return 0 if equal -1 if less +1 if more
    Integer call(T valueA, T valueB);
}