package SketchingU.SketchingU.Commons;

import java.io.Serializable;

public interface GenericServiceAPI<T, ID extends Serializable> {
    public T get(ID id);
}
