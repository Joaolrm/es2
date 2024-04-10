class Carro():
    def __init__(self, marca, modelo):
        self.__marca = marca
        self.__modelo = modelo
        self.__ligado = False

    def ligar_motor(self):
        self.__ligado = True

    def desligar_motor(self):
        self.__ligado = False

    def get_ligado(self):
        return self.__ligado



c1 = Carro("vw", "gol")
print(c1.get_ligado())
c1.ligar_motor()
print(c1.get_ligado())