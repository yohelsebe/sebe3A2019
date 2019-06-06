package com.example.sebe3a2019.model;

import java.util.List;

public class RestPeopleResponse {
    private int count;
    private String next;
    private List<People> results;

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public List<People> getResults() {
        return results;
    }
}

