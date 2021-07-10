package ua.goit.api.service;

import ua.goit.api.command.PetCommands;
import ua.goit.api.command.model.Pet;
import ua.goit.api.command.model.PetStatus;

import java.net.http.HttpResponse;
import java.util.List;

public class PetService {
    private final PetCommands petCommands = new PetCommands();
    private final JSONConverter converter = new JSONConverter();
    private final messageCreator messageCreator = new messageCreator();

    public String findByStatus(PetStatus status){
        HttpResponse<String> response = petCommands.findByStatus(status.toString().toLowerCase());
        List<Pet> pets = converter.convertPetJSONResponseToList(response);
        return messageCreator.joinListElements(pets);
    }
    public String findById(long id){
        HttpResponse<String> response = petCommands.findById(id);
        Pet pet = converter.convertPetJSONResponseToPet(response);
        return pet.toString();
    }

    public String delete(long id) {
        HttpResponse<String> response = petCommands.delete(Long.parseLong(id));
        //ApiResponse apiResponse = converter.convertResponseToApiResponse(response);
        //return viewMessages.apiResponseMessage(apiResponse);
        return converter.convertResponseToApiResponse(response);
    }
}
