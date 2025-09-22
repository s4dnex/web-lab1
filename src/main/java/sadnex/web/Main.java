package sadnex.web;

import sadnex.web.fcgi.RequestHandler;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new RequestHandler().start();
        } catch (IOException e) {
            System.err.println("Unexpected error: " + e);
        }
    }
}
