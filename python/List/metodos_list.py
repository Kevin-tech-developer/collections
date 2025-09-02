def append():
    #agrega un elemento a la lista
    numeros = [1,2, 3, 4,5]
    numeros.append(5)
    print(numeros)
    
def extend():
    #extends: agrega todos los elementos de un iterable
    numeros_pares = [2,4,6,8]
    numeros_impares = [1,3,5,7,9]
    todos_numeros = []
    todos_numeros.extend(numeros_pares,)
    todos_numeros.extend(numeros_impares)
    print(todos_numeros)
    
def insert():
    #inserta el elemento x en la posicion i
    numeros = [1,2,4,5,6]
    numeros.insert(2, 3)
    print(numeros)
    
def remove():
    #remove: elimina un elemento en especifico
    numeros = [1,2,3,4,5,6]
    numeros.remove(3)
    print(numeros)
    
def pop():
    #elimina un elemento en especifico por su indice y lo devuelve
    numeros = [1,2,3,4,5]
    numero_eliminado = numeros.pop(2)
    print(f"numero eliminado: {numero_eliminado}")
    
def clear():
    #limpia toda la lista
    numeros = [1,2,3,4]
    numeros.clear()
    if not numeros:
        print("la lista esta vacia")
    else:
        print(f"la lista tiene: {numeros}")
        
def index():
    #index: devuelve el indice del objeto
    numeros = [1,2,3,4,5]
    indice = numeros.index(2)
    print(f"el indice del numero es : {indice}")
    
def count():
    #count: devuelve cuantas veces aparece x en la lista
    numeros = [1,2,3,4,5,2]
    cantidad = numeros.count(2)
    print(f"el numero aparece: {cantidad}")
    
def sort():
    #sort: ordena la lista
    numeros = [2,1,5,3,4,8]
    numeros.sort()
    print(numeros)
    
def reverse():
    #reverse: invierte los elementos de la lista
    numeros = [1,2,3,4,5,6]
    numeros.reverse()
    print(numeros)

    
    
    
def main():
    reverse()
if __name__ == "__main__":
    main()