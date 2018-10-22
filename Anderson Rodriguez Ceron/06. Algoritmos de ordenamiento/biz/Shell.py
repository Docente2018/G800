class Shell:

    def __init__(self):
        self.cn = 0
        self.ejecutarShell()

    def ordenShell(self, lista, tam):
        inc = 1
        for inc in range(1, tam, inc * 3 + 1):
            while inc > 0:
                for i in range(inc, tam):
                    j = i
                    temp = lista[i]
                    while j >= inc and lista[j - inc] > temp:
                        lista[j] = lista[j - inc]
                        j = j - inc
                    lista[j] = temp
                inc = int(inc / 2)


    def imprimeLista(self, lista):
        print(lista)

    def leeLista(self):
        lista = []
        self.cn = int(input("Cantidad de numeros a ingresar: "))

        for i in range(0, self.cn):
            lista.append(int(input("Ingrese numero %d : " % (i + 1))))
        return lista

    def ejecutarShell(self):
        print('\n' * 100)
        A = self.leeLista()
        self.ordenShell(A, self.cn)
        self.imprimeLista(A)