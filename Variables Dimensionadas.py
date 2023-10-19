"""Variables Dimensionadas"""

#Comentario de prueba 2

"""1- Solicitar al usuario que ingrese números, estos deben guardarse en una lista. Para finalizar el usuario debe ingresar 0, el cual no debe guardarse."""
numbers = []

while True:
    number = int(input("Ingrese un número: "))
    if number == 0:
        break
    numbers.append(number)
print(f"Números ingresados: {numbers}")


"""2- A continuación, solicitar al usuario que ingrese un número y, si el número está en la lista, eliminar su primera ocurrencia.
Mostrar un mensaje si no es posible eliminar."""
if numbers:
    number_delete = int(input("Ingrese un número que desee eliminar de la lista: "))
    if number_delete in numbers:
        numbers.remove(number_delete)
        print(f"Se elimino el número {number_delete} de la lista")
        print(f"Lista actualizada: {numbers}")
    else:
        print(f"El número {number_delete} no se encuentra en la lista. No se puede eliminar")


"""3- Imprimir la sumatoria de todos los números de la lista"""
if numbers:
    sum = sum(numbers)
    print(f"La suma de todos los números de la lista es: {sum}")


"""4- Solicitar al usuario otro número y crear una lista con los elementos de la lista original, que sean menores que el número dado.
Imprimir esta nueva lista, iterando por ella."""
if numbers:
    new_number = int(input("Ingrese otro número: "))
    min_numbers = [num for num in numbers if num < new_number]

    print(f"Nueva lista con números menores que {new_number}: {min_numbers}")


"""5- Generar e imprimir una nueva lista que contenga como elementos a tuplas, cada una compuesta por un número de la
lista original y la cantidad de veces que aparece en ella. Por ejemplo, si la lista original es [5,16,2,5,57,5,2],
la nueva lista contendrá: [(5,3),(16,1),(2,2),(57,1)]"""
if numbers:
    numbers_frequency = {}
    for num in numbers:
        if num in numbers_frequency:
            numbers_frequency[num] += 1
        else:
            numbers_frequency[num] = 1

list_of_tuples = [(number, frequency) for number, frequency in numbers_frequency.items()]
print(f"Nueva lista de tuplas: {list_of_tuples}")


"""6- Solicitar al usuario que ingrese los nombres de pila de los alumnos de nivel primario de una escuela, finalizando al ingresar ‘x’.
A continuación, solicitar que ingrese los nombres de los alumnos de nivel secundario, finalizando al ingresar ‘x’.

a.	Informar los nombres de todos los alumnos de nivel primario y de los de nivel secundario, sin repeticiones.
b.	Informar qué nombres se repiten entre los alumnos de nivel primario y secundario.
c.	Informar qué nombres de nivel primario no se repiten en los de nivel secundario."""


