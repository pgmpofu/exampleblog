import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.halt;

/**
 * Created by patiencempofu on 2018/05/31.
 */
public class FruitPicker {

    public static void main(String args[]) {

        final Configuration configuration = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
        configuration.setClassLoaderForTemplateLoading(ClassLoader.getSystemClassLoader(), "/");

        Spark.get("/hello_fruit", new Route() {
            public Object handle(Request request, Response response) throws Exception {

                StringWriter stringWriter = new StringWriter();

                try {
                    Template template = configuration.getTemplate("fruitpicker.ftl");

                    Map<String, Object> fruits = new HashMap();
                    fruits.put("fruits", Arrays.asList("apple, orange, banana, peaches"));
                    template.process(fruits, stringWriter);

                    System.out.println(stringWriter);

                } catch (IOException e) {
                    halt(500);
                    e.printStackTrace();
                } catch (TemplateException e) {
                    e.printStackTrace();
                }

                return stringWriter;
            }
        });

        Spark.post("/favourite_fruit", new Route() {
            public Object handle(Request request, Response response) throws Exception {

                final String fruit = request.queryParams("fruit");
                if (fruit == null) {
                    return "Why don't you pick one";
                } else {

                    return "Your favourite fruit is " + fruit;
                }
            }

        });
    }
}
