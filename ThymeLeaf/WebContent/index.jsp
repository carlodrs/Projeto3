<!DOCTYPE html>
 
<html xmlns:th="http://www.thymeleaf.org">

 <head>
 <title>Thymeleaf BRQ</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" type="text/css" media="all"
      href="css/thvsjsp.css" th:href="@{/css/thvsjsp.css}"/>
  </head>
 
  <body>
 
    <h2>Thymeleaf BRQ MINI</h2>

    <h3 th:text="#{mensage.inicial}">Oi</h3>
 
    <form action="#" th:object="${subscription}" th:action="@{/subscribeth}">
 
      <fieldset>
 
        <div>
          <label for="email" th:text="#{user.email}">Email: </label>
          <input type="text" th:field="*{email}" />
        </div>
        
         
 
        <div class="submit">
          <button type="submit" name="save" th:text="#{button.submit}">Navegar</button>
        </div>
 
      </fieldset>
 
    </form>
 
  </body>

</html>