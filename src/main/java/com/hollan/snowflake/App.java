package com.hollan.snowflake;

import com.snowflake.snowpark_java.*;

/**
 * Hello world!
 *
 */
public class App {
    public String run(Session session, String fromTable, String toTable, int count) {
        return "Hello Snowflake";
    }

    public static void main(String[] args) {
        App a = new App();
        System.out.println(a.run(null, "foo", "bar", 0));
    }

    public App() {

    }
}
