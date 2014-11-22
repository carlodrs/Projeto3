<!DOCTYPE html>
<html>
<head>
<title>Bem vindo ao Projeto CRUD</title>
	
	<link rel="stylesheet" type="text/css" href="/ProjetoCrud/css/style.css">

</head>
	<body>
		
		<div id="container">
			
			<jsp:include page="header.jsp"/>
	
			<section id="banner">
				<!-- seção do banner do projeto -->
				<img src="/ProjetoCrud/imagens/projeto.jpg">	
			</section>

			<div class="line">
			</div>	
			
			<section id="explain">
				<!-- explicação do porquê do projeto -->
			
            	<div>
                	O projeto CRUD é um projeto que foi elaborado pelo Analista Programador Carlos Renato Domingos da									
                    Silva. O projeto visa apoiar os estudos de java e desenvolvimento de sistemas.	
                </div>
            	
                <!-- explicação do porquê do projeto -->
				<div>
                	O projeto envolve realizar cadastro de cliente e seus dados pessoais, como por exemplo, RG, CPF e
                    endereço. 
                    <p> O projeto foi desenvolvido utilizando as seguintes tecnologias:</p>
                    
                    <ul>
                    	<li>
                        	HTML 5
                        </li>
                        <li>
                        	CSS 3
                        </li>
                        <li>
                        	Jquery
                        </li>
                        <li>
                        	Mysql
                        </li>
                        <li>
                        	Struts 2
                        </li>
                        <li>
                        	Tomcat
                        </li>
                        <li>
                        	JPA 2
                        </li>
                	</ul>
                </div>
            
                <div class="line red">
                </div>	
            </section>
			
			
			<jsp:include page="footer.jsp"/>
		</div>
	</body>
</html>