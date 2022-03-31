package SketchingU.SketchingU.Commons;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Optional;

@Service
public abstract class GenericServiceImpl<T,ID extends Serializable> implements  GenericServiceAPI<T,ID>{

    @Override
    public T get(ID id) {
        Optional<T> user = getDao().findById(id);
        if(user.isPresent()){
            return user.get();
        }
        return null;
    }

    public abstract CrudRepository<T,ID> getDao();
}
