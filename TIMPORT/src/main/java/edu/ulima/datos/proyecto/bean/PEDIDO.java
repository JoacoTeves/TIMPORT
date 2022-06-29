/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author jteve
 */
public class PEDIDO extends CLIENTE{
    protected int NUMERO_ORDEN;
    private final String REQUERIMIENTOS, ESTADO_PEDIDO, ENCARGADO_ENVIO;
    private final int NUMERO_SEGUIMIENTO;

    public PEDIDO(int NUMERO_ORDEN, String REQUERIMIENTOS, String ESTADO_PEDIDO, String ENCARGADO_ENVIO, int NUMERO_SEGUIMIENTO, String CODIGO_CLIENTE, String NOMBRE_CLIENTE, String DIRECCION_CLIENTE, String CORREO_CLIENTE, int TELEFONO_CLIENTE, int RUC, String CODIGO_REPRESENTANTE, String NOMBRE_REPRESENTANTE, String CORREO_REPRESENTANTE, int TELEFONO_REPRESENTANTE, String CODIGO_COTIZACION, float FACTURA_TOTAL, String CODIGO_PROVEEDOR, String NOMBRE_PROVEEDOR, String CORREO_PROVEEDOR, String PAIS, String CIUDAD, int TELEFONO_PROVEEDOR, String CODIGO_PRODUCTO, String TIPO, String UNIDAD_MEDIDA, String DESCRIPCION, int CANTIDAD, float PRECIO_UNITARIO) {
        super(CODIGO_CLIENTE, NOMBRE_CLIENTE, DIRECCION_CLIENTE, CORREO_CLIENTE, TELEFONO_CLIENTE, RUC, CODIGO_REPRESENTANTE, NOMBRE_REPRESENTANTE, CORREO_REPRESENTANTE, TELEFONO_REPRESENTANTE, CODIGO_COTIZACION, FACTURA_TOTAL, CODIGO_PROVEEDOR, NOMBRE_PROVEEDOR, CORREO_PROVEEDOR, PAIS, CIUDAD, TELEFONO_PROVEEDOR, CODIGO_PRODUCTO, TIPO, UNIDAD_MEDIDA, DESCRIPCION, CANTIDAD, PRECIO_UNITARIO);
        this.NUMERO_ORDEN = NUMERO_ORDEN;
        this.REQUERIMIENTOS = REQUERIMIENTOS;
        this.ESTADO_PEDIDO = ESTADO_PEDIDO;
        this.ENCARGADO_ENVIO = ENCARGADO_ENVIO;
        this.NUMERO_SEGUIMIENTO = NUMERO_SEGUIMIENTO;
    }

    public int getNUMERO_ORDEN() {
        return NUMERO_ORDEN;
    }

    public String getREQUERIMIENTOS() {
        return REQUERIMIENTOS;
    }

    public String getESTADO_PEDIDO() {
        return ESTADO_PEDIDO;
    }

    public String getENCARGADO_ENVIO() {
        return ENCARGADO_ENVIO;
    }

    public int getNUMERO_SEGUIMIENTO() {
        return NUMERO_SEGUIMIENTO;
    }
    
    
}
