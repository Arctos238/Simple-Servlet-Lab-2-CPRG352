/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Arcto
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String result = request.getParameter("result");
        String firstNumberStr = request.getParameter("first_number");
        String secondNumberStr = request.getParameter("second_number");
        String buttonPressed = request.getParameter("button");

        try {
            int firstNumber = Integer.parseInt(firstNumberStr);
            int secondNumber = Integer.parseInt(secondNumberStr);

            if (buttonPressed.equals("+")) {
                result = (firstNumber + secondNumber) + "";
            } else if (buttonPressed.equals("-")) {
                result = (firstNumber - secondNumber) + "";
            } else if (buttonPressed.equals("*")) {
                result = (firstNumber * secondNumber) + "";
            } else if (buttonPressed.equals("%")) {
                result = (firstNumber / secondNumber) + "";
            }

        } catch (Exception ex) {
            result = "invalid";
        }

        request.setAttribute("first_number", firstNumberStr);
        request.setAttribute("second_number", secondNumberStr);
        request.setAttribute("result", result);

        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
