package TommasoEleodori.BEU2W1D4.dao;

import TommasoEleodori.BEU2W1D4.entities.User;
import TommasoEleodori.BEU2W1D4.exceptions.ItemNotFoundException;
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
        log.info(user.getUsername() + " saved");
    }

    @Override
    public User findByID(String username) throws ItemNotFoundException {
        return userRepo.findById(username).orElseThrow(() -> new ItemNotFoundException(username));
    }

    @Override
    public void findByIdAndUpdate(String username, User user) throws ItemNotFoundException {
        User found = this.findByID(username);
        found.setFullName(user.getFullName());
        found.setEmail(user.getEmail());
        userRepo.save(found);
        log.info(user.getUsername() + " update whit success");

    }

    @Override
    public void findByIdAndDelete(String username) throws ItemNotFoundException{
        User found = this.findByID(username);
        userRepo.delete(found);
        log.info(found.getUsername() + " was deleted with success");

    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public long count() {
        return userRepo.count();
    }


}
