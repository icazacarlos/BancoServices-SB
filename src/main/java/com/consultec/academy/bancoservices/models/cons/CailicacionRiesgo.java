package org.academia.consultec.dia4.constantes;

public enum CailicacionRiesgo {
    AAA(1),
    AA(2),
    A(3),
    BBB(4),
    BB(5),
    B(6),
    C(7),
    D(8),
    E(9);

    int idRiesgo;

    CailicacionRiesgo(int idRiesgo) {
        this.idRiesgo = idRiesgo;
    }

    public int getIdRiesgo() {
        return idRiesgo;
    }
}
