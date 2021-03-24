package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.*;

public class App 
{
    public static void main(String[] args) throws IOException, InterruptedException {
        Server protoServer = ServerBuilder.forPort(8080)
                .addService(new GreetingServiceImpl())
                .build();
        protoServer.start();
        protoServer.awaitTermination();
    }
}
