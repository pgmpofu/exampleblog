
import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Sorts;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patiencempofu
 */
public class MongoDBIntegrationClass {

   public static void main(String args[]) {

       MongoClient mongoClient = new MongoClient();
       MongoDatabase database = mongoClient.getDatabase("video");
       MongoCollection<Document> collection = database.getCollection("movieDetails");

       FindIterable<Document> projection = collection.find(eq("rated", "PG-13")).filter(eq("year", 2013)).filter(eq("awards.win", 0)).projection(Projections.include("title"));
       System.out.println(projection.first());
   }
    
}
