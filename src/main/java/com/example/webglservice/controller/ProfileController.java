package com.example.webglservice.controller;

import com.example.webglservice.model.ProfileDto;
import com.example.webglservice.service.ProfileServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProfileController {
    //@Autowired
    private final ProfileServiceImpl profileService;

    @RequestMapping(method=RequestMethod.POST,path ="/registration")
    public @ResponseBody ProfileDto registrate(@RequestParam String nickname){
        String hash = "hash-value";
        ProfileDto profileDto = profileService.createProfile(new ProfileDto(nickname,hash));
        return profileDto;
    }
    /*@GetMapping("/parameters")
    public String showParameters() throws IOException, ScriptException, NoSuchMethodException {
//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("JavaScript");

// read script file
//        engine.eval(Files.newBufferedReader(Paths.get("C:/Scripts/Jsfunctions.js"), StandardCharsets.UTF_8));
//
//        Invocable inv = (Invocable) engine;
// call function from script file
//        inv.invokeFunction("yourFunction", "param");
        return "userParameters";
        // мне теперь нужно связать переменные по названию и пока что запульнуть хотя бы JSON в класс юзера, а дальше
        // уже посмотрим, как разделить параметры по колонкам
        // для начала вытащим значение хеша
        // потом попробуем вытащить значение
    }

    @GetMapping("/profileWithName")
    public Profile showUserInfo(@RequestParam String nickname){
        return status.equals("Not registrated")? new Profile("noName","noHash") : new Profile("noName2","noHash2");
    }*/

    @GetMapping()
    public ModelAndView getCurrencyPriceChanging(Model model){
       // Profile profile = new Profile("name1","hash1");
        return new ModelAndView("greetingPage.html");
    }
    @GetMapping("/get")
    public String get(){
        ProfileDto profile = new ProfileDto("name1","hash1");
        ProfileDto profileDto = profileService.createProfile(profile);
        return "userParameters";
    }
}
