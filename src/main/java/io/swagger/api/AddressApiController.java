package io.swagger.api;

import io.swagger.model.Address;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-28T16:59:58.194634916Z[GMT]")
@RestController
public class AddressApiController implements AddressApi {

    private static final Logger log = LoggerFactory.getLogger(AddressApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AddressApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Address> addAdress(@Parameter(in = ParameterIn.DEFAULT, description = "Neue Adresse hinzufügen", required=true, schema=@Schema()) @Valid @RequestBody Address body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Address>(objectMapper.readValue("{\n  \"zip\" : \"94301\",\n  \"city\" : \"Palo Alto\",\n  \"street\" : \"437 Lytton\",\n  \"address_id\" : 0,\n  \"state\" : \"CA\"\n}", Address.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Address>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Address>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteAddress(@Parameter(in = ParameterIn.PATH, description = "Adress id to delete", required=true, schema=@Schema()) @PathVariable("product_id") Long productId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Address> findAdress() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Address>(objectMapper.readValue("{\n  \"zip\" : \"94301\",\n  \"city\" : \"Palo Alto\",\n  \"street\" : \"437 Lytton\",\n  \"address_id\" : 0,\n  \"state\" : \"CA\"\n}", Address.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Address>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Address>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Address> findAllAddresses() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Address>(objectMapper.readValue("{\n  \"zip\" : \"94301\",\n  \"city\" : \"Palo Alto\",\n  \"street\" : \"437 Lytton\",\n  \"address_id\" : 0,\n  \"state\" : \"CA\"\n}", Address.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Address>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Address>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Address> updateAddress(@Parameter(in = ParameterIn.DEFAULT, description = "Adresse updaten", required=true, schema=@Schema()) @Valid @RequestBody Address body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Address>(objectMapper.readValue("{\n  \"zip\" : \"94301\",\n  \"city\" : \"Palo Alto\",\n  \"street\" : \"437 Lytton\",\n  \"address_id\" : 0,\n  \"state\" : \"CA\"\n}", Address.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Address>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Address>(HttpStatus.NOT_IMPLEMENTED);
    }

}
