/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonbuilders;

import entity.Person;
import java.io.Serializable;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 *
 * @author Pinki
 */
public class JsonPerson {
    public JsonObject createJsonReader(Person person){
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("id", person.getId())
          .add("name", person.getFirstname())
          .add("firstname", person.getFirstname())
          .add("lasttname", person.getLasttname())
          .add("email", person.getEmail())
                ;
        return job.build();
    }
}
