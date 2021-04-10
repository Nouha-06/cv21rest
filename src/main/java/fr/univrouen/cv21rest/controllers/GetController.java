package fr.univrouen.cv21rest.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.CV;


@RestController
public class GetController {
        @GetMapping("/resume")
        public String getListCVinXML() {
             return "Envoi de la liste des CV";
           }
        @GetMapping("/id")
        public String getCVinXML(
        @RequestParam(value = "name") String texte) {
        return ("Détail du CV demandé : " + texte);
        }
        @GetMapping("/test")
        public String getCVTestXML(
        @RequestParam(value = "nb") Integer texte,@RequestParam(value = "texte") String texte2 ){
        return ("Test: \n id: " + texte + "\n titre:"+ texte2);
        }
        @RequestMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
        public @ResponseBody CV getXML() {
        CV cv = new CV("HAMILTON","Margaret","1969/07/21","Appollo11@nasa.us");
        return cv;
        }
}
