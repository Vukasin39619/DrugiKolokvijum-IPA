<%-- 
    Document   : Prikazi
    Created on : Jun 4, 2023, 4:28:26 PM
    Author     : Vukisha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<%@ page import="Beans.FrancuskiBuldog"%>
<%@ page import="Beans.Labrador"%>
<%@ page import="Beans.Karakteristika"%>

<%
      HttpSession sesija = request.getSession();
      FrancuskiBuldog buldog =(FrancuskiBuldog) sesija.getAttribute("buldog");
      
      Labrador labrador = (Labrador)sesija.getAttribute("labrador");
      
      Karakteristika karak = buldog.getKarakteristika();
      Karakteristika karak2 = labrador.getKarakteristika();
      
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prikaz</title>
        <style>
            *{
                font-family: Verdana;
                background-color: lightsteelblue;
            }
            table,tr,th,td{
                border: solid;
                background-color: white;

            }
            h1{
                background-color: white;

            }
            td{
                text-align: center;
                font-size: 10pt;
                padding: 5px;
            }
            th{
                font-size:10pt;
            }
            body{
                display: flex;
                align-items: center;
                justify-content: center;
            }
            .Container{
                margin-top: 6%;
                box-shadow: 5px 5px 10px lightslategrey;
                padding: 2%;
                background-color: grey;
                border-radius: 35px;
            }
            .blabla{
                background-color: white;
                padding: 40px
            }
           h5{
                text-align: center;
                background-color: grey;
                margin-top: 0px;
                margin-bottom: 0px;
            }
        </style>
    </head>
    <body>
        <div class="Container">
            <h5>©Vukašin Petrović</h5>
            <div class="blabla">
                <h1>Prikaz tabele</h1>
                <table>
                    <tr>
                        <th>Rasa</th>
                        <th>Vrsta</th>
                        <th>Godine</th>
                        <th>Velicina psa</th>
                        <th>Duzina dlake</th>
                        <th>Boja dlake</th>
                        <th>Boja oka</th>
                    </tr>
                    <tr>
                        <td><%= buldog != null ? buldog.getRasa() : "No Data Available" %></td>
                        <td><%= buldog != null ? buldog.getVrsta() : "No Data Available" %></td>
                        <td><%= buldog != null ? buldog.getGodine() : "No Data Available" %></td>
                        <td><%= karak   != null ? karak.getVelicina(): "No Data Available"  %></td>
                        <td><%=karak.getDuzinaDlake()%></td>
                        <td><%=karak.getBojaDlake()%></td>
                        <td><%=karak.getBojaOka()%></td>
                    </tr>
                    <tr>
                        <td><%= buldog != null ? labrador.getRasa() : "No Data Available" %></td>
                        <td><%= buldog != null ? labrador.getVrsta() : "No Data Available" %></td>
                        <td><%= buldog != null ? labrador.getGodine() : "No Data Available" %></td>
                        <td><%= karak   != null ? karak2.getVelicina(): "No Data Available"  %></td>
                        <td><%=karak2.getDuzinaDlake()%></td>
                        <td><%=karak2.getBojaDlake()%></td>
                        <td><%=karak2.getBojaOka()%></td>
                    </tr>
                </table>
            </div>
        </div>



    </body>

</html>

