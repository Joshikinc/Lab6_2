package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

@WebServlet("/sort")
public class SortServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Получение введенного пользователем массива чисел
        String input = request.getParameter("numbers");
        String[] numberStrings = input.split(",");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i].trim());
        }

        // Сортировка массива чисел
        Arrays.sort(numbers);

        // Установка отсортированного массива в атрибут запроса
        request.setAttribute("sortedNumbers", numbers);

        // Перенаправление на JSP для отображения отсортированного массива
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}