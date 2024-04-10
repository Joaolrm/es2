from abc import ABC, abstractmethod

class Carro(ABC):
    @abstractmethod
    def cortar_giro(self):
        pass

    @abstractmethod
    def __str__(self):
        pass

class CarroLuxuoso(Carro):
    def __init__(self):
        self.bancos = "Couro"

    def cortar_giro(self):
        print ("Esse carro cortou os giros em 9000 rpm")

    def __str__(self):
        return f"Esse carro tem os bancos de {self.bancos}"

class CarroPopular(Carro):
    def __init__(self):
        self.bancos = "Tecido"

    def cortar_giro(self):
        print ("Esse carro cortou os giros em 6000 rpm")

    def __str__(self):
        return f"Esse carro tem os bancos de {self.bancos}"

class CarroFactory:
    def factory(self, estilo_carro):
        if estilo_carro == "Luxuoso":
            return CarroLuxuoso()
        
        if estilo_carro == "Popular":
            return CarroPopular()

factory = CarroFactory()
c1 = factory.factory("Luxuoso")
print (c1)
c1.cortar_giro()

c2 = factory.factory("Popular")
print (c2)
c2.cortar_giro()