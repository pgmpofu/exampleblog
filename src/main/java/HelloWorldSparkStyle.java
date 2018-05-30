/**
 * Created by patiencempofu on 2018/05/30.
 */

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

public class HelloWorldSparkStyle {

  public static void main(String args[]) {

      Spark.get("/hello", new Route() {
          public Object handle(Request request, Response response) throws Exception {
              return "Hello World From Spark";
          }
      });

  }
}
