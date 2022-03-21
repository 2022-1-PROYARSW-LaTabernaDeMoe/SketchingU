package SketchingU.SketchingU.Commons;

import org.springframework.stereotype.Service;

import java.util.List;


public interface GenericServiceAPI<T, ID> {
    public T save(T entity);
    public void delete(ID id );
    public T get(ID id);
    List<T> getAllUsers();
}
