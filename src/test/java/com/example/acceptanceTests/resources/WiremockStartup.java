package com.example.acceptanceTests.resources;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.springframework.http.HttpStatus;
import static com.github.tomakehurst.wiremock.client.WireMock.*;


public class WiremockStartup {

    public static int PORT = 8282;

    private static final WireMockServer WIRE_MOCK_SERVER = new WireMockServer(
            new WireMockConfiguration().port(PORT)
                    .usingFilesUnderClasspath("src/test/java/com/example/acceptanceTests/resources/mocks/"));

    public static void main(String[] args) {
        WIRE_MOCK_SERVER.start();
        WireMock.configureFor(PORT);
        WireMock.stubFor(get(urlEqualTo("/api/ofertas"))
                .willReturn(aResponse().withBodyFile("response.json")
                        .withStatus(HttpStatus.OK.value()))
        );
    }
}
