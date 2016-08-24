
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
    "time_id",
    "clube_id",
    "esquema_id",
    "cadun_id",
    "facebook_id",
    "foto_perfil",
    "nome",
    "nome_cartola",
    "slug",
    "tipo_escudo",
    "cor_fundo_escudo",
    "cor_borda_escudo",
    "cor_primaria_estampa_escudo",
    "cor_secundaria_estampa_escudo",
    "url_escudo_svg",
    "url_escudo_png",
    "url_camisa_svg",
    "url_camisa_png",
    "url_escudo_placeholder_png",
    "url_camisa_placeholder_png",
    "tipo_estampa_escudo",
    "tipo_adorno",
    "tipo_camisa",
    "tipo_estampa_camisa",
    "cor_camisa",
    "cor_primaria_estampa_camisa",
    "cor_secundaria_estampa_camisa",
    "rodada_time_id",
    "assinante",
    "cadastro_completo",
    "patrocinador1_id",
    "patrocinador2_id"
})
public class Patrimonio {

    @JsonProperty("time_id")
    private long timeId;
    @JsonProperty("clube_id")
    private long clubeId;
    @JsonProperty("esquema_id")
    private long esquemaId;
    @JsonProperty("cadun_id")
    private long cadunId;
    @JsonProperty("facebook_id")
    private Object facebookId;
    @JsonProperty("foto_perfil")
    private String fotoPerfil;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("nome_cartola")
    private String nomeCartola;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("tipo_escudo")
    private long tipoEscudo;
    @JsonProperty("cor_fundo_escudo")
    private String corFundoEscudo;
    @JsonProperty("cor_borda_escudo")
    private String corBordaEscudo;
    @JsonProperty("cor_primaria_estampa_escudo")
    private String corPrimariaEstampaEscudo;
    @JsonProperty("cor_secundaria_estampa_escudo")
    private String corSecundariaEstampaEscudo;
    @JsonProperty("url_escudo_svg")
    private String urlEscudoSvg;
    @JsonProperty("url_escudo_png")
    private String urlEscudoPng;
    @JsonProperty("url_camisa_svg")
    private String urlCamisaSvg;
    @JsonProperty("url_camisa_png")
    private String urlCamisaPng;
    @JsonProperty("url_escudo_placeholder_png")
    private String urlEscudoPlaceholderPng;
    @JsonProperty("url_camisa_placeholder_png")
    private String urlCamisaPlaceholderPng;
    @JsonProperty("tipo_estampa_escudo")
    private long tipoEstampaEscudo;
    @JsonProperty("tipo_adorno")
    private long tipoAdorno;
    @JsonProperty("tipo_camisa")
    private long tipoCamisa;
    @JsonProperty("tipo_estampa_camisa")
    private long tipoEstampaCamisa;
    @JsonProperty("cor_camisa")
    private String corCamisa;
    @JsonProperty("cor_primaria_estampa_camisa")
    private String corPrimariaEstampaCamisa;
    @JsonProperty("cor_secundaria_estampa_camisa")
    private String corSecundariaEstampaCamisa;
    @JsonProperty("rodada_time_id")
    private long rodadaTimeId;
    @JsonProperty("assinante")
    private boolean assinante;
    @JsonProperty("cadastro_completo")
    private boolean cadastroCompleto;
    @JsonProperty("patrocinador1_id")
    private long patrocinador1Id;
    @JsonProperty("patrocinador2_id")
    private long patrocinador2Id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Patrimonio withTimeId(long timeId) {
        this.timeId = timeId;
        return this;
    }

    /**
     * 
     * @return
     *     The clubeId
     */
    @JsonProperty("clube_id")
    public long getClubeId() {
        return clubeId;
    }

    /**
     * 
     * @param clubeId
     *     The clube_id
     */
    @JsonProperty("clube_id")
    public void setClubeId(long clubeId) {
        this.clubeId = clubeId;
    }

    public Patrimonio withClubeId(long clubeId) {
        this.clubeId = clubeId;
        return this;
    }

    /**
     * 
     * @return
     *     The esquemaId
     */
    @JsonProperty("esquema_id")
    public long getEsquemaId() {
        return esquemaId;
    }

    /**
     * 
     * @param esquemaId
     *     The esquema_id
     */
    @JsonProperty("esquema_id")
    public void setEsquemaId(long esquemaId) {
        this.esquemaId = esquemaId;
    }

    public Patrimonio withEsquemaId(long esquemaId) {
        this.esquemaId = esquemaId;
        return this;
    }

    /**
     * 
     * @return
     *     The cadunId
     */
    @JsonProperty("cadun_id")
    public long getCadunId() {
        return cadunId;
    }

