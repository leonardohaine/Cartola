
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
    "cor_nome_liga",
    "img_background",
    "img_marca_patrocinador"
})
public class InfoEditorial {

    @JsonProperty("cor_nome_liga")
    private String corNomeLiga;
    @JsonProperty("img_background")
    private Object imgBackground;
    @JsonProperty("img_marca_patrocinador")
    private Object imgMarcaPatrocinador;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The corNomeLiga
     */
    @JsonProperty("cor_nome_liga")
    public String getCorNomeLiga() {
        return corNomeLiga;
    }

    /**
     * 
     * @param corNomeLiga
     *     The cor_nome_liga
     */
    @JsonProperty("cor_nome_liga")
    public void setCorNomeLiga(String corNomeLiga) {
        this.corNomeLiga = corNomeLiga;
    }

    public InfoEditorial withCorNomeLiga(String corNomeLiga) {
        this.corNomeLiga = corNomeLiga;
        return this;
    }

    /**
     * 
     * @return
     *     The imgBackground
     */
    @JsonProperty("img_background")
    public Object getImgBackground() {
        return imgBackground;
    }

    /**
     * 
     * @param imgBackground
     *     The img_background
     */
    @JsonProperty("img_background")
    public void setImgBackground(Object imgBackground) {
        this.imgBackground = imgBackground;
    }

    public InfoEditorial withImgBackground(Object imgBackground) {
        this.imgBackground = imgBackground;
        return this;
    }

    /**
     * 
     * @return
     *     The imgMarcaPatrocinador
     */
    @JsonProperty("img_marca_patrocinador")
    public Object getImgMarcaPatrocinador() {
        return imgMarcaPatrocinador;
    }

    /**
     * 
     * @param imgMarcaPatrocinador
     *     The img_marca_patrocinador
     */
    @JsonProperty("img_marca_patrocinador")
    public void setImgMarcaPatrocinador(Object imgMarcaPatrocinador) {
        this.imgMarcaPatrocinador = imgMarcaPatrocinador;
    }

    public InfoEditorial withImgMarcaPatrocinador(Object imgMarcaPatrocinador) {
        this.imgMarcaPatrocinador = imgMarcaPatrocinador;
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

    public InfoEditorial withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
