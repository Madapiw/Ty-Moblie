package bdbt_project.bdbt_client_server;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorController implements ErrorController{

    @RequestMapping("/errors")
    public String errorHandler(HttpServletRequest request){
        Object status =request.getAttribute((RequestDispatcher.ERROR_STATUS_CODE));

        if(status != null){
            Integer statusCode = Integer.valueOf(status.toString());
            if(statusCode == HttpStatus.FORBIDDEN.value()){
                return "errors/403";
            }
            else if(statusCode == HttpStatus.NOT_FOUND.value()){
                return "errors/404";
            }
            else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()){
                return "errors/500";
            }
            else if(statusCode == HttpStatus.GATEWAY_TIMEOUT.value()){
                return "errors/504";
            }
            else {
                return "errors/other";
            }
            return "errors/other";
        }
    }
}
