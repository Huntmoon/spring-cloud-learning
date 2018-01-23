package com.huntmoon.servlet.async;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wangtao
 * @since 2018/1/15
 */
@WebServlet(urlPatterns = "/hello",asyncSupported = true)
@Slf4j
public class AsyncServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AsyncContext asyncContext = req.startAsync();
        log.info("主线程");
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(() -> {
            try {
//                Thread.sleep(2000);
                asyncContext.getResponse().getWriter().write("test");
            } catch (IOException e) {
                e.printStackTrace();
            }
            log.info("异步线程");
            asyncContext.complete();
        });
    }
}
