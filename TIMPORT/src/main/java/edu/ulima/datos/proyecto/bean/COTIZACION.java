/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author jteve
 */
public class COTIZACION extends PROVEEDOR{
    protected String CODIGO_COTIZACION;
    private final float FACTURA_TOTAL;

    public COTIZACION(String CODIGO_COTIZACION, float FACTURA_TOTAL, String CODIGO_PROVEEDOR, String NOMBRE_PROVEEDOR, String CORREO_PROVEEDOR, String PAIS, String CIUDAD, int TELEFONO_PROVEEDOR, String CODIGO_PRODUCTO, String TIPO, String UNIDAD_MEDIDA, String DESCRIPCION, int CANTIDAD, float PRECIO_UNITARIO) {
        super(CODIGO_PROVEEDOR, NOMBRE_PROVEEDOR, CORREO_PROVEEDOR, PAIS, CIUDAD, TELEFONO_PROVEEDOR, CODIGO_PRODUCTO, TIPO, UNIDAD_MEDIDA, DESCRIPCION, CANTIDAD, PRECIO_UNITARIO);
        this.CODIGO_COTIZACION = CODIGO_COTIZACION;
        this.FACTURA_TOTAL = FACTURA_TOTAL;
    }

    public String getCODIGO_COTIZACION() {
        return CODIGO_COTIZACION;
    }

    public float getFACTURA_TOTAL() {
        return FACTURA_TOTAL;
    }
    
    
    
}
