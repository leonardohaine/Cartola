
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
    "campeonato",
    "patrimonio"
})
public class Ranking {

    @JsonProperty("rodada")
    private long rodada;
    @JsonProperty("mes")
    private long mes;
    @JsonProperty("turno")
    private long turno;
    @JsonProperty("campeonato")
    private long campeonato;
    @JsonProperty("patrimonio")
    private long patrimonio;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The rodada
     */
    @JsonProperty("rodada")
    public long getRodada() {
        return rodada;
    }

    /**
     * 
     * @param rodada
     *     The rodada
     */
    @JsonProperty("rodada")
    public void setRodada(long rodada) {
        this.rodada = rodada;
    }

    public Ranking withRodada(long rodada) {
        this.rodada = rodada;
        return this;
    }

    /**
     * 
     * @return
     *     The mes
     */
    @JsonProperty("mes")
    public long getMes() {
        return mes;
    }

    /**
     * 
     * @param mes
     *     The mes
     */
    @JsonProperty("mes")
    public void setMes(long mes) {
        this.mes = mes;
    }

    public Ranking withMes(long mes) {
        this.mes = mes;
        return this;
    }

    /**
     * 
     * @return
     *     The turno
     */
    @JsonProperty("turno")
    public long getTurno() {
        return turno;
    }

    /**
     * 
     * @param turno
     *     The turno
     */
    @JsonProperty("turno")
    public void setTurno(long turno) {
        this.turno = turno;
    }

    public Ranking withTurno(long turno) {
        this.turno = turno;
        return this;
    }

    /**
     * 
     * @return
     *     The campeonato
     */
    @JsonProperty("campeonato")
    public long getCampeonato() {
        return campeonato;
    }

    /**
     * 
     * @param campeonato
     *     The campeonato
     */
    @JsonProperty("campeonato")
    public void setCampeonato(long campeonato) {
        this.campeonato = campeonato;
    }

    public Ranking withCampeonato(long campeonato) {
        this.campeonato = campeonato;
        return this;
    }

    /**
     * 
     * @return
     *     The patrimonio
     */
    @JsonProperty("patrimonio")
    public long getPatrimonio() {
        return patrimonio;
    }

    /**
     * 
     * @param patrimonio
     *     The patrimonio
     */
    @JsonProperty("patrimonio")
    public void setPatrimonio(long patrimonio) {
        this.patrimonio = patrimonio;
    }

    public Ranking withPatrimonio(long patrimonio) {
        this.patrimonio = patrimonio;
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

    public Ranking withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
