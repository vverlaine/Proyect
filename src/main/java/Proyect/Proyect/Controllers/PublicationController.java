package Proyect.Proyect.Controllers;

import Proyect.Proyect.Model.Publication;
import Proyect.Proyect.Repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/publication")
public class PublicationController {

    @Autowired
    private PublicationRepository publicationRepository;

    @PostMapping("/public")
    private Publication create(@RequestBody Publication publication){
        System.out.println("NUEVA PUBLICACION "+ publication.getUserName());
        return publicationRepository.save(publication);
    }

    @GetMapping("/getpublication")
    public Iterable<Publication> publications(){
        return publicationRepository.findAll();
    }


}
