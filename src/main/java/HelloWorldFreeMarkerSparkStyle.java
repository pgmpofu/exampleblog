import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.halt;

/**
 * Created by patiencempofu on 2018/05/31.
 */
public class HelloWorldFreeMarkerSparkStyle {

    public static void main(String args[]) {

        final Configuration configuration = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
        configuration.setClassLoaderForTemplateLoading(ClassLoader.getSystemClassLoader(), "/");

        Spark.get("/hello", new Route() {
            public Object handle(Request request, Response response) throws Exception {

                StringWriter stringWriter = new StringWriter();

                try {
                    Template template = configuration.getTemplate("hello.ftl");
                    Map<String, Object> helloMap = new HashMap();
                    helloMap.put("name", "FreeMarker");
                    template.process(helloMap, stringWriter);

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

    }
}
