package org.example;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.servlet.*;


@ThreadSafe
public class Factorizer implements Servlet{
    @GuardedBy("this") private int num;
    private final AtomicLong count = new AtomicLong(0);
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest req, ServletResponse resp) {
        BigInteger i = extractFromRequest(req);
        BigInteger [] factors = factor(i);
        count.incrementAndGet();
        encodeIntToResponse(resp, factors);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

    private void encodeIntToResponse(ServletResponse res, BigInteger[] fact) {

    }
    private BigInteger extractFromRequest(ServletRequest req) {
        return new BigInteger(String.valueOf(new int[1]));
    }

    private BigInteger[] factor(BigInteger i) {
        return new BigInteger(String.valueOf(new int[1])).sqrtAndRemainder();
    }
}
