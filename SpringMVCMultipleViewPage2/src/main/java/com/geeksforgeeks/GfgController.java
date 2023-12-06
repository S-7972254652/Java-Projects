package com.geeksforgeeks;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GfgController
{
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
