package com.cdac.controller;

import java.util.Base64;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.cdac.pojos.Image;
import com.cdac.services.CustomerService;
import com.mysql.fabric.Response;

@Controller
@RequestMapping(value="/image")
public class ImageController {
 
	@Autowired
	CustomerService custservice;
	
	@RequestMapping(value="/save")
	public String showImageForm()
	{
		System.out.println("in image show controller");
		return "imagesave";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String imageSave(@RequestParam("imgfile") MultipartFile imagefile,Image img)
	{
		System.out.println("image is"+imagefile.getName());
	int id=custservice.saveImage(imagefile,img);
	System.out.println("image saved with id "+id);
		return "imagestored";
	}
	
	@RequestMapping(value="/getimage")
	public String getImage(ModelMap map,HttpServletResponse res)
	{
		System.out.println("in get imge constructor");
	Image img=custservice.getImage(4);
    System.out.println("img name is"+img.getImgname());
  byte[] b=Base64.getEncoder().encode(img.getImage());

    try
    {
   String base64Encoded = new String(b, "UTF-8");
   map.addAttribute("image", base64Encoded);
   map.addAttribute("imagename", img.getImgname());
    }catch(Exception ex)
    {
    	System.out.println("image reading failed");
    }
	return "imagestored";
	}
	
	
	
	
}
