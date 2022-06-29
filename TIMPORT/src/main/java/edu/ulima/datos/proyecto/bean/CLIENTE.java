/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author jteve
 */
public class CLIENTE extends REPRESENTANTE{
    protected String CODIGO_CLIENTE;
    private final String NOMBRE_CLIENTE, DIRECCION_CLIENTE, CORREO_CLIENTE;
    private final int TELEFONO_CLIENTE, RUC;

    public CLIENTE(String CODIGO_CLIENTE, String NOMBRE_CLIENTE, String DIRECCION_CLIENTE, String CORREO_CLIENTE, int TELEFONO_CLIENTE, int RUC, String CODIGO_REPRESENTANTE, String NOMBRE_REPRESENTANTE, String CORREO_REPRESENTANTE, int TELEFONO_REPRESENTANTE, String CODIGO_COTIZACION, float FACTURA_TOTAL, String CODIGO_PROVEEDOR, String NOMBRE_PROVEEDOR, String CORREO_PROVEEDOR, String PAIS, String CIUDAD, int TELEFONO_PROVEEDOR, String CODIGO_PRODUCTO, String TIPO, String UNIDAD_MEDIDA, String DESCRIPCION, int CANTIDAD, float PRECIO_UNITARIO) {
        super(CODIGO_REPRESENTANTE, NOMBRE_REPRESENTANTE, CORREO_REPRESENTANTE, TELEFONO_REPRESENTANTE, CODIGO_COTIZACION, FACTURA_TOTAL, CODIGO_PROVEEDOR, NOMBRE_PROVEEDOR, CORREO_PROVEEDOR, PAIS, CIUDAD, TELEFONO_PROVEEDOR, CODIGO_PRODUCTO, TIPO, UNIDAD_MEDIDA, DESCRIPCION, CANTIDAD, PRECIO_UNITARIO);
        this.CODIGO_CLIENTE = CODIGO_CLIENTE;
        this.NOMBRE_CLIENTE = NOMBRE_CLIENTE;
        this.DIRECCION_CLIENTE = DIRECCION_CLIENTE;
        this.CORREO_CLIENTE = CORREO_CLIENTE;
        this.TELEFONO_CLIENTE = TELEFONO_CLIENTE;
        this.RUC = RUC;
    }

    public String getCODIGO_CLIENTE() {
        return CODIGO_CLIENTE;
    }

    public String getNOMBRE_CLIENTE() {
        return NOMBRE_CLIENTE;
    }

    public String getDIRECCION_CLIENTE() {
        return DIRECCION_CLIENTE;
    }

    public String getCORREO_CLIENTE() {
        return CORREO_CLIENTE;
    }

    public int getTELEFONO_CLIENTE() {
        return TELEFONO_CLIENTE;
    }

    public int getRUC() {
        return RUC;
    }
    
    
}
