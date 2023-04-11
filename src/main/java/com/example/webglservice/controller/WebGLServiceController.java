package com.example.webglservice.controller;

import com.example.webglservice.model.*;
import com.example.webglservice.repository.FrameBufferRepository;
import com.example.webglservice.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class WebGLServiceController {
    //@Autowired
    private final ProfileServiceImpl profileService;
    private final FragmentShaderService fragmentShaderService;
    private final DataPackageService dataPackageService;
    private final FrameBufferService frameBufferService;
    private final RasterizerService rasterizerService;
    private final TextureService textureService;
    private final TransformFeedbackService transformFeedbackService;
    private final UniformBufferService uniformBufferService;
    private final VertexShaderService vertexShaderService;
    private Integer id;

//    @RequestMapping(method=RequestMethod.POST,path ="/registration")
//    public @ResponseBody ProfileDto registrate(@RequestParam String nickname){
//        String hash = "hash-value";
//        ProfileDto profileDto = profileService.createProfile(new ProfileDto(nickname,hash));
//        return profileDto;
//    }
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

//    @GetMapping("/url")
//    public ModelAndView getCurrencyPriceChanging(){
//        return new ModelAndView("greetingPage");
//    }

    @GetMapping()
    public ModelAndView greetingPage(Model model){
//        model.addAttribute("profile", new Profile());
//        Profile profile = new Profile("kulebyaka","hellohello");
//        profileService.createProfile(profile);
        id = profileService.getId();
        return new ModelAndView("index_old");
    }

    @GetMapping("/test")
    public ModelAndView importPage(Model model){
        return new ModelAndView("index_new");
    }

    @PostMapping("/reg")
    public ResponseEntity<Profile> registrate(@RequestBody Profile profile){
        Profile profileSaved = profileService.createProfile(profile);
        id = profileService.getId();
        return new ResponseEntity<>(profileSaved, HttpStatus.CREATED);
    }

    @PostMapping("/data")
    public ResponseEntity<DataPackage> registrate(@RequestBody DataPackage data){
        DataPackage dataPackageSaved = dataPackageService.createData(data);
        FragmentShader fragmentShader = dataPackageSaved.buildFragmentShader();
        Profile profile = profileService.createProfile(dataPackageSaved.generateProfile());
        fragmentShader.setId(profileService.getId());
        fragmentShaderService.createProfile(fragmentShader);

        FrameBuffer frameBuffer = dataPackageSaved.buildFrameBuffer().setProfile(profile);
        frameBufferService.createFrameBuffer(frameBuffer);

        Rasterizer rasterizer = dataPackageSaved.buildRasterizer().setProfile(profile);
        rasterizerService.createRasterizer(rasterizer);

        Texture texture = dataPackageSaved.buildTexture().setProfile(profile);
        textureService.createTexture(texture);

        TransformFeedback transformFeedback = dataPackageSaved.buildTransformFeedback().setProfile(profile);
        transformFeedbackService.createTransformFeedback(transformFeedback);

        UniformBuffer uniformBuffer = dataPackageSaved.buildUniformBuffer().setProfile(profile);
        uniformBufferService.createRUniformBuffer(uniformBuffer);

        VertexShader vertexShader = dataPackageSaved.buildVertexShader().setProfile(profile);
        vertexShaderService.createVertexShader(vertexShader);

        return new ResponseEntity<>(dataPackageSaved, HttpStatus.CREATED);
    }

    @PostMapping("/fragmentShader")
    public ResponseEntity<FragmentShader> registrate(@RequestBody FragmentShader fragmentShader){
        fragmentShader.setId(id);
        FragmentShader fragmentShaderSaved = fragmentShaderService.createProfile(fragmentShader);
        return new ResponseEntity<>(fragmentShaderSaved, HttpStatus.CREATED);
    }

    @GetMapping("/thanks")
    public String restartSession(Model model){
        return "index_old";
    }
//
//    @GetMapping("/reg")
//    public ModelAndView getCurrencyPriceChanging(Model model){
//        return new ModelAndView("greetingPage");
//    }
//    @PostMapping("/url")
//    public @ResponseBody ModelAndView deleteQuestions(@RequestParam("arr") Optional<String[]> WEBGL_SERVICE_ARRAY) {
//        ModelAndView modelAndView = new ModelAndView("gr");
//        System.out.println(WEBGL_SERVICE_ARRAY);
//        return modelAndView;
//    }
//
//    @GetMapping("/ind")
//    public String thymeleafView(ModelMap model) {
//        model.addAttribute("number", "feqrag");
//        System.out.println(model.getAttribute("number").toString());
//
//        getCurrencyPriceChanging();
//        System.out.println(model.getAttribute("number").toString());
//        return "test";
//    }
//
//    @GetMapping("/reg")
//    public Object doJScodeAndGainParameters(Model model){
//        Object s = model.getAttribute("WebglArr");
//        return s;
//    }
}
