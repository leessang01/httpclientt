package org.example.spring;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.io.IOException;
public class Main {
    private static final String USER_AGENT = "Mozila/5.0";
    private static final String GET_URL = "http://www.google.com";

    public static void sendGet() throws IOException{
        Mono<String> mono = WebClient.create()
                .get()
                .uri(GET_URL)
                .retrieve()
                .bodyToMono(String.class);
        mono.subscribe(System.out::println);
    }
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello world!");
        sendGet();
        System.out.println("GET DONE");
    }
}