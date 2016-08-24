
package br.com.cartola.liga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "liga",
    "times",
    "time_usuario",
    "amigos",
    "destaques",
    "pagina",
    "membro",
    "time_dono"
})
public class Liga {

    @JsonProperty("liga")
    private Liga_ liga;
    @JsonProperty("times")
    private List<Time> times = new ArrayList<Time>();
    @JsonProperty("time_usuario")
    private TimeUsuario timeUsuario;
    @JsonProperty("amigos")
    private Object amigos;
    @JsonProperty("destaques")
    private Destaques destaques;
    @JsonProperty("pagina")
    private long pagina;
    @JsonProperty("membro")
    private boolean membro;
    @JsonProperty("time_dono")
    private TimeDono timeDono;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The liga
     */
    @JsonProperty("liga")
    public Liga_ getLiga() {
        return liga;
    }

    /**
     * 
     * @param liga
     *     The liga
     */
    @JsonProperty("liga")
    public void setLiga(Liga_ liga) {
        this.liga = liga;
    }

    public Liga withLiga(Liga_ liga) {
        this.liga = liga;
        return this;
    }

    /**
     * 
     * @return
     *     The times
     */
    @JsonProperty("times")
    public List<Time> getTimes() {
        return times;
    }

    /**
     * 
     * @param times
     *     The times
     */
    @JsonProperty("times")
    public void setTimes(List<Time> times) {
        this.times = times;
    }

    public Liga withTimes(List<Time> times) {
        this.times = times;
        return this;
    }

    /**
     * 
     * @return
     *     The timeUsuario
     */
    @JsonProperty("time_usuario")
    public TimeUsuario getTimeUsuario() {
        return timeUsuario;
    }

    /**
     * 
     * @param timeUsuario
     *     The time_usuario
     */
    @JsonProperty("time_usuario")
    public void setTimeUsuario(TimeUsuario timeUsuario) {
        this.timeUsuario = timeUsuario;
    }

    public Liga withTimeUsuario(TimeUsuario timeUsuario) {
        this.timeUsuario = timeUsuario;
        return this;
    }

    /**
     * 
     * @return
     *     The amigos
     */
    @JsonProperty("amigos")
    public Object getAmigos() {
        return amigos;
    }

    /**
     * 
     * @param amigos
     *     The amigos
     */
    @JsonProperty("amigos")
    public void setAmigos(Object amigos) {
        this.amigos = amigos;
    }

    public Liga withAmigos(Object amigos) {
        this.amigos = amigos;
        return this;
    }

    /**
     * 
     * @return
     *     The destaques
     */
    @JsonProperty("destaques")
    public Destaques getDestaques() {
        return destaques;
    }

    /**
     * 
     * @param destaques
     *     The destaques
     */
    @JsonProperty("destaques")
    public void setDestaques(Destaques destaques) {
        this.destaques = destaques;
    }

    public Liga withDestaques(Destaques destaques) {
        this.destaques = destaques;
        return this;
    }

    /**
     * 
     * @return
     *     The pagina
     */
    @JsonProperty("pagina")
    public long getPagina() {
        return pagina;
    }

    /**
     * 
     * @param pagina
     *     The pagina
     */
    @JsonProperty("pagina")
    public void setPagina(long pagina) {
        this.pagina = pagina;
    }

    public Liga withPagina(long pagina) {
        this.pagina = pagina;
        return this;
    }

    /**
     * 
     * @return
     *     The membro
     */
    @JsonProperty("membro")
    public boolean isMembro() {
        return membro;
    }

    /**
     * 
     * @param membro
     *     The membro
     */
    @JsonProperty("membro")
    public void setMembro(boolean membro) {
        this.membro = membro;
    }

    public Liga withMembro(boolean membro) {
        this.membro = membro;
        return this;
    }

    /**
     * 
     * @return
     *     The timeDono
     */
    @JsonProperty("time_dono")
    public TimeDono getTimeDono() {
        return timeDono;
    }

    /**
     * 
     * @param timeDono
     *     The time_dono
     */
    @JsonProperty("time_dono")
    public void setTimeDono(TimeDono timeDono) {
        this.timeDono = timeDono;
    }

    public Liga withTimeDono(TimeDono timeDono) {
        this.timeDono = timeDono;
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

    public Liga withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
