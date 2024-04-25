<%--
  Created by IntelliJ IDEA.
  User: rubis
  Date: 24/04/2024
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />
    <title>Listas y Tablas </title>
</head>
<body>
<h1> LISTAS Y TABLAS EN HTML</h1>
<div>
    <a href="index.jsp"><span class="material-symbols-outlined">
home
</span></a>
    <a href="ListasYtablas.jsp"><span class="material-symbols-outlined">
format_list_bulleted
</span></a>
    <a href="Formularios.jsp"><span class="material-symbols-outlined">
contract_edit
</span></a>

</div>

<h2>Listas Ordenadas</h2>
<ol>
    <li>Pera</li>
    <li>Manzana</li>
    <li>Uva</li>
    <li>Plátano</li>
    <li>Fresa</li>
    <li>Piña</li>
</ol>
<ol type="I"reversed>
    <li>Pera</li>
    <li>Manzana</li>
    <li>Uva</li>
    <li>Plátano</li>
    <li>Fresa</li>
    <li>Piña</li>
</ol>
<ol start="25">
    <li>Pera</li>
    <li>Manzana</li>
    <li>Uva</li>
    <li>Plátano</li>
    <li>Fresa</li>
    <li>Piña</li>
</ol>
<h2>Listas Encadenadas</h2>
<!--una lista dentro de otra lista-->
<ol start="25">
    <li>Pera</li>
    <li>Manzana
        <ol>
            <li>Golden</li>
            <li>Fuji</li>
            <li>Royal</li>
            <li>Reineta</li>
        </ol>
    </li>
    <li>Uva</li>
    <li>Plátano</li>
    <li>Fresa</li>
    <li>Piña</li>
</ol>
<h2>Listas NO Ordenadas</h2>
<!--Estas listas no van con numero sino que van por puntitos,
el siguiente nivel es puntitos en blanco, el siguiente cuadraditos-->
<ul>
    <li>Pera</li>
    <li>Manzana
        <ul>
            <li>Golden</li>
            <li>Fuji</li>
            <li>Royal</li>
            <li>Reineta</li>
    </ul>
    </li>
    <li>Uva</li>
    <li>Plátano</li>
    <li>Fresa</li>
    <li>Piña</li>
</ul>
<h1>Listas de Definiciones</h1>
<dl>
    <dt>Java</dt>
    <dd>Lenguaje de programación del lado del Servidor</dd>
    <dt>JavaScript</dt>
    <dd>Lenguaje de programación del lado del Cliente</dd>
</dl>
<hr>
<h2>Tablas</h2>
<table border="1" style="border-collapse: collapse">
    <tr>
        <td>Nombre</td>
        <td>Apellidos</td>
        <td>Dirección</td>
        <td>Teléfono</td>
        <td>Edad</td>
        <td>Email</td>
        <td>Acciones</td>
    </tr>
    <tr>
        <td>Isabel</td>
        <td>García López</td>
        <td>Pérez Galdós 54 casa 39</td>
        <td>633140730</td>
        <td>35 años</td>
        <td>rubisa_88@hotmail.com</td>
        <td>
            <a href="#"title="Modificar">✏️</a>
            <a href="#"title="Eliminar">🗑️</a>
        </td>
    </tr>
    <tr>
        <td>Miguel </td>
        <td>Martín García</td>
        <td>FedericoGarcía Lorca 6</td>
        <td>633972243</td>
        <td>3 años</td>
        <td>miguelmarting@hotmail.com</td>
        <td>
            <a href="#">✏️</a>
            <a href="#">🗑️</a>
        </td>
    </tr>


</table>
</body>
</html>