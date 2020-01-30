package org.iata.resource;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.security.cert.X509Certificate;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/sslclientauthenticationtest")
public class SslClientAuthenticationTestResource {

    @Autowired
    private HttpServletRequest request;

    @RequestMapping(method = GET, value = "/", produces={MediaType.TEXT_PLAIN_VALUE})
    @ApiOperation(value = "Returns the distinguished name for the received SSL client certificate")
    public ResponseEntity<String> doIt() {
        X509Certificate[] clientCertificateChain =
                (X509Certificate[])request.getAttribute("javax.servlet.request.X509Certificate");
        X509Certificate clientCertificate = clientCertificateChain[0];
        Principal subjectDN = clientCertificate.getSubjectDN();
        return new ResponseEntity<>(String.format("Server side received (and validated) the following client certificate: %s", subjectDN), HttpStatus.OK);
    }

}
