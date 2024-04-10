class Carro {
    constructor(marca, modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
    }

    ligar_motor() {
        this.ligado = true;
    }

    desligar_motor() {
        this.ligado = false;
    }
}

const c1 = new Carro("VW", "Gol");

console.log(`Modelo: ${c1.modelo}, Marca: ${c1.marca}, Ligado: ${c1.ligado}`);

c1.ligar_motor();

console.log(`Modelo: ${c1.modelo}, Marca: ${c1.marca}, Ligado: ${c1.ligado}`);
