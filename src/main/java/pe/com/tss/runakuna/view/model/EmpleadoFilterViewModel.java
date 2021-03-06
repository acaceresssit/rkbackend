package pe.com.tss.runakuna.view.model;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import pe.com.tss.runakuna.json.JsonDateSimpleDeserializer;
import pe.com.tss.runakuna.json.JsonDateSimpleSerializer;

/**
 * Created by josediaz on 2/11/2016.
 */
public class EmpleadoFilterViewModel extends PageableFilter{


    private Long idEmpleado;
    private String nombres;
    private String apePaterno;
    private String apeMaterno;
    private String codigo;
    private String tipoDocumento;
    private String tipoDocumentoString;
    private String numeroDocumento;

    private Long unidadNegocio;
    private Long departamento;
    private Long proyecto;

    private String jefeInmediato;
    private String centroCosto;
    private String centroCostoString;
    private String correoElectronico;
    private String estado;
    private String cargo;
    private String estadoString;

    private Integer antiguedadDesde;
    private Integer antiguedadHasta;
    private boolean birthday;
    
    @JsonSerialize(using=JsonDateSimpleSerializer.class)
	@JsonDeserialize(using=JsonDateSimpleDeserializer.class)
    private Date fechaIngresoDesde;
    
    @JsonSerialize(using=JsonDateSimpleSerializer.class)
	@JsonDeserialize(using=JsonDateSimpleDeserializer.class)
    private Date fechaIngresoHasta;
    
    @JsonSerialize(using=JsonDateSimpleSerializer.class)
	@JsonDeserialize(using=JsonDateSimpleDeserializer.class)
    private Date fechaCeseDesde;
    
    @JsonSerialize(using=JsonDateSimpleSerializer.class)
	@JsonDeserialize(using=JsonDateSimpleDeserializer.class)
    private Date fechaCeseHasta;
    

    private Long idJefeInmediato;

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Long getUnidadNegocio() {
        return unidadNegocio;
    }

    public void setUnidadNegocio(Long unidadNegocio) {
        this.unidadNegocio = unidadNegocio;
    }

    public Long getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Long departamento) {
        this.departamento = departamento;
    }

    public Long getProyecto() {
        return proyecto;
    }

    public void setProyecto(Long proyecto) {
        this.proyecto = proyecto;
    }

    public String getJefeInmediato() {
        return jefeInmediato;
    }

    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }

    public String getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(String centroCosto) {
        this.centroCosto = centroCosto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoDocumentoString() {
        return tipoDocumentoString;
    }

    public void setTipoDocumentoString(String tipoDocumentoString) {
        this.tipoDocumentoString = tipoDocumentoString;
    }

    public String getCentroCostoString() {
        return centroCostoString;
    }

    public void setCentroCostoString(String centroCostoString) {
        this.centroCostoString = centroCostoString;
    }

    public String getEstadoString() {
        return estadoString;
    }

    public void setEstadoString(String estadoString) {
        this.estadoString = estadoString;
    }

	public Long getIdJefeInmediato() {
		return idJefeInmediato;
	}

	public void setIdJefeInmediato(Long idJefeInmediato) {
		this.idJefeInmediato = idJefeInmediato;
	}

	public Date getFechaIngresoDesde() {
		return fechaIngresoDesde;
	}

	public void setFechaIngresoDesde(Date fechaIngresoDesde) {
		this.fechaIngresoDesde = fechaIngresoDesde;
	}

	public Date getFechaIngresoHasta() {
		return fechaIngresoHasta;
	}

	public void setFechaIngresoHasta(Date fechaIngresoHasta) {
		this.fechaIngresoHasta = fechaIngresoHasta;
	}

	public Date getFechaCeseDesde() {
		return fechaCeseDesde;
	}

	public void setFechaCeseDesde(Date fechaCeseDesde) {
		this.fechaCeseDesde = fechaCeseDesde;
	}

	public Date getFechaCeseHasta() {
		return fechaCeseHasta;
	}

	public void setFechaCeseHasta(Date fechaCeseHasta) {
		this.fechaCeseHasta = fechaCeseHasta;
	}


    public void setAntiguedadDesde(Integer antiguedadDesde) {
        this.antiguedadDesde = antiguedadDesde;
    }

    public void setAntiguedadHasta(Integer antiguedadHasta) {
        this.antiguedadHasta = antiguedadHasta;
    }

    public Integer getAntiguedadDesde() {
        return antiguedadDesde;
    }

    public Integer getAntiguedadHasta() {
        return antiguedadHasta;
    }

	public boolean isBirthday() {
		return birthday;
	}

	public void setBirthday(boolean birthday) {
		this.birthday = birthday;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


    
    
}
