
package com.Tienda.controller;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Tienda.serviceimpl.FirebaseStorageServiceImpl;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;




@Controller
public class indexController {
    
    @RequestMapping("/")
    public String page(Model model) {
      /*
        Object principal= SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserDetails user=null;
        if(principal instanceof UserDetails){
            user=(UserDetails)principal;
        }
        if(user!=null){
            
        }
*/
        return "index";
    }
    
    
    
}
