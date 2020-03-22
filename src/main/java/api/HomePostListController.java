package api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomePostListController
 */

@RestController
public class HomePostListController {
    
    @RequestMapping("/HomePostList")
    String homeList()
    {
        return "hello list";
    }
    
}