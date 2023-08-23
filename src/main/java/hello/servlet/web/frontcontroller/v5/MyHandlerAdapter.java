package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface MyHandlerAdapter {

    boolean supports(Object handler); // 켠트롤러 정보가 넘어왔을 때 지원 가능한지 아닌지 판단

    ModelView handle(HttpServletRequest request , HttpServletResponse response, Object handler) throws ServletException, IOException;
}
