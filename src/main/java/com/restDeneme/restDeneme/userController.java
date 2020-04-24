package com.restDeneme.restDeneme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {
    @Autowired
UserService userService;


    @RequestMapping(method= RequestMethod.GET, path="/getUser/{id}")
public void getUserfromName(@PathVariable int id){

userService.getUserFindById(id);


}

@RequestMapping(method = RequestMethod.GET, path ="/saveUser/{name}")
    public void saveUser(@PathVariable String name   ){
        dbUser user=new dbUser(name);
                userService.save(user);
}

}
