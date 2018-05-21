package gtdollar.com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gtdollar.com.test.User;
import gtdollar.com.test.contract.AddUserRequest;
import gtdollar.com.test.contract.AddUserResponse;
import gtdollar.com.test.repo.UserRepository;

@RestController
@RequestMapping(path = "/user") // This means URL's start with /demo (after Application path)
public class UserController {
 @Autowired // This means to get the bean called userRepository
 // Which is auto-generated by Spring, we will use it to handle the data
 private UserRepository userRepository;
 

 @PostMapping(path = "/add", consumes = "application/json", produces = "application/json") //
 public AddUserResponse addNewUser(@RequestBody AddUserRequest addUserRequest) {
  AddUserResponse addUserResponse = new AddUserResponse();

  // Validate Reuqest
  if (addUserRequest == null || addUserRequest.getEmail() == null) {
   addUserResponse.setSucess(false);
   addUserResponse.setErrorMessage("Invalid Request!");
   return addUserResponse;
  }
  // Query User from DB
  User user = userRepository.findUserByEmail(addUserRequest.getEmail());
  if (user == null) {
   // If User not found, then create a new User
   user = new User();
   user.setBalance(10000);
   user.setUserEmail(addUserRequest.getEmail());
   userRepository.save(user);
   
   addUserResponse.setSucess(true);
   addUserResponse.setBalance(10000.0);
   
  } else {
   // User already registered.
   addUserResponse.setSucess(false);
   addUserResponse.setErrorMessage("User Already Exist!");
  }
  return addUserResponse;
 }

}