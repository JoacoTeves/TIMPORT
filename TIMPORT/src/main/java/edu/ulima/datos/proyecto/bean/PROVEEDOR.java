/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author jteve
 */
public class PROVEEDOR extends PRODUCTO {
    protected String CODIGO_PROVEEDOR;
    private final String NOMBRE_PROVEEDOR, CORREO_PROVEEDOR, PAIS, CIUDAD;
    private final int TELEFONO_PROVEEDOR;

    public PROVEEDOR(String CODIGO_PROVEEDOR, String NOMBRE_PROVEEDOR, String CORREO_PROVEEDOR, String PAIS, String CIUDAD, int TELEFONO_PROVEEDOR, String CODIGO_PRODUCTO, String TIPO, String UNIDAD_MEDIDA, String DESCRIPCION, int CANTIDAD, float PRECIO_UNITARIO) {
        super(CODIGO_PRODUCTO, TIPO, UNIDAD_MEDIDA, DESCRIPCION, CANTIDAD, PRECIO_UNITARIO);
        this.CODIGO_PROVEEDOR = CODIGO_PROVEEDOR;
        this.NOMBRE_PROVEEDOR = NOMBRE_PROVEEDOR;
        this.CORREO_PROVEEDOR = CORREO_PROVEEDOR;
        this.PAIS = PAIS;
        this.CIUDAD = CIUDAD;
        this.TELEFONO_PROVEEDOR = TELEFONO_PROVEEDOR;
    }

    public String getCODIGO_PROVEEDOR() {
        return CODIGO_PROVEEDOR;
    }

    public String getNOMBRE_PROVEEDOR() {
        return NOMBRE_PROVEEDOR;
    }

    public String getCORREO_PROVEEDOR() {
        return CORREO_PROVEEDOR;
    }

    public String getPAIS() {
        return PAIS;
    }

    public String getCIUDAD() {
        return CIUDAD;
    }

    public int getTELEFONO_PROVEEDOR() {
        return TELEFONO_PROVEEDOR;
    }
    
    
}
