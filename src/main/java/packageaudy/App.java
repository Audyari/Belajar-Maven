package packageaudy;

import com.google.gson.Gson;
import packageaudy.Dependency.Person;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();

        Person person = new Person("Audyari Wiyono");
        String json = gson.toJson(person);

        System.out.println(json);
    }
}
