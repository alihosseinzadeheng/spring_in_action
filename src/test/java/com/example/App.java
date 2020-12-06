package com.example;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class App {


    public static void main(String[] args) throws ParseException {

        JSONParser parser = new JSONParser();
        String string = null;
        Object object = null;


        string = "{\n" +
                "   \"order\":[\n" +
                "      \"bkc6o6fbufnetkuzbd3as8q1ih\"\n" +
                "   ],\n" +
                "   \"posts\":{\n" +
                "      \"bkc6o6fbufnetkuzbd3as8q1ih\":{\n" +
                "         \"id\":\"bkc6o6fbufnetkuzbd3as8q1ih\",\n" +
                "         \"create_at\":1601983121795,\n" +
                "         \"update_at\":1601983121795,\n" +
                "         \"edit_at\":0,\n" +
                "         \"delete_at\":0,\n" +
                "         \"is_pinned\":false,\n" +
                "         \"user_id\":\"qakrk6jgrtypfcaft645ea8pgh\",\n" +
                "         \"channel_id\":\"4rc6ro5nzfrqir9h36x7hfu4po\",\n" +
                "         \"root_id\":\"\",\n" +
                "         \"parent_id\":\"\",\n" +
                "         \"original_id\":\"\",\n" +
                "         \"message\":\"Salam\",\n" +
                "         \"type\":\"\",\n" +
                "         \"props\":{\n" +
                "            \n" +
                "         },\n" +
                "         \"hashtags\":\"\",\n" +
                "         \"pending_post_id\":\"\",\n" +
                "         \"metadata\":{\n" +
                "            \n" +
                "         }\n" +
                "      }\n" +
                "   },\n" +
                "   \"next_post_id\":\"\",\n" +
                "   \"prev_post_id\":\"\"\n" +
                "}";
        object = parser.parse(string);
        System.out.println(object);

    }
}
