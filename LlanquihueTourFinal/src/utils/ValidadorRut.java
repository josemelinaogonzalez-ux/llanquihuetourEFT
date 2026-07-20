package utils;

import exceptions.RutInvalidoException;

public class ValidadorRut {

    public static void validar(String rut) throws RutInvalidoException {

        if (rut == null || rut.trim().isEmpty()) {
            throw new RutInvalidoException("El RUT no puede estar vacío.");
        }

        if (!rut.contains("-")) {
            throw new RutInvalidoException(
                    "El RUT debe contener un guion. Ejemplo: 12345678-9"
            );
        }

        if (rut.length() < 9 || rut.length() > 10) {
            throw new RutInvalidoException(
                    "El formato del RUT no es válido."
            );
        }
    }

    private ValidadorRut() {
    }
}