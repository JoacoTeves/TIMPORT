/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author jteve
 */
public class PRODUCTO {
    protected String CODIGO_PRODUCTO;
    private final String TIPO, UNIDAD_MEDIDA, DESCRIPCION;
    private final int CANTIDAD;
    private final float PRECIO_UNITARIO;

    public PRODUCTO(String CODIGO_PRODUCTO, String TIPO, String UNIDAD_MEDIDA, String DESCRIPCION, int CANTIDAD, float PRECIO_UNITARIO) {
        this.CODIGO_PRODUCTO = CODIGO_PRODUCTO;
        this.TIPO = TIPO;
        this.UNIDAD_MEDIDA = UNIDAD_MEDIDA;
        this.DESCRIPCION = DESCRIPCION;
        this.CANTIDAD = CANTIDAD;
        this.PRECIO_UNITARIO = PRECIO_UNITARIO;
    }

    public String getCODIGO_PRODUCTO() {
        return CODIGO_PRODUCTO;
    }

    public String getTIPO() {
        return TIPO;
    }

    public String getUNIDAD_MEDIDA() {
        return UNIDAD_MEDIDA;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public float getPRECIO_UNITARIO() {
        return PRECIO_UNITARIO;
    }
    
    
}
