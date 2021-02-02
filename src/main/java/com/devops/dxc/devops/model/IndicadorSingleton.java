package com.devops.dxc.devops.model;

public class IndicadorSingleton {
    private static IndicadorSingleton single_instance = null;

    private Indicador indicador;

    public static IndicadorSingleton getInstance()
    {
        if (single_instance == null)
            single_instance = new IndicadorSingleton();

        return single_instance;
    }

    public Indicador getIndicador() {
        return indicador;
    }

    public void setIndicador(Indicador indicador) {
        this.indicador = indicador;
    }
}
