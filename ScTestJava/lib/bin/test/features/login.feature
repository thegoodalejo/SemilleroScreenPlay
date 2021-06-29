#Author: juan.ugarriza@sophossolutions.com

Feature: Iniciar sesion en Guru
yo como automatizador quiero ingresar a la pagina Guru

Scenario: Iniciar sesion en Guru
Given Deseo ir a la pagina de "http://demo.guru99.com/v4/"
When Ingreso nombre de usuario "mngr337470" y password "UhUtAmy"
Then Valido que el titulo sea "Manger Id : mngr337470"
