package com.dainese.ricardo.jose.Java2JSON.java2json.outlayer.entrypoints;

import com.dainese.ricardo.jose.Java2JSON.java2json.outlayer.entrypoints.constants.ControllerConstants;
import com.dainese.ricardo.jose.Java2JSON.usecases.Java2Json;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = ControllerConstants.V1)
public class Java2JsonController {

    private final Java2Json java2Json;

    /**
     * Ponto de entrada POST da aplicação para converter uma classe JAVA em Json
     *
     * @param java - classe Java em String para ser convertida
     */

    @PostMapping(ControllerConstants.JAVA2JSON)
    @ResponseStatus(HttpStatus.OK)
    public void submitJava2Json(@RequestBody final String java) throws IOException {
        java2Json.execute(java);
    }

}
