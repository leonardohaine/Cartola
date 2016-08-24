
package br.com.cartola.liga;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "rodada",
    "mes",
    "turno",
    "campeonato"
})
public class Pontos {

    @JsonProperty("rodada")
    private double rodada;
    @JsonProperty("mes")
    private double mes;
    @JsonProperty("turno")
    private double turno;
    @JsonProperty("campeonato")
    private double campeonato;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The rodada
     */
    @JsonProperty("rodada")
    public double getRodada() {
        return rodada;
    }

    /**
     * 
     * @param rodada
     *     The rodada
     */
    @JsonProperty("rodada")
    public void setRodada(double rodada) {
        this.rodada = rodada;
    }

    public Pontos withRodada(double rodada) {
        this.rodada = rodada;
        return this;
    }

    /**
     * 
     * @return
     *     The mes
     */
    @JsonProperty("mes")
    public double getMes() {
        return mes;
    }

    /**
     * 
     * @param mes
     *     The mes
     */
    @JsonProperty("mes")
    public void setMes(double mes) {
        this.mes = mes;
    }

    public Pontos withMes(double mes) {
        this.mes = mes;
        return this;
    }

    /**
     * 
     * @return
     *     The turno
     */
    @JsonProperty("turno")
    public double getTurno() {
        return turno;
    }

    /**
     * 
     * @param turno
     *     The turno
     */
    @JsonProperty("turno")
    public void setTurno(double turno) {
        this.turno = turno;
    }

    public Pontos withTurno(double turno) {
        this.turno = turno;
        return this;
    }

    /**
     * 
     * @return
     *     The campeonato
     */
    @JsonProperty("campeonato")
    public double getCampeonato() {
        return campeonato;
    }

    /**
     * 
     * @param campeonato
     *     The campeonato
     */
    @JsonProperty("campeonato")
    public void setCampeonato(double campeonato) {
        this.campeonato = campeonato;
    }

    public Pontos withCampeonato(double campeonato) {
        this.campeonato = campeonato;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Pontos withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
