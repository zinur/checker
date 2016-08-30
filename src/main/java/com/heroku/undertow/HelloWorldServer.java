package com.heroku.undertow;

import java.util.Optional;

import io.undertow.Undertow;
import io.undertow.util.Headers;

public class HelloWorldServer {

    public static void main(final String[] args) {
        Optional<String> property = Optional.ofNullable(System.getProperty("server.port"));

        Undertow server = Undertow.builder().addHttpListener(property.isPresent()? Integer.valueOf(property.get()):8080, "localhost").setHandler(exchange -> {
            exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
            exchange.getResponseSender().send("Hello World and heroku");
        }).build();
        server.start();
    }

}
