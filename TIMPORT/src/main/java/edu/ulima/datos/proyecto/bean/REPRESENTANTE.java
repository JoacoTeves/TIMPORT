/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author jteve
 */
public class REPRESENTANTE extends COTIZACION{
    protected String CODIGO_REPRESENTANTE;
    private final String NOMBRE_REPRESENTANTE;
    private final String CORREO_REPRESENTANTE;
    private final int TELEFONO_REPRESENTANTE;

    public REPRESENTANTE(String CODIGO_REPRESENTANTE, String NOMBRE_REPRESENTANTE, String CORREO_REPRESENTANTE, int TELEFONO_REPRESENTANTE, String CODIGO_COTIZACION, float FACTURA_TOTAL, String CODIGO_PROVEEDOR, String NOMBRE_PROVEEDOR, String CORREO_PROVEEDOR, String PAIS, String CIUDAD, int TELEFONO_PROVEEDOR, String CODIGO_PRODUCTO, String TIPO, String UNIDAD_MEDIDA, String DESCRIPCION, int CANTIDAD, float PRECIO_UNITARIO) {
        super(CODIGO_COTIZACION, FACTURA_TOTAL, CODIGO_PROVEEDOR, NOMBRE_PROVEEDOR, CORREO_PROVEEDOR, PAIS, CIUDAD, TELEFONO_PROVEEDOR, CODIGO_PRODUCTO, TIPO, UNIDAD_MEDIDA, DESCRIPCION, CANTIDAD, PRECIO_UNITARIO);
        this.CODIGO_REPRESENTANTE = CODIGO_REPRESENTANTE;
        this.NOMBRE_REPRESENTANTE = NOMBRE_REPRESENTANTE;
        this.CORREO_REPRESENTANTE = CORREO_REPRESENTANTE;
        this.TELEFONO_REPRESENTANTE = TELEFONO_REPRESENTANTE;
    }

    public String getCODIGO_REPRESENTANTE() {
        return CODIGO_REPRESENTANTE;
    }

    public String getNOMBRE_REPRESENTANTE() {
        return NOMBRE_REPRESENTANTE;
    }

    public String getCORREO_REPRESENTANTE() {
        return CORREO_REPRESENTANTE;
    }

    public int getTELEFONO_REPRESENTANTE() {
        return TELEFONO_REPRESENTANTE;
    }
    
    
}
