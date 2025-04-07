package co.edu.uptc.prototype;

public interface IProtoType<T> {
    
    public T clone();
    public T deepClone();
}
