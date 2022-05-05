package com.dainese.ricardo.jose.Java2JSON.usecases;

import com.dainese.ricardo.jose.Java2JSON.entities.JsonObject;
import com.dainese.ricardo.jose.Java2JSON.entities.JavaObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
@RequiredArgsConstructor
public class Java2Json {

    @Autowired
    private final ObjectMapper mapper;

    public JsonObject execute(final JavaObject java) throws IOException {
        return JsonObject.builder()
                .stringJson(mapper.writeValueAsString(java))
                .build();
    }

}
