/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.datos.proyecto;

import edu.ulima.datos.proyecto.bean.CLIENTE;
import edu.ulima.datos.util.JdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JC
 */
public class PruebaSelect {
    public static List<CLIENTE> obtenerClientes() throws Exception{
        List<CLIENTE> listaClientes = new ArrayList<>();        
        Connection conn = JdbcUtil.getConnection();
        String sql = "SELECT * FROM CLIENTE";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            String nombre = rs.getString("NOMBRE_CLIENTE");
            String direccion = rs.getString("DIRECCION_CLIENTE");
            String codigo = rs.getString("CODIGO_CLIENTE");
            Integer telefono = rs.getInt("TELEFONO_CLIENTE");
            String correo = rs.getString("CORREO_CLIENTE");
            Integer ruc = rs.getInt("RUC_CLIENTE");
            Integer numOrden = rs.getInt("NUMERO_ORDEN");
            Empleado emp = new Empleado(nombre, apellido, salario);
            listaClientes.add(emp);
        }
        rs.close();
        pst.close();
        conn.close();
        return listaClientes;
    }
    public static Empleado obtenerEmpleado(int codigo) throws Exception{
        Empleado e = null;
        Connection conn = JdbcUtil.getConnection();
        String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, codigo);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            String nombre = rs.getString("FIRST_NAME");
            String apellido = rs.getString("LAST_NAME");
            Float salario = rs.getFloat("SALARY");
            e = new Empleado(nombre, apellido, salario);
        }
        rs.close();
        pst.close();
        conn.close();
        return e;
    }
    
    public static void main(String[] args) throws Exception{
        List<Empleado> empleados = obtenerEmpleados();
        System.out.println(empleados);
        
        Empleado e = obtenerEmpleado(101);
        System.out.println(e);
        
    }
    /*
        Referencia adicional: https://www.javatpoint.com/ResultSet-interface
    */
}
