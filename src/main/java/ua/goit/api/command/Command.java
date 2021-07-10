package ua.goit.api.command;

import java.net.http.HttpResponse;

public interface Command<T> {
    HttpResponse<String> create(T entity);
    HttpResponse<String> delete(long id);
    HttpResponse<String> update(T entity);
}
