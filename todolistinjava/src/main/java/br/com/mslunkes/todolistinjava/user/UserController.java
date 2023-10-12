package br.com.mslunkes.todolistinjava.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */

 @RestController
 @RequestMapping("/users")
 public class UserController {

/**
 * String Texto
 * Integer (int) npumeros inteiros
 * Double (double) números 0.0000
 * Float 9float) números 0.000
 * Char (a B C )
 * Date data
 * 
 * Void - sem retorno
 * 
 */

 /**
  * 
  * Body 
  */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.getUsername());
    }
    
}
