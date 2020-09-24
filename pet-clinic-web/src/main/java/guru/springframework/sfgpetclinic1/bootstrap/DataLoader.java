package guru.springframework.sfgpetclinic1.bootstrap;

import guru.springframework.sfgpetclinic1.model.Owner;
import guru.springframework.sfgpetclinic1.model.PetType;
import guru.springframework.sfgpetclinic1.model.Vet;
import guru.springframework.sfgpetclinic1.services.OwnerService;
import guru.springframework.sfgpetclinic1.services.PetTypeService;
import guru.springframework.sfgpetclinic1.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    //We do not need to do @autowire here
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog  = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat  = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(dog);
        Owner owner1 = new Owner();


        owner1.setFirstName("Micheal");
        owner1.setLastName("Mangazie");

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Wiyaou");
        owner2.setLastName("Daruises");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();

        vet1.setFirstName("Jockes");
        vet1.setLastName("Sam");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Malin");
        vet2.setLastName("Dao");

        vetService.save(vet2);

        System.out.println("Loaded Vets ....");

    }
}
