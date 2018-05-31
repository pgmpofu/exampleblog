import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by patiencempofu on 2018/05/31.
 */
public class HelloWorldFreeMarkerStyle {

    public static void main(String args[]) {

        Configuration configuration = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
        configuration.setClassLoaderForTemplateLoading(ClassLoader.getSystemClassLoader(), "/");

        try {
            Template template = configuration.getTemplate("hello.ftl");
            StringWriter stringWriter = new StringWriter();
            Map<String, Object> helloMap = new HashMap();
            helloMap.put("name", "FreeMarker");
            template.process(helloMap, stringWriter);

            System.out.println(stringWriter);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
