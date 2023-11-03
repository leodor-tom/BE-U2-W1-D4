package TommasoEleodori.BEU2W1D4.dao;

import TommasoEleodori.BEU2W1D4.entities.User;

import java.util.List;

public interface IUserDAO {
    public void save(User user);

    public User findByID(String username);

    public void findByIdAndUpdate(String username);

    public void findByIdAndDelete(String username);

    public List<User> findAll();

    public long count();

    public void filterByFullName(String fullName);

    public User findByEmail(String email);
}
