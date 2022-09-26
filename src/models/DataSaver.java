package models;

public interface DataSaver <T>{
    void save (T data);
    T load();
}
