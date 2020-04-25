package com.restDeneme.restDeneme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService  {
    public static List<dbUser> userList=new ArrayList<>();

    @Autowired
    UserRepository userRepository;

public void save(dbUser newUser ){
userRepository.save(newUser);

}
public dbUser getUserFindById(Long id){
    // dbUser user: userList

    Optional<dbUser> user=   userRepository. findById(id);

    if (user.get().getId() != id)
        throw new userNotFoundException("id: " + user.get().getId());

    else return user.get();
}


    public    List<dbUser> getUserFindByName (String name){
        // dbUser user: userList

        List<dbUser> user=   userRepository. findByDbUsername(name);

      //  if (user.get().getId() == id)
        //    throw new userNotFoundException("id: " + user.get().getId());

        //else
        return user;


}
}
