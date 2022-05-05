package com.dainese.ricardo.jose.Java2JSON.entities;

import lombok.*;
import lombok.experimental.FieldNameConstants;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
public class JsonObject {
    private String stringJson;
}
