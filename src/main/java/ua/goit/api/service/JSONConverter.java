package ua.goit.api.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ua.goit.api.command.model.ApiResponse;
import ua.goit.api.command.model.Pet;

import java.net.http.HttpResponse;
import java.util.List;

public class JSONConverter {
    private final Gson gson = new Gson();

    public List<Pet> convertPetJSONResponseToList(HttpResponse<String> response) {
        String temp = response.body();
        return gson.fromJson(temp, new TypeToken<List<Pet>>(){}.getType());
    }
    public Pet convertPetJSONResponseToPet(HttpResponse<String> response) {
        String temp = response.body();
        return gson.fromJson(temp, new TypeToken<Pet>(){}.getType());
    }

    public String convertResponseToApiResponse(HttpResponse<String> response) {
        String temp = response.body();
        return gson.fromJson(temp, new TypeToken<ApiResponse>(){}.getType());
    }
}
//    public String getCommentsByPIDAndWInFile(int id) throws IOException, InterruptedException {
//        List<Comment> commentsList = Utils.gson.fromJson(response.body(), new TypeToken<List<Comment>>(){}.getType());
//        String fileName = String.format("user-%d-post-%d-comments.json", id, post.getId());
//        File file = new File("src\\main\\resources\\"+fileName);
//        if (!file.exists()){
//            file.createNewFile();
//        }
//        try (FileWriter fileWriter = new FileWriter(file)) {
//            fileWriter.write(new GsonBuilder().setPrettyPrinting().create().toJson(commentsList));
//            fileWriter.flush();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        return "Comments in file";
//    }

