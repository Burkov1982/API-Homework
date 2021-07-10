package ua.goit.api.command;

import ua.goit.api.command.model.Pet;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PetCommands implements Command<Pet>{
    private final HttpClient client = HttpClient.newHttpClient();
    private static final String HOST = "https://petstore.swagger.io/v2/";
    private static final String PET = "pet/";
    private static final String FIND_BY_STATUS = "findByStatus?status=";

    public HttpResponse<String> findByStatus(String status){
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.format("%s%s%s%s", HOST, PET, FIND_BY_STATUS, status)))
                .GET()
                .build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return response;
    }

    public HttpResponse<String> findById(long id){
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.format("%s%s%d", HOST, PET, id)))
                .GET()
                .build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return response;
    }

    @Override
    public HttpResponse<String> delete(long id){
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.format("%s%s%d", HOST, PET, id)))
                .DELETE()
                .build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return response;
    }

    @Override
    public HttpResponse<String> create(Pet entity) {
        return null;
    }

    @Override
    public HttpResponse<String> update(Pet entity) {
        return null;
    }
}