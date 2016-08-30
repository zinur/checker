package com.heroku.undertow;

import io.undertow.Undertow;
import io.undertow.util.Headers;

public class HelloWorldServer {

    public static void main(final String[] args) {
        Undertow server = Undertow.builder().addHttpListener(8080, "localhost").setHandler(exchange -> {
            exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
            exchange.getResponseSender().send("Hello World and heroku");
        }).build();
        server.start();
    }

}
