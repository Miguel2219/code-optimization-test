
# Refactorization Quiz: Applying the SDLC Process

## Overview

This quiz is designed to test your ability to refactor code using **professional best practices**. Working in **pairs**, you will refactor provided code by improving its readability, efficiency, and scalability. You will also apply the **Software Development Life Cycle (SDLC)**, using structured phases to enhance the code. Each group will fork the repository, refactor the code, and submit a pull request with their improvements.

---

## Objectives

- Apply concepts from **Unit 1: Data Storage and Control Flow**:
  - Writing variables and constants
  - Arithmetic operators
  - Input/output system
  - Conditional operators
  - Control structures
  - Avoiding magic numbers
  - Lists of data with arrays
  - Basic SDLC principles

---

## SDLC Approach

You must follow the **SDLC process** to refactor the code:

1. **Phase 1: Requirements Analysis** – Understand the original code, identify its weaknesses, and define improvement requirements.
2. **Phase 2: Design** – Plan how to improve the code structure, renaming variables, optimizing logic, and making it more efficient.
3. **Phase 3: Implementation** – Refactor the code following your design plan, ensuring better readability and efficiency.
4. **Phase 4: Testing** – Test the refactored code with multiple inputs to ensure correctness and improvements.
5. **Phase 5: Documentation & Maintenance** – Write clear comments, and submit your final version, ensuring the code is easy to maintain.

---

## Instructions

1. **Repository Forking**:
   - Fork the repository to create a copy in your GitHub account.
   - Clone the repository to your local machine.

2. **Analyze the Code**:
   - Carefully read the provided code.
   - Identify magic numbers, unclear variable names, or inefficient logic.

3. **Refactor the Code**:
   - Improve the variable names, replace magic numbers with constants, and optimize the control structures.
   - Make sure to add comments explaining the logic and changes you made.
   - Apply **arrays** where repetition of variables exists.

4. **Test the Refactored Code**:
   - Run the program with different inputs to validate that the refactored code functions as expected.
   - Ensure the program handles errors gracefully (e.g., invalid input, edge cases).

5. **Submit Your Work**:
   - Once you complete the refactorization, push your changes to your forked repository.
   - Create a pull request (PR) to the original repository, explaining the improvements you made and how you followed the **SDLC** approach.

DOCUMENTACION:
Primer punto (AgeValidation):
El codigo presentaba inconsistencia como: 
1. presentaba numeros magicos
2. presentaba logica redundante
como programador realice las debidas modificaciones para el codigo:
1. elimine los numeros magicos y los asigne a una variable constante
2. elimine la logida redundante, implementando un estructura 'if-else'
3. y aparte de los errores lo modifique de una forma que el usuario pueda ingresar su edad.

Segundo punto (Store):
1. Se eliminaron todos los valores magicos
2. Se agrego una entrada, para que el usuario ingrese el numero de productos
3. Se creo dos listas, una para almancenar el precio de los productos,y la otra para almacenar las cantidades de cada producto, donde cada informacion de un producto se encuentra en el mismo indice de ambas listas.
4. Se realizo dos ciclos FOR, para que el usuario ingrese la informacion pedida, y asi almancenar en las listas.
5. Se realizo un ultimo ciclo FOR, para hacer la sumatoria total de la compra
6. Se evaluo que si el total de la compra es mayor a 50, fue buena. de lo contrario, fue mala.

Terce punto (TaxCalculation):
1. Se eliminaros los valores magico
2. se pidio al usuario la cantidad de productos
3. Se crearon dos listas para almacenar, el precio de cada prodcuto con su tasa, con la longitud de la cantidad de productos ingresada por el usuario
4. se crearon dos ciclos FOR, para pedir al usuario que ingrese la informacion, y añadirla en las listas.
5. cada producto tiene un indice en la lista
6. se creo un ultimo ciclo FOR, para calcular el total de la tasa.
7. Se evaluo con un condicional, que si la tasa es mayor a 50, se muestra al usuario que tuvo una tasa alta. de lo contrario, se imprime tasa baja.