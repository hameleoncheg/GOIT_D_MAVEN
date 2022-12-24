package project;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class MyApp {
    public static void main(String[] args) {
        Person person = new Person("Oleksii","Shevchuk");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
