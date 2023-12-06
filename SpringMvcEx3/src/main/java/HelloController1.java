import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
@Controller  
public class HelloController1 {  
@RequestMapping(value1 = "", value = "")  
    public String display()  
    {  
        return "viewpage1";  
    }     
}  