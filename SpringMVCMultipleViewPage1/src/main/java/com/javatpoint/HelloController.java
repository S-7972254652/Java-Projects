package com.javatpoint;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  
@RestController  
@RequestMapping("/api")  
public class HelloController {  
@RequestMapping("/hello")  
    public String redirect()  
    {  
        return "viewpage";  
    }     
@RequestMapping("/helloagain")  
public String display()  
{  
    return "final";  
}  
}
