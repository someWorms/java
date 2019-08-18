package com.worm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Paths;


@Controller
@RequestMapping("/")
public class StudentController {
    Process process = new Process();


    @RequestMapping("/showForm")
     public String showForm(Model model){
        model.addAttribute("student", new Student());
        return "student-form";
    }



    @PostMapping("uploadImage")
    public String uploadImage(@RequestParam("imageFile") MultipartFile imageFile){

        try {
            process.saveImage(imageFile);
        } catch (Exception e){
            e.printStackTrace();
        }

        return "student-confirmation";
    }

}
