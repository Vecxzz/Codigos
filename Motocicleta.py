class Motocicleta:
    
    #Atributo de clase
    nueva = True

    def __init__(self, color, matricula, combustible_litros=10, numero_ruedas=2, marca="", modelo="", fecha_fabricacion="", velocidad_punta=0, peso=0):
        self.color = color
        self.matricula = matricula
        self.combutible_litros = combustible_litros
        self.numero_ruedas = numero_ruedas
        self.marca = marca
        self.modelo = modelo
        self.fecha_fabricacion = fecha_fabricacion
        self.velocidad_punta = velocidad_punta
        self.peso = peso    
        self.motor = False

    def arancar(self):
        if self.motor:
            print("El motor ya estaba encendido")
        else:
            self.motor = True
            print("Arrancando motor")
    
    def detener(self):
        if self.motor:
            self.motor = False
            print("El motor se ha detenido")
        else:
            print("El motor ya estaba detenido")
    
    #Crear Motocicleta
    miMotocicleta = Motocicleta(
        color = "Verde",
        matricula = "ABC123",
        marca = "Yamaha",
        modelo = "FZ25",
        fecha_fabricacion = "2018",
        velocidad_punta = 140,
        peso = 120
    )

    miMotocicleta.arrancar()

    