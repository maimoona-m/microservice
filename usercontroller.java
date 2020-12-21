package com.maimoona.futureXUserApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
public class usercontroller {
    @Autowired
    private userrepository userrepository;
    @RequestMapping("/")
    public List<user> getuser()
    {

        return userrepository.findAll();
    }
    @RequestMapping("/{id}")
    public List<user> getspecificuser(@PathVariable("id")  BigInteger id)
    {
        return userrepository.finduserid(id);
    }

    @RequestMapping("/{id}")
    public List<user> getspecificorse(@PathVariable("id")  BigInteger id)
    {
        return userrepository.findcourse(id);
    }

}
