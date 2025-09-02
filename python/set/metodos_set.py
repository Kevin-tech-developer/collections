def add():
    #add: agrega un elemento al set si ya no esta
    numeros = {1,2,3,4,5}
    numeros.add(6)
    print(numeros)
    
def remove():
    #remove: elimina un elemento especifico del set
    numeros = {1,2,3,4,5,6}
    numeros.remove(2)
    print(numeros)
    
    
def pop():
    #pop: elimina y devuelve un elemento aleatorio
    numeros = {1,2,3,4,5,6,7}
    eliminado = numeros.pop()
    print(f"el numero eliminado es: {eliminado}")
    
def clear():
    #clear: limpia todo el set
    numeros = {1,2,3,4}
    numeros.clear()
    if not numeros:
        print("el conjunto esta vacio")
    else:
        print("la lista no esta vacia")
        
def update():
    #update: agrega elementos de un iterable a este conjunto
    numeros = {1,2,3,4,5}
    mas_numeros = {4,5,6,7,8,9}
    numeros.update(mas_numeros)
    print(numeros)
        
        
        
def main():
    update()
    
if __name__ == "__main__":
    main()