package CRUD.mission2.Service;

import CRUD.mission2.Pet.Pet;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PetService {

    private List<Pet> PetList = new ArrayList<>(Arrays.asList());

    public List<Pet> getAllPetsList() {

        return PetList;

    } //method to view all pet list

    public Pet getPet(Integer petID) {

        return PetList.stream()
                .filter(pet -> pet.getPetID().equals(petID)).findFirst().get();

    } //method to view certain pet based on petID

    public void addPet(Pet pet) {

        PetList.add(pet);

    } //method to add new pet

    public void updatePet(Pet pet, Integer petID) {

        int counter = 0;
        for (Pet petUpdate: PetList) {

            if (petUpdate.getPetID().equals(petID)) {
                PetList.set(counter, pet);

            }
            counter++;
        }
    } //method to update details of pet

    public void deletePet(Integer petID) {

        PetList.removeIf(pet -> pet.getPetID().equals(petID));

    } //method to delete pet based on petID
}


