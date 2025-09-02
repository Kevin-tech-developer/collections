def count():
    #count: cuenta cuantas veces aparece x en la tupla
    numeros = (1,2,3,4,5,2)
    cantidad = numeros.count(2)
    print(f"el numero aparece: {cantidad}")
    
def index():
    #index: devuelve el indice de la primera paricion de x
    numeros = (1,2,3,5,2)
    indice = numeros.index(2)
    print(f"el indice del numeros es: {indice}")
    
    

def main():
    index()
    
if __name__ == "__main__":
    main()