/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonbuilders;

import entity.User;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 *
 * @author Pinki
 */
public class JsonUser {
    public String createJsonUser(User user) throws IOException{
      String userJson=null;
      JsonPerson jsonPerson = new JsonPerson();
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("id", user.getId())
          .add("login", user.getLogin())
          .add("reader", jsonPerson.createJsonReader(user.getPerson()));
          String jserJson=null;
          try (Writer writer = new StringWriter()){
              Json.createWriter(writer).write(job.build());
              userJson = writer.toString();
          }
        return userJson;
    }
    public JsonObject createJsonObjectUser(User user) throws IOException{
      String userJson=null;
      JsonPerson jsonPerson = new JsonPerson();
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("id", user.getId())
          .add("login", user.getLogin())
          .add("reader", jsonPerson.createJsonReader(user.getPerson()));
          
        return job.build();
    }
}
