package com.github.unijobs.api.services;

import com.github.unijobs.api.model.User;
import com.github.unijobs.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public Optional<User> findOne(long id){
        return  userRepository.findById(id);
    }

    public User update(User user) {
        Optional<User> optionalUser = this.findOne(user.getId());

        if (optionalUser.isPresent()){
            return this.save(user);
        }else {
            return null;
        }
    }

    public void delete(Long id) {
        Optional<User> optionalUser = this.findOne(id);

        if (optionalUser.isPresent()){
            userRepository.deleteById(id);
        }
    }
}
