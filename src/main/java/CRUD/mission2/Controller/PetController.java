package CRUD.mission2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    private PetService petsService;

    @RequestMapping("/pets")
    public List<Pet> allPets() {

        return petsService.getAllPetsList();
    }

    @GetMapping("/pets/{petID}")
    Pet one(@PathVariable ("petID") Integer petID) {

        return petsService.getPet(petID);

    }

    @PostMapping("/pets")
    public void addPet(@RequestBody Pet pet) {

        petsService.addPet(pet);
    }

    @PutMapping("/pets/{petID}")
    public void updatePet(@RequestBody Pet pet, @PathVariable("petID") Integer petID) {

        petsService.updatePet(pet, petID);
    }

    @DeleteMapping ("/pets/{petID}")
    public void deletePet(@PathVariable("petID") Integer petID) {

        petsService.deletePet(petID);
    }
}
