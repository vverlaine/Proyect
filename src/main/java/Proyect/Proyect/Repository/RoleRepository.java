package Proyect.Proyect.Repository;

import Proyect.Proyect.Model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role,String> {

    Role findByRole(String role);
}
