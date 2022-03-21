package SketchingU.SketchingU.ServicesImpl;
import SketchingU.SketchingU.Commons.GenericServiceImpl;
import SketchingU.SketchingU.Dao.UserDao;
import SketchingU.SketchingU.Model.User;
import SketchingU.SketchingU.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends GenericServiceImpl<User,String> implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public CrudRepository<User, String> getDao() {
        return userDao;
    }

}
