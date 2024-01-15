package uz.pdp.db;

import java.util.List;

public interface Repository<T> {
    void add(T t);
    List<T> findAll();
    void update(T t);
    void delete(T t);
}
