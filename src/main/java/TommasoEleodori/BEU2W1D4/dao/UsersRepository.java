package TommasoEleodori.BEU2W1D4.dao;

import TommasoEleodori.BEU2W1D4.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, String> {
    
}
