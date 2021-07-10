package ua.goit.api.command;

import ua.goit.api.command.model.User;

import java.net.http.HttpResponse;

public class UserCommand implements Command<User>{
    @Override
    public HttpResponse<String> create(User entity) {
        return null;
    }

    @Override
    public HttpResponse<String> delete(long id) {
        return null;
    }

    @Override
    public HttpResponse<String> update(User entity) {
        return null;
    }
}
