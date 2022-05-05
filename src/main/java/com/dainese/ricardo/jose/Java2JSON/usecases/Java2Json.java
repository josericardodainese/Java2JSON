package com.dainese.ricardo.jose.Java2JSON.usecases;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class Java2Json {

    public String execute(final String java) throws IOException {
        return java;
    }

}
