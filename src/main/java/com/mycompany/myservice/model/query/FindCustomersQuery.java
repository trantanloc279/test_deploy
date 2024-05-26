package com.mycompany.myservice.model.query;

public record FindCustomersQuery(int pageNo, int pageSize, String sortBy, String sortDir) {}
