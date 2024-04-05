class Carro:
    def dirigir(self):
        pass

class CarroEsportivo(Carro):
    def dirigir(self):
        return "O carro esportivo está dirigindo rápido!"

class CarroFamiliar(Carro):
    def dirigir(self):
        return "O carro familiar está dirigindo com segurança!"

class FabricaDeCarros:
    def criar_carro(self, tipo):
        if tipo == "esportivo":
            return CarroEsportivo()
        elif tipo == "familiar":
            return CarroFamiliar()
        else:
            raise ValueError("Tipo de carro inválido")

# Uso:
fabrica = FabricaDeCarros()
carro = fabrica.criar_carro("esportivo")
print(carro.dirigir())  # Saída: O carro esportivo está dirigindo rápido!