package SketchingU.SketchingU.Commons;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public abstract class GenericServiceImpl<T,ID> implements  GenericServiceAPI<T,ID>{

    @Override
    public T  save(T entity) {
        return getDao().save(entity);
    }

    @Override
    public void delete(ID id) {
        getDao().deleteById(id);
    }

    @Override
    public T get(ID id) {
        Optional<T> user = getDao().findById(id);
        if(user.isPresent()){
            return user.get();
        }
        return null;
    }

    @Override
    public List getAllUsers() {
        List<T> todos = new ArrayList<>();
        getDao().findAll().forEach(obj -> todos.add(obj));
        return todos;
    }

    public abstract CrudRepository<T,ID> getDao();
}
