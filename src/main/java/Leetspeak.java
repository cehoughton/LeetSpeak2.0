import java.util.ArrayList;
// import java.util.Arrays;

public class Leetspeak {
  public static void main(String[] args) {}

   public static String leetSpeak (String word) {
     String[] wordArray = word.split(" ");
     String newWord = "";
     for ( String eachWord : wordArray ) {

    eachWord = eachWord.replaceAll("e", "3");
    eachWord = eachWord.replaceAll("o", "0");
    eachWord = eachWord.replaceAll("I", "1");
    eachWord = eachWord.replaceAll("s", "z");

    for ( Integer index = 0 ; index < eachWord.length ; index++ )
     if (eachWord.getChareachWord.startsWith("s")) {

     }

     newWord = newWord.concat(" " +eachWord);
     newWord = newWord.trim();
  } return newWord;
}
}

// String results = word.replaceAll("e", "3");
// String newresults = results.replaceAll("o", "0");
// String newnewresults = newresults.replaceAll("I", "1");
// String newnewnewresults = newnewresults.replaceAll("s", "z");
// return newnewnewresults;
// }


// import java.util.HashMap;
//
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
//
// import static spark.Spark.*;
//
// public class App {
//   public static void main(String[] args) {
//     staticFileLocation("/public");
//     String layout = "templates/layout.vtl";
//
//     get("/", (request, response) -> {
//           HashMap model = new HashMap();
//           model.put("template", "templates/home.vtl" );
//
//           return new ModelAndView(model, layout);
//         }, new VelocityTemplateEngine());
//
//       get("/photos", (request, response) -> {
//           HashMap model = new HashMap();
//           model.put("template", "templates/photos.vtl" );
//
//           return new ModelAndView(model, layout);
//         }, new VelocityTemplateEngine());
//
//       get("/dates", (request, response) -> {
//           HashMap model = new HashMap();
//           model.put("template", "templates/dates.vtl" );
//
//           return new ModelAndView(model, layout);
//         }, new VelocityTemplateEngine());
//
//       get("/form", (request, response) -> {
//       HashMap model = new HashMap();
//
//       model.put("template", "templates/form.vtl");
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//     get("/greeting_card", (request, response) -> {
//     HashMap model = new HashMap();
//     String recipient = request.queryParams("recipient");
//     String sender = request.queryParams("sender");
//
//     model.put("recipient", recipient);
//     model.put("sender", sender);
//     model.put("template", "templates/greeting_card.vtl");
//     return new ModelAndView(model, layout);
//   }, new VelocityTemplateEngine());
//
//
//
//   }
// }

//
// get("/", (request, response) -> {
//       HashMap model = new HashMap();
//       model.put("template", "templates/home.vtl" );
//       return new ModelAndView(model, "templates/layout.vtl");
//     }, new VelocityTemplateEngine());
//
//   get("/photos", (request, response) -> {
//       HashMap model = new HashMap();
//       model.put("template", "templates/photos.vtl" );
//
//       return new ModelAndView(model, "templates/layout.vtl");
//     }, new VelocityTemplateEngine());
