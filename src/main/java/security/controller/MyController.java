package security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiGuanda
 * @date 2023/2/13 上午 7:26:49
 * @description no description right now...
 * @filename MyController.java
 */

@RestController
public class MyController {


    @GetMapping("/hello")
    public String hello() {

        return "Hay my dear Dage!";

    }


}
