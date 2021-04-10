package fr.univrouen.cv21rest.controllers;



import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.TestCV;

@RestController
public class PostController {
@RequestMapping(value = "/testpost", method = RequestMethod.POST,consumes = "application/xml")
     public String postTest(@RequestBody String cv) {
     return ("<result><response>Message reçu : </response>" + cv + "</result>");
   }

@PostMapping(value = "/postcv", produces = MediaType.APPLICATION_XML_VALUE)
@ResponseBody
public String postCV() throws IOException{
TestCV cv = new TestCV();
return cv.loadFileXML();
}

}