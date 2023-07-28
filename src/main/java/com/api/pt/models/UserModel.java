package com.api.pt.models;

import java.sql.Date;
import java.time.Period;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class UserModel {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @NotEmpty
    private String nombres;
    @Column
    @NotEmpty
    private String apellidos;
    @Column
    @NotEmpty
    private String tdocumento;
    @Column
    @NotEmpty
    private String documento;
    @Column
    @NotEmpty
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fnacimiento;
    @Column
    @NotEmpty
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fvinculacion;
    @Column
    @NotEmpty
    private String cargo;
    @Column
    @NotEmpty
    private Double salario;
    @Column
    private Period tvinculacion;
    @Column
    private Period edad;
    
    public Period getTvinculacion() {
        return tvinculacion;
    }
    public void setTvinculacion(Period tvinculacion) {
        this.tvinculacion = tvinculacion;
    }
    public Period getEdad() {
        return edad;
    }
    public void setEdad(Period edad) {
        this.edad = edad;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTdocumento() {
        return tdocumento;
    }
    public void setTdocumento(String tdocumento) {
        this.tdocumento = tdocumento;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public Date getFnacimiento() {
        return fnacimiento;
    }
    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }
    public Date getFvinculacion() {
        return fvinculacion;
    }
    public void setFvinculacion(Date fvinculacion) {
        this.fvinculacion = fvinculacion;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    
}
