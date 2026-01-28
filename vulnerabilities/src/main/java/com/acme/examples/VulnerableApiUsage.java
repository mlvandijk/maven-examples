package com.acme.examples;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;

import java.io.IOException;

public class VulnerableApiUsage {
    ObjectMapper om = new ObjectMapper();
    String empty;
    {
        try {
            empty = om.readValue("{}", String.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        MapDeserializer deserializer = new MapDeserializer(null, null, null, null, null);
        try {
            deserializer.resolve(null);
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        }
    }
}
