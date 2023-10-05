def suma(x, y):
    res = x+y
    return res


def dni_valido(dni):
    if len(dni) >= 7 and len(dni) <= 8:
        return True
    else:
        return False

dni_usuario = input("Ingrese su DNI: ")
dni_valido(dni_usuario)