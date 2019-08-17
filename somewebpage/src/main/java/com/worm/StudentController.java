package com.worm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Paths;


@Controller
@RequestMapping("/")
public class StudentController {

    @RequestMapping("/showForm")
     public String showForm(Model model){
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @RequestMapping(value = "/processForm", method= RequestMethod.POST)
    public String processForm(@ModelAttribute("student") Student theStudent){


        MultipartFile file = theStudent.getFile();

        System.out.println(file.getOriginalFilename());
/*        try {

            theStudent.getFile().transferTo(Paths.get("C://" + theStudent.getFile().getOriginalFilename()));
        }catch (IOException e ){
            e.printStackTrace();
        }finally {
            System.out.println("error has occured");
        }*/


        return "student-confirmation";
    }


}
