package Proyect.Proyect.Repository;

import Proyect.Proyect.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
    User findByEmail(String email);
}
