
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
    "lanterninha",
    "patrimonio",
    "rodada",
    "turno"
})
public class Destaques {

    @JsonProperty("lanterninha")
    private Lanterninha lanterninha;
    @JsonProperty("patrimonio")
    private Patrimonio patrimonio;
    @JsonProperty("rodada")
    private Rodada rodada;
    @JsonProperty("turno")
    private Turno turno;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The lanterninha
     */
    @JsonProperty("lanterninha")
    public Lanterninha getLanterninha() {
        return lanterninha;
    }

    /**
     * 
     * @param lanterninha
     *     The lanterninha
     */
    @JsonProperty("lanterninha")
    public void setLanterninha(Lanterninha lanterninha) {
        this.lanterninha = lanterninha;
    }

    public Destaques withLanterninha(Lanterninha lanterninha) {
        this.lanterninha = lanterninha;
        return this;
    }

    /**
     * 
     * @return
     *     The patrimonio
     */
    @JsonProperty("patrimonio")
    public Patrimonio getPatrimonio() {
        return patrimonio;
    }

    /**
     * 
     * @param patrimonio
     *     The patrimonio
     */
    @JsonProperty("patrimonio")
    public void setPatrimonio(Patrimonio patrimonio) {
        this.patrimonio = patrimonio;
    }

    public Destaques withPatrimonio(Patrimonio patrimonio) {
        this.patrimonio = patrimonio;
        return this;
    }

    /**
     * 
     * @return
     *     The rodada
     */
    @JsonProperty("rodada")
    public Rodada getRodada() {
        return rodada;
    }

    /**
     * 
     * @param rodada
     *     The rodada
     */
    @JsonProperty("rodada")
    public void setRodada(Rodada rodada) {
        this.rodada = rodada;
    }

    public Destaques withRodada(Rodada rodada) {
        this.rodada = rodada;
        return this;
    }

    /**
     * 
     * @return
     *     The turno
     */
    @JsonProperty("turno")
    public Turno getTurno() {
        return turno;
    }

    /**
     * 
     * @param turno
     *     The turno
     */
    @JsonProperty("turno")
    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Destaques withTurno(Turno turno) {
        this.turno = turno;
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

    public Destaques withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
