package TommasoEleodori.BEU2W1D4.dao;

import TommasoEleodori.BEU2W1D4.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService implements IUserDAO {
    @Autowired
    private UsersRepository userRepo;

    @Override
    public void save(User user) {
    }

    @Override
    public User findByID(String username) {
        return null;
    }

    @Override
    public void findByIdAndUpdate(String username) {

    }

    @Override
    public void findByIdAndDelete(String username) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void filterByFullName(String fullName) {

    }

    @Override
    public User findByEmail(String email) {
        return null;
    }
}
