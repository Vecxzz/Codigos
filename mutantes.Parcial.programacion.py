def isMutante(adn):
    #Crear array de las letras
    
    print("El ADN quedo asi:")
    for i in range(6):
        for j in range(6):
            print(adn[i][j],end=" ")
        print(" ")
    aux=0
    #Saber si hay 4 letras iguales horizontalmente
    for i in range(6):
        for j in range(3):
            if(adn[i][j]==adn[i][j+1]and
                adn[i][j]==adn[i][j+2]and
               adn[i][j]==adn[i][j+3]):
                aux+=1
                break
               
    #Saber si hay 4 letras iguales verticalmente
    for j in range(6):
        for i in range(3):
            if(adn[i][j]==adn[i+1][j]and
                adn[i][j]==adn[i+2][j]and
               adn[i][j]==adn[i+3][j]):
                aux+=1
                
                
    #Saber si hay 4 letras iguales de forma diagonal de arriba a la izquierda hacia abajo a la derecha
    for i in range(3):
        for j in range(3):
            if(adn[i][j]==adn[i+1][j+1]and
                adn[i][j]==adn[i+2][j+2]and
               adn[i][j]==adn[i+3][j+3]):
                aux+=1
                break
                
     #Saber si hay 4 letras iguales de forma diagonal de arriba a la derecha de abajo a la izquierda
    i=5
    j=-1
    while i>2:
        while j<-3:
            if(adn[i][j]==adn[i-1][j-1]and
                adn[i][j]==adn[i-2][j-2]and
               adn[i][j]==adn[i-3][j-3]):
                aux+=1
                j-=1
                break
        i-=1
            
    if aux>=2:
        return True
    else:
        return False
  
def validarCaracter(caracteres,letra):
    for i in range(6):
        caracter=caracteres[i]
        if caracter.upper() in letra:
            continue
        else:
            return False
    return True

def completarFilas(letra):
    retorno=[]
    for i in range(6):
        while True:
            fil=input(f"Ingrese la fila {(i+1)}: ").upper()
            if len(fil)==6:
                if validarCaracter(fil,letra):
                    retorno.append(fil)
                    break
                else:
                    print("Error algunos de los caracteres no son válidos")
            else:
                print("Error números de caracteres incorrectos")
                print("------------------------------")

    return retorno

letras="ATCG"
print("Ingrese el ADN de la persona")
print("Ingrese las filas con 6 caracteres")
ADN=[]
ADN=completarFilas(letras)

if isMutante(ADN):
    print("La persona es mutante")
else:
    print("La persona no es mutante")