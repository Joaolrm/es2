class Carro:
    def __init__(self, bancos, rpm):
        self.bancos = bancos
        self.rpm = rpm

    def cortar_giro(self):
        print (f"Esse carro cortou os giros em {self.rpm} rpm")

    def __str__(self):
        return f"Esse carro tem os bancos de {self.bancos}"

class CarroLuxuoso(Carro):
    def __init__(self):
        super().__init__("Couro", "9000")

class CarroPopular(Carro):
    def __init__(self):
        super().__init__("Tecido", "6000")

def carro_factory(estilo_carro):
    if estilo_carro == "Luxuoso":
        return CarroLuxuoso()
    if estilo_carro == "Popular":
        return CarroPopular()

c1 = carro_factory("Luxuoso")
print (c1)
c1.cortar_giro()

c2 = carro_factory("Popular")
print (c2)
c2.cortar_giro()