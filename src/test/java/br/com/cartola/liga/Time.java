
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
    "url_escudo_png",
    "url_escudo_svg",
    "url_placeholder_escudo_png",
    "time_id",
    "nome",
    "nome_cartola",
    "slug",
    "facebook_id",
    "foto_perfil",
    "assinante",
    "patrimonio",
    "ranking",
    "pontos",
    "variacao"
})
public class Time {

    @JsonProperty("url_escudo_png")
    private String urlEscudoPng;
    @JsonProperty("url_escudo_svg")
    private String urlEscudoSvg;
    @JsonProperty("url_placeholder_escudo_png")
    private String urlPlaceholderEscudoPng;
    @JsonProperty("time_id")
    private long timeId;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("nome_cartola")
    private String nomeCartola;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("facebook_id")
    private long facebookId;
    @JsonProperty("foto_perfil")
    private String fotoPerfil;
    @JsonProperty("assinante")
    private boolean assinante;
    @JsonProperty("patrimonio")
    private double patrimonio;
    @JsonProperty("ranking")
    private Ranking ranking;
    @JsonProperty("pontos")
    private Pontos pontos;
    @JsonProperty("variacao")
    private Variacao variacao;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The urlEscudoPng
     */
    @JsonProperty("url_escudo_png")
    public String getUrlEscudoPng() {
        return urlEscudoPng;
    }

    /**
     * 
     * @param urlEscudoPng
     *     The url_escudo_png
     */
    @JsonProperty("url_escudo_png")
    public void setUrlEscudoPng(String urlEscudoPng) {
        this.urlEscudoPng = urlEscudoPng;
    }

    public Time withUrlEscudoPng(String urlEscudoPng) {
        this.urlEscudoPng = urlEscudoPng;
        return this;
    }

    /**
     * 
     * @return
     *     The urlEscudoSvg
     */
    @JsonProperty("url_escudo_svg")
    public String getUrlEscudoSvg() {
        return urlEscudoSvg;
    }

    /**
     * 
     * @param urlEscudoSvg
     *     The url_escudo_svg
     */
    @JsonProperty("url_escudo_svg")
    public void setUrlEscudoSvg(String urlEscudoSvg) {
        this.urlEscudoSvg = urlEscudoSvg;
    }

    public Time withUrlEscudoSvg(String urlEscudoSvg) {
        this.urlEscudoSvg = urlEscudoSvg;
        return this;
    }

    /**
     * 
     * @return
     *     The urlPlaceholderEscudoPng
     */
    @JsonProperty("url_placeholder_escudo_png")
    public String getUrlPlaceholderEscudoPng() {
        return urlPlaceholderEscudoPng;
    }

    /**
     * 
     * @param urlPlaceholderEscudoPng
     *     The url_placeholder_escudo_png
     */
    @JsonProperty("url_placeholder_escudo_png")
    public void setUrlPlaceholderEscudoPng(String urlPlaceholderEscudoPng) {
        this.urlPlaceholderEscudoPng = urlPlaceholderEscudoPng;
    }

    public Time withUrlPlaceholderEscudoPng(String urlPlaceholderEscudoPng) {
        this.urlPlaceholderEscudoPng = urlPlaceholderEscudoPng;
        return this;
    }

    /**
     * 
     * @return
     *     The timeId
     */
    @JsonProperty("time_id")
    public long getTimeId() {
        return timeId;
    }

    /**
     * 
     * @param timeId
     *     The time_id
     */
    @JsonProperty("time_id")
    public void setTimeId(long timeId) {
        this.timeId = timeId;
    }

    public Time withTimeId(long timeId) {
        this.timeId = timeId;
        return this;
    }

    /**
     * 
     * @return
     *     The nome
     */
    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    /**
     * 
     * @param nome
     *     The nome
     */
    @JsonProperty("nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time withNome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * 
     * @return
     *     The nomeCartola
     */
    @JsonProperty("nome_cartola")
    public String getNomeCartola() {
        return nomeCartola;
    }

    /**
     * 
     * @param nomeCartola
     *     The nome_cartola
     */
    @JsonProperty("nome_cartola")
    public void setNomeCartola(String nomeCartola) {
        this.nomeCartola = nomeCartola;
    }

    public Time withNomeCartola(String nomeCartola) {
        this.nomeCartola = nomeCartola;
        return this;
    }

    /**
     * 
     * @return
     *     The slug
     */
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Time withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * 
     * @return
     *     The facebookId
     */
    @JsonProperty("facebook_id")
    public long getFacebookId() {
        return facebookId;
    }

    /**
     * 
     * @param facebookId
     *     The facebook_id
     */
    @JsonProperty("facebook_id")
    public void setFacebookId(long facebookId) {
        this.facebookId = facebookId;
    }

    public Time withFacebookId(long facebookId) {
        this.facebookId = facebookId;
        return this;
    }

    /**
     * 
     * @return
     *     The fotoPerfil
     */
    @JsonProperty("foto_perfil")
    public String getFotoPerfil() {
        return fotoPerfil;
    }

    /**
     * 
     * @param fotoPerfil
     *     The foto_perfil
     */
    @JsonProperty("foto_perfil")
    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public Time withFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
        return this;
    }

    /**
     * 
     * @return
     *     The assinante
     */
    @JsonProperty("assinante")
    public boolean isAssinante() {
        return assinante;
    }

    /**
     * 
     * @param assinante
     *     The assinante
     */
    @JsonProperty("assinante")
    public void setAssinante(boolean assinante) {
        this.assinante = assinante;
    }

    public Time withAssinante(boolean assinante) {
        this.assinante = assinante;
        return this;
    }

    /**
     * 
     * @return
     *     The patrimonio
     */
    @JsonProperty("patrimonio")
    public double getPatrimonio() {
        return patrimonio;
    }

    /**
     * 
     * @param patrimonio
     *     The patrimonio
     */
    @JsonProperty("patrimonio")
    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

    public Time withPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
        return this;
    }

    /**
     * 
     * @return
     *     The ranking
     */
    @JsonProperty("ranking")
    public Ranking getRanking() {
        return ranking;
    }

    /**
     * 
     * @param ranking
     *     The ranking
     */
    @JsonProperty("ranking")
    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }

    public Time withRanking(Ranking ranking) {
        this.ranking = ranking;
        return this;
    }

    /**
     * 
     * @return
     *     The pontos
     */
    @JsonProperty("pontos")
    public Pontos getPontos() {
        return pontos;
    }

    /**
     * 
     * @param pontos
     *     The pontos
     */
    @JsonProperty("pontos")
    public void setPontos(Pontos pontos) {
        this.pontos = pontos;
    }

    public Time withPontos(Pontos pontos) {
        this.pontos = pontos;
        return this;
    }

    /**
     * 
     * @return
     *     The variacao
     */
    @JsonProperty("variacao")
    public Variacao getVariacao() {
        return variacao;
    }

    /**
     * 
     * @param variacao
     *     The variacao
     */
    @JsonProperty("variacao")
    public void setVariacao(Variacao variacao) {
        this.variacao = variacao;
    }

    public Time withVariacao(Variacao variacao) {
        this.variacao = variacao;
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

    public Time withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
