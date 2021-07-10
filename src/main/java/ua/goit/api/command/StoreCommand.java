package ua.goit.api.command;

import ua.goit.api.command.model.Order;

import java.net.http.HttpResponse;

public class StoreCommand implements Command<Order>{
    @Override
    public HttpResponse<String> create(Order entity) {
        return null;
    }

    @Override
    public HttpResponse<String> delete(long id) {
        return null;
    }

    @Override
    public HttpResponse<String> update(Order entity) {
        return null;
    }
}
