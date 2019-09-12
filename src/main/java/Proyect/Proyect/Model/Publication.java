package Proyect.Proyect.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("publication")
public class Publication {

    @Id
    private String id;
    private String idUser;
    private String userName;
    private String publ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPubl() {
        return publ;
    }

    public void setPubl(String publ) {
        this.publ = publ;
    }
}
