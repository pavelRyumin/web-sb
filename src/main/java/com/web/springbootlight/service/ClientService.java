package com.web.springbootlight.service;

import com.web.springbootlight.model.Client;

import java.util.List;

public interface ClientService {

    // Создает нового клиента
    void create(Client client);

    // Возвращает список всех имеющихся клиентов
    List<Client> readAll();

    //  Возвращает клиента по его ID
    Client read(int id);

    // Обновляет клиента с заданным ID, в соответствии с переданным клиентом
    boolean update(Client client, int id);

    // Удаляет клиента с заданным ID
    boolean delete(int id);
}
