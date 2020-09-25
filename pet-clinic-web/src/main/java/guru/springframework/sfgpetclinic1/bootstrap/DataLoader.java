package guru.springframework.sfgpetclinic1.bootstrap;

import guru.springframework.sfgpetclinic1.model.Owner;
import guru.springframework.sfgpetclinic1.model.Pet;
import guru.springframework.sfgpetclinic1.model.PetType;
import guru.springframework.sfgpetclinic1.model.Vet;
import guru.springframework.sfgpetclinic1.services.OwnerService;
import guru.springframework.sfgpetclinic1.services.PetTypeService;
import guru.springframework.sfgpetclinic1.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        PetType savedCatPetType = petTypeService.save(cat);
        Owner owner1 = new Owner();

        owner1.setFirstName("Micheal");
        owner1.setLastName("Mangazie");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("258-478-8956");

//        Pet mikesPet = new Pet();
//
//        mikesPet.setPetType(savedDogPetType);
//        mikesPet.setOwner(owner1);
//        mikesPet.setBirthDate(LocalDate.now());
//        mikesPet.setName("Rosco");
//        owner1.getPets().add(mikesPet);
//
//        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Wiyaou");
        owner2.setLastName("Daruises");
        owner2.setAddress("562 Magelan");
        owner2.setCity("Fairfax");
        owner2.setTelephone("520-458-8548");

        Pet fionaCat = new Pet();
        fionaCat.setName("Fiona");
        fionaCat.setOwner(owner2);
        fionaCat.setBirthDate(LocalDate.now());
        fionaCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionaCat);

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
