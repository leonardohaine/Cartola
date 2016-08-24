
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
    "time_id",
    "nome",
    "nome_cartola",
    "slug",
    "facebook_id",
    "url_escudo_placeholder_png",
    "foto_perfil",
    "assinante",
    "patrimonio",
    "ranking",
    "pontos",
    "variacao"
})
public class TimeUsuario {

    @JsonProperty("url_escudo_png")
    private String urlEscudoPng;
    @JsonProperty("url_escudo_svg")
    private String urlEscudoSvg;
    @JsonProperty("time_id")
    private long timeId;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("nome_cartola")
    private String nomeCartola;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("facebook_id")
    private Object facebookId;
    @JsonProperty("url_escudo_placeholder_png")
    private String urlEscudoPlaceholderPng;
    @JsonProperty("foto_perfil")
    private String fotoPerfil;
    @JsonProperty("assinante")
    private boolean assinante;
    @JsonProperty("patrimonio")
    private double patrimonio;
    @JsonProperty("ranking")
    private Ranking_ ranking;
    @JsonProperty("pontos")
    private Pontos_ pontos;
    @JsonProperty("variacao")
    private Variacao_ variacao;
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

    public TimeUsuario withUrlEscudoPng(String urlEscudoPng) {
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

    public TimeUsuario withUrlEscudoSvg(String urlEscudoSvg) {
        this.urlEscudoSvg = urlEscudoSvg;
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

    public TimeUsuario withTimeId(long timeId) {
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

    public TimeUsuario withNome(String nome) {
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

    public TimeUsuario withNomeCartola(String nomeCartola) {
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

    public TimeUsuario withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * 
     * @return
     *     The facebookId
     */
    @JsonProperty("facebook_id")
    public Object getFacebookId() {
        return facebookId;
    }

    /**
     * 
     * @param facebookId
     *     The facebook_id
     */
    @JsonProperty("facebook_id")
    public void setFacebookId(Object facebookId) {
        this.facebookId = facebookId;
    }

    public TimeUsuario withFacebookId(Object facebookId) {
        this.facebookId = facebookId;
        return this;
    }

    /**
     * 
     * @return
     *     The urlEscudoPlaceholderPng
     */
    @JsonProperty("url_escudo_placeholder_png")
    public String getUrlEscudoPlaceholderPng() {
        return urlEscudoPlaceholderPng;
    }

    /**
     * 
     * @param urlEscudoPlaceholderPng
     *     The url_escudo_placeholder_png
     */
    @JsonProperty("url_escudo_placeholder_png")
    public void setUrlEscudoPlaceholderPng(String urlEscudoPlaceholderPng) {
        this.urlEscudoPlaceholderPng = urlEscudoPlaceholderPng;
    }

    public TimeUsuario withUrlEscudoPlaceholderPng(String urlEscudoPlaceholderPng) {
        this.urlEscudoPlaceholderPng = urlEscudoPlaceholderPng;
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

    public TimeUsuario withFotoPerfil(String fotoPerfil) {
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

    public TimeUsuario withAssinante(boolean assinante) {
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

    public TimeUsuario withPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
        return this;
    }

    /**
     * 
     * @return
     *     The ranking
     */
    @JsonProperty("ranking")
    public Ranking_ getRanking() {
        return ranking;
    }

    /**
     * 
     * @param ranking
     *     The ranking
     */
    @JsonProperty("ranking")
    public void setRanking(Ranking_ ranking) {
        this.ranking = ranking;
    }

    public TimeUsuario withRanking(Ranking_ ranking) {
        this.ranking = ranking;
        return this;
    }

    /**
     * 
     * @return
     *     The pontos
     */
    @JsonProperty("pontos")
    public Pontos_ getPontos() {
        return pontos;
    }

    /**
     * 
     * @param pontos
     *     The pontos
     */
    @JsonProperty("pontos")
    public void setPontos(Pontos_ pontos) {
        this.pontos = pontos;
    }

    public TimeUsuario withPontos(Pontos_ pontos) {
        this.pontos = pontos;
        return this;
    }

    /**
     * 
     * @return
     *     The variacao
     */
    @JsonProperty("variacao")
    public Variacao_ getVariacao() {
        return variacao;
    }

    /**
     * 
     * @param variacao
     *     The variacao
     */
    @JsonProperty("variacao")
    public void setVariacao(Variacao_ variacao) {
        this.variacao = variacao;
    }

    public TimeUsuario withVariacao(Variacao_ variacao) {
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

    public TimeUsuario withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
