package ua.goit.api.service;

import ua.goit.api.command.model.ApiResponse;
import ua.goit.api.command.model.Pet;

import java.util.List;
import java.util.StringJoiner;

public class messageCreator {
    public String joinListElements(List<Pet> pets){
        StringJoiner joiner = new StringJoiner("\n\n");
        for (Pet pet:pets) {
            joiner.add(pet.toString());
        }
        return joiner.toString();
    }

    public String apiResponseMessage(ApiResponse apiResponse) {
        return switch (apiResponse.getCode() / 100) {
            case 2 -> "Ваш запрос успешно обработан";
            case 4 -> "Введите корректный ID питомца";
            default -> "Введите корректные данные";
        };
    }
}
