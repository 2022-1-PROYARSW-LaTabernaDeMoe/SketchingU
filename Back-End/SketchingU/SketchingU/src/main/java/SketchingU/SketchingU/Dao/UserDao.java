package SketchingU.SketchingU.Dao;

import SketchingU.SketchingU.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,String> {

}