    /**
     * 
     * @param cadunId
     *     The cadun_id
     */
    @JsonProperty("cadun_id")
    public void setCadunId(long cadunId) {
        this.cadunId = cadunId;
    }

    public Patrimonio withCadunId(long cadunId) {
        this.cadunId = cadunId;
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

    public Patrimonio withFacebookId(Object facebookId) {
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

    public Patrimonio withFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
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

    public Patrimonio withNome(String nome) {
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

    public Patrimonio withNomeCartola(String nomeCartola) {
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

    public Patrimonio withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * 
     * @return
     *     The tipoEscudo
     */
    @JsonProperty("tipo_escudo")
    public long getTipoEscudo() {
        return tipoEscudo;
    }

    /**
     * 
     * @param tipoEscudo
     *     The tipo_escudo
     */
    @JsonProperty("tipo_escudo")
    public void setTipoEscudo(long tipoEscudo) {
        this.tipoEscudo = tipoEscudo;
    }

    public Patrimonio withTipoEscudo(long tipoEscudo) {
        this.tipoEscudo = tipoEscudo;
        return this;
    }

    /**
     * 
     * @return
     *     The corFundoEscudo
     */
    @JsonProperty("cor_fundo_escudo")
    public String getCorFundoEscudo() {
        return corFundoEscudo;
    }

    /**
     * 
     * @param corFundoEscudo
     *     The cor_fundo_escudo
     */
    @JsonProperty("cor_fundo_escudo")
    public void setCorFundoEscudo(String corFundoEscudo) {
        this.corFundoEscudo = corFundoEscudo;
    }

    public Patrimonio withCorFundoEscudo(String corFundoEscudo) {
        this.corFundoEscudo = corFundoEscudo;
        return this;
    }

    /**
     * 
     * @return
     *     The corBordaEscudo
     */
    @JsonProperty("cor_borda_escudo")
    public String getCorBordaEscudo() {
        return corBordaEscudo;
    }

    /**
     * 
     * @param corBordaEscudo
     *     The cor_borda_escudo
     */
    @JsonProperty("cor_borda_escudo")
    public void setCorBordaEscudo(String corBordaEscudo) {
        this.corBordaEscudo = corBordaEscudo;
    }

    public Patrimonio withCorBordaEscudo(String corBordaEscudo) {
        this.corBordaEscudo = corBordaEscudo;
        return this;
    }

    /**
     * 
     * @return
     *     The corPrimariaEstampaEscudo
     */
    @JsonProperty("cor_primaria_estampa_escudo")
    public String getCorPrimariaEstampaEscudo() {
        return corPrimariaEstampaEscudo;
    }

    /**
     * 
     * @param corPrimariaEstampaEscudo
     *     The cor_primaria_estampa_escudo
     */
    @JsonProperty("cor_primaria_estampa_escudo")
    public void setCorPrimariaEstampaEscudo(String corPrimariaEstampaEscudo) {
        this.corPrimariaEstampaEscudo = corPrimariaEstampaEscudo;
    }

    public Patrimonio withCorPrimariaEstampaEscudo(String corPrimariaEstampaEscudo) {
        this.corPrimariaEstampaEscudo = corPrimariaEstampaEscudo;
        return this;
    }

    /**
     * 
     * @return
     *     The corSecundariaEstampaEscudo
     */
    @JsonProperty("cor_secundaria_estampa_escudo")
    public String getCorSecundariaEstampaEscudo() {
        return corSecundariaEstampaEscudo;
    }

    /**
     * 
     * @param corSecundariaEstampaEscudo
     *     The cor_secundaria_estampa_escudo
     */
    @JsonProperty("cor_secundaria_estampa_escudo")
    public void setCorSecundariaEstampaEscudo(String corSecundariaEstampaEscudo) {
        this.corSecundariaEstampaEscudo = corSecundariaEstampaEscudo;
    }

    public Patrimonio withCorSecundariaEstampaEscudo(String corSecundariaEstampaEscudo) {
        this.corSecundariaEstampaEscudo = corSecundariaEstampaEscudo;
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

    public Patrimonio withUrlEscudoSvg(String urlEscudoSvg) {
        this.urlEscudoSvg = urlEscudoSvg;
        return this;
    }

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

    public Patrimonio withUrlEscudoPng(String urlEscudoPng) {
        this.urlEscudoPng = urlEscudoPng;
        return this;
    }

    /**
     * 
     * @return
     *     The urlCamisaSvg
     */
    @JsonProperty("url_camisa_svg")
    public String getUrlCamisaSvg() {
        return urlCamisaSvg;
    }

    /**
     * 
     * @param urlCamisaSvg
     *     The url_camisa_svg
     */
    @JsonProperty("url_camisa_svg")
    public void setUrlCamisaSvg(String urlCamisaSvg) {
        this.urlCamisaSvg = urlCamisaSvg;
    }

    public Patrimonio withUrlCamisaSvg(String urlCamisaSvg) {
        this.urlCamisaSvg = urlCamisaSvg;
        return this;
    }

    /**
     * 
     * @return
     *     The urlCamisaPng
     */
    @JsonProperty("url_camisa_png")
    public String getUrlCamisaPng() {
        return urlCamisaPng;
    }

    /**
     * 
     * @param urlCamisaPng
     *     The url_camisa_png
     */
    @JsonProperty("url_camisa_png")
    public void setUrlCamisaPng(String urlCamisaPng) {
        this.urlCamisaPng = urlCamisaPng;
    }

    public Patrimonio withUrlCamisaPng(String urlCamisaPng) {
        this.urlCamisaPng = urlCamisaPng;
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

    public Patrimonio withUrlEscudoPlaceholderPng(String urlEscudoPlaceholderPng) {
        this.urlEscudoPlaceholderPng = urlEscudoPlaceholderPng;
        return this;
    }

    /**
     * 
     * @return
     *     The urlCamisaPlaceholderPng
     */
    @JsonProperty("url_camisa_placeholder_png")
    public String getUrlCamisaPlaceholderPng() {
        return urlCamisaPlaceholderPng;
    }

    /**
     * 
     * @param urlCamisaPlaceholderPng
     *     The url_camisa_placeholder_png
     */
    @JsonProperty("url_camisa_placeholder_png")
    public void setUrlCamisaPlaceholderPng(String urlCamisaPlaceholderPng) {
        this.urlCamisaPlaceholderPng = urlCamisaPlaceholderPng;
    }

    public Patrimonio withUrlCamisaPlaceholderPng(String urlCamisaPlaceholderPng) {
        this.urlCamisaPlaceholderPng = urlCamisaPlaceholderPng;
        return this;
    }

    /**
     * 
     * @return
     *     The tipoEstampaEscudo
     */
    @JsonProperty("tipo_estampa_escudo")
    public long getTipoEstampaEscudo() {
        return tipoEstampaEscudo;
    }

    /**
     * 
     * @param tipoEstampaEscudo
     *     The tipo_estampa_escudo
     */
    @JsonProperty("tipo_estampa_escudo")
    public void setTipoEstampaEscudo(long tipoEstampaEscudo) {
        this.tipoEstampaEscudo = tipoEstampaEscudo;
    }

    public Patrimonio withTipoEstampaEscudo(long tipoEstampaEscudo) {
        this.tipoEstampaEscudo = tipoEstampaEscudo;
        return this;
    }

    /**
     * 
     * @return
     *     The tipoAdorno
     */
    @JsonProperty("tipo_adorno")
    public long getTipoAdorno() {
        return tipoAdorno;
    }

    /**
     * 
     * @param tipoAdorno
     *     The tipo_adorno
     */
    @JsonProperty("tipo_adorno")
    public void setTipoAdorno(long tipoAdorno) {
        this.tipoAdorno = tipoAdorno;
    }

    public Patrimonio withTipoAdorno(long tipoAdorno) {
        this.tipoAdorno = tipoAdorno;
        return this;
    }

    /**
     * 
     * @return
     *     The tipoCamisa
     */
    @JsonProperty("tipo_camisa")
    public long getTipoCamisa() {
        return tipoCamisa;
    }

    /**
     * 
     * @param tipoCamisa
     *     The tipo_camisa
     */
    @JsonProperty("tipo_camisa")
    public void setTipoCamisa(long tipoCamisa) {
        this.tipoCamisa = tipoCamisa;
    }

    public Patrimonio withTipoCamisa(long tipoCamisa) {
        this.tipoCamisa = tipoCamisa;
        return this;
    }

    /**
     * 
     * @return
     *     The tipoEstampaCamisa
     */
    @JsonProperty("tipo_estampa_camisa")
    public long getTipoEstampaCamisa() {
        return tipoEstampaCamisa;
    }

    /**
     * 
     * @param tipoEstampaCamisa
     *     The tipo_estampa_camisa
     */
    @JsonProperty("tipo_estampa_camisa")
    public void setTipoEstampaCamisa(long tipoEstampaCamisa) {
        this.tipoEstampaCamisa = tipoEstampaCamisa;
    }

    public Patrimonio withTipoEstampaCamisa(long tipoEstampaCamisa) {
        this.tipoEstampaCamisa = tipoEstampaCamisa;
        return this;
    }

    /**
     * 
     * @return
     *     The corCamisa
     */
    @JsonProperty("cor_camisa")
    public String getCorCamisa() {
        return corCamisa;
    }

    /**
     * 
     * @param corCamisa
     *     The cor_camisa
     */
    @JsonProperty("cor_camisa")
    public void setCorCamisa(String corCamisa) {
        this.corCamisa = corCamisa;
    }

    public Patrimonio withCorCamisa(String corCamisa) {
        this.corCamisa = corCamisa;
        return this;
    }

    /**
     * 
     * @return
     *     The corPrimariaEstampaCamisa
     */
    @JsonProperty("cor_primaria_estampa_camisa")
    public String getCorPrimariaEstampaCamisa() {
        return corPrimariaEstampaCamisa;
    }

    /**
     * 
     * @param corPrimariaEstampaCamisa
     *     The cor_primaria_estampa_camisa
     */
    @JsonProperty("cor_primaria_estampa_camisa")
    public void setCorPrimariaEstampaCamisa(String corPrimariaEstampaCamisa) {
        this.corPrimariaEstampaCamisa = corPrimariaEstampaCamisa;
    }

    public Patrimonio withCorPrimariaEstampaCamisa(String corPrimariaEstampaCamisa) {
        this.corPrimariaEstampaCamisa = corPrimariaEstampaCamisa;
        return this;
    }

    /**
     * 
     * @return
     *     The corSecundariaEstampaCamisa
     */
    @JsonProperty("cor_secundaria_estampa_camisa")
    public String getCorSecundariaEstampaCamisa() {
        return corSecundariaEstampaCamisa;
    }

    /**
     * 
     * @param corSecundariaEstampaCamisa
     *     The cor_secundaria_estampa_camisa
     */
    @JsonProperty("cor_secundaria_estampa_camisa")
    public void setCorSecundariaEstampaCamisa(String corSecundariaEstampaCamisa) {
        this.corSecundariaEstampaCamisa = corSecundariaEstampaCamisa;
    }

    public Patrimonio withCorSecundariaEstampaCamisa(String corSecundariaEstampaCamisa) {
        this.corSecundariaEstampaCamisa = corSecundariaEstampaCamisa;
        return this;
    }

    /**
     * 
     * @return
     *     The rodadaTimeId
     */
    @JsonProperty("rodada_time_id")
    public long getRodadaTimeId() {
        return rodadaTimeId;
    }

    /**
     * 
     * @param rodadaTimeId
     *     The rodada_time_id
     */
    @JsonProperty("rodada_time_id")
    public void setRodadaTimeId(long rodadaTimeId) {
        this.rodadaTimeId = rodadaTimeId;
    }

    public Patrimonio withRodadaTimeId(long rodadaTimeId) {
        this.rodadaTimeId = rodadaTimeId;
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

    public Patrimonio withAssinante(boolean assinante) {
        this.assinante = assinante;
        return this;
    }

    /**
     * 
     * @return
     *     The cadastroCompleto
     */
    @JsonProperty("cadastro_completo")
    public boolean isCadastroCompleto() {
        return cadastroCompleto;
    }

    /**
     * 
     * @param cadastroCompleto
     *     The cadastro_completo
     */
    @JsonProperty("cadastro_completo")
    public void setCadastroCompleto(boolean cadastroCompleto) {
        this.cadastroCompleto = cadastroCompleto;
    }

    public Patrimonio withCadastroCompleto(boolean cadastroCompleto) {
        this.cadastroCompleto = cadastroCompleto;
        return this;
    }

    /**
     * 
     * @return
     *     The patrocinador1Id
     */
    @JsonProperty("patrocinador1_id")
    public long getPatrocinador1Id() {
        return patrocinador1Id;
    }

    /**
     * 
     * @param patrocinador1Id
     *     The patrocinador1_id
     */
    @JsonProperty("patrocinador1_id")
    public void setPatrocinador1Id(long patrocinador1Id) {
        this.patrocinador1Id = patrocinador1Id;
    }

    public Patrimonio withPatrocinador1Id(long patrocinador1Id) {
        this.patrocinador1Id = patrocinador1Id;
        return this;
    }

    /**
     * 
     * @return
     *     The patrocinador2Id
     */
    @JsonProperty("patrocinador2_id")
    public long getPatrocinador2Id() {
        return patrocinador2Id;
    }

    /**
     * 
     * @param patrocinador2Id
     *     The patrocinador2_id
     */
    @JsonProperty("patrocinador2_id")
    public void setPatrocinador2Id(long patrocinador2Id) {
        this.patrocinador2Id = patrocinador2Id;
    }

    public Patrimonio withPatrocinador2Id(long patrocinador2Id) {
        this.patrocinador2Id = patrocinador2Id;
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

    public Patrimonio withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
