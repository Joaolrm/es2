class Carro():
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.ligado = False

    def ligar_motor(self):
        self.ligado = True

    def desligar_motor(self):
        self.ligado = False

c1 = Carro("vw", "gol")
print(c1.ligado)
c1.ligar_motor()
print(c1.ligado)

