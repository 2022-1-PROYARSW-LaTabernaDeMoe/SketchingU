package SketchingU.SketchingU.Dao;

import SketchingU.SketchingU.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User,Long> {
    User findByUsername(String usuario);
}
