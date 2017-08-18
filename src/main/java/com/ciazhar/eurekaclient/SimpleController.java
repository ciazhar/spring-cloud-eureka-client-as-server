package com.ciazhar.eurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ciazhar on 8/18/17.
 */

@RestController
public class SimpleController {

    @RequestMapping("/api/halo")
    public String halo (){
        return "Halo ini dari Server";
    }
}
