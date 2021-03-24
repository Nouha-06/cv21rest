@RestController
public class GetController {
@GetMapping("/resume")
public String getListCVinXML() {
return "Envoi de la liste des CV";
}
@GetMapping("/id")
public String getCVinXML() {
return "Détail du CV demandé";
}
}
