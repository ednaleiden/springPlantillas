package com.projectPlantillas.manejoFormularios.Controller;


import com.projectPlantillas.manejoFormularios.Model.Userio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {


    @GetMapping("/registrar")
    public String mostrarFormularios(Model model){
        Userio user = new Userio();
        model.addAttribute("user",user);

        List<String> profesiones = Arrays.asList("programador","tester","arquitecto");
        model.addAttribute("profesiones",profesiones);

        return "registrarFormulario";

    }
}
