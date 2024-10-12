package com.example.acceptanceTests.resources;

import com.github.tomakehurst.wiremock.client.WireMock;

import static com.example.acceptanceTests.resources.WiremockStartup.PORT;


public class WiremockShutdown {


    public static void main(String[] args) {
        WireMock.configureFor(PORT);
        WireMock.shutdownServer();
    }
}
