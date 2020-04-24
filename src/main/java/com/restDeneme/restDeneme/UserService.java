package com.restDeneme.restDeneme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService  {
    public static List<dbUser> userList=new ArrayList<>();

    @Autowired
    UserRepository userRepository;
    static {
        dbUser u1=new dbUser( "user1");
        dbUser u2=new dbUser( "user2");
        dbUser u3=new dbUser( "user3");

        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
    }
public void save(dbUser newUser ){
userRepository.save(newUser);
 userList.add(newUser);

}
public dbUser getUserFindById(int id){
  //  User user:userRepository.(id)

    for (dbUser user: userList
         ) {
       if (  user.getId()==id)
           return  user;

    }
    return null;
}
}
