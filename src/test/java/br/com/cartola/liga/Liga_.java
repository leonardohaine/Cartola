
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
    "liga_id",
    "time_dono_id",
    "clube_id",
    "nome",
    "descricao",
    "slug",
    "tipo",
    "tipo_flamula",
    "tipo_estampa_flamula",
    "tipo_adorno_flamula",
    "cor_primaria_estampa_flamula",
    "cor_secundaria_estampa_flamula",
    "cor_borda_flamula",
    "cor_fundo_flamula",
    "url_flamula_svg",
    "url_flamula_png",
    "tipo_trofeu",
    "cor_trofeu",
    "url_trofeu_svg",
    "url_trofeu_png",
    "editorial",
    "patrocinador",
    "mata_mata",
    "inicio_rodada",
    "fim_rodada",
    "quantidade_times",
    "sorteada",
    "mes_ranking_num",
    "mes_variacao_num",
    "imagem",
    "amigos",
    "total_amigos_na_liga",
    "total_times_liga",
    "info_editorial"
})
public class Liga_ {

    @JsonProperty("liga_id")
    private long ligaId;
    @JsonProperty("time_dono_id")
    private long timeDonoId;
    @JsonProperty("clube_id")
    private Object clubeId;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("descricao")
    private String descricao;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("tipo")
    private String tipo;
    @JsonProperty("tipo_flamula")
    private long tipoFlamula;
    @JsonProperty("tipo_estampa_flamula")
    private long tipoEstampaFlamula;
    @JsonProperty("tipo_adorno_flamula")
    private long tipoAdornoFlamula;
    @JsonProperty("cor_primaria_estampa_flamula")
    private String corPrimariaEstampaFlamula;
    @JsonProperty("cor_secundaria_estampa_flamula")
    private String corSecundariaEstampaFlamula;
    @JsonProperty("cor_borda_flamula")
    private String corBordaFlamula;
    @JsonProperty("cor_fundo_flamula")
    private String corFundoFlamula;
    @JsonProperty("url_flamula_svg")
    private String urlFlamulaSvg;
    @JsonProperty("url_flamula_png")
    private String urlFlamulaPng;
    @JsonProperty("tipo_trofeu")
    private Object tipoTrofeu;
    @JsonProperty("cor_trofeu")
    private Object corTrofeu;
    @JsonProperty("url_trofeu_svg")
    private Object urlTrofeuSvg;
    @JsonProperty("url_trofeu_png")
    private Object urlTrofeuPng;
    @JsonProperty("editorial")
    private boolean editorial;
    @JsonProperty("patrocinador")
    private boolean patrocinador;
    @JsonProperty("mata_mata")
    private boolean mataMata;
    @JsonProperty("inicio_rodada")
    private Object inicioRodada;
    @JsonProperty("fim_rodada")
    private Object fimRodada;
    @JsonProperty("quantidade_times")
    private long quantidadeTimes;
    @JsonProperty("sorteada")
    private boolean sorteada;
    @JsonProperty("mes_ranking_num")
    private Object mesRankingNum;
    @JsonProperty("mes_variacao_num")
    private Object mesVariacaoNum;
    @JsonProperty("imagem")
    private String imagem;
    @JsonProperty("amigos")
    private Object amigos;
    @JsonProperty("total_amigos_na_liga")
    private long totalAmigosNaLiga;
    @JsonProperty("total_times_liga")
    private long totalTimesLiga;
    @JsonProperty("info_editorial")
    private InfoEditorial infoEditorial;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The ligaId
     */
    @JsonProperty("liga_id")
    public long getLigaId() {
        return ligaId;
    }

    /**
     * 
     * @param ligaId
     *     The liga_id
     */
    @JsonProperty("liga_id")
    public void setLigaId(long ligaId) {
        this.ligaId = ligaId;
    }

    public Liga_ withLigaId(long ligaId) {
        this.ligaId = ligaId;
        return this;
    }

    /**
     * 
     * @return
     *     The timeDonoId
     */
    @JsonProperty("time_dono_id")
    public long getTimeDonoId() {
        return timeDonoId;
    }

    /**
     * 
     * @param timeDonoId
     *     The time_dono_id
     */
    @JsonProperty("time_dono_id")
    public void setTimeDonoId(long timeDonoId) {
        this.timeDonoId = timeDonoId;
    }

    public Liga_ withTimeDonoId(long timeDonoId) {
        this.timeDonoId = timeDonoId;
        return this;
    }

    /**
     * 
     * @return
     *     The clubeId
     */
    @JsonProperty("clube_id")
    public Object getClubeId() {
        return clubeId;
    }

    /**
     * 
     * @param clubeId
     *     The clube_id
     */
    @JsonProperty("clube_id")
    public void setClubeId(Object clubeId) {
        this.clubeId = clubeId;
    }

    public Liga_ withClubeId(Object clubeId) {
        this.clubeId = clubeId;
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

    public Liga_ withNome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * 
     * @return
     *     The descricao
     */
    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    /**
     * 
     * @param descricao
     *     The descricao
     */
    @JsonProperty("descricao")
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Liga_ withDescricao(String descricao) {
        this.descricao = descricao;
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

    public Liga_ withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * 
     * @return
     *     The tipo
     */
    @JsonProperty("tipo")
    public String getTipo() {
        return tipo;
    }

    /**
     * 
     * @param tipo
     *     The tipo
     */
    @JsonProperty("tipo")
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Liga_ withTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * 
     * @return
     *     The tipoFlamula
     */
    @JsonProperty("tipo_flamula")
    public long getTipoFlamula() {
        return tipoFlamula;
    }

    /**
     * 
     * @param tipoFlamula
     *     The tipo_flamula
     */
    @JsonProperty("tipo_flamula")
    public void setTipoFlamula(long tipoFlamula) {
        this.tipoFlamula = tipoFlamula;
    }

    public Liga_ withTipoFlamula(long tipoFlamula) {
        this.tipoFlamula = tipoFlamula;
        return this;
    }

    /**
     * 
     * @return
     *     The tipoEstampaFlamula
     */
    @JsonProperty("tipo_estampa_flamula")
    public long getTipoEstampaFlamula() {
        return tipoEstampaFlamula;
    }

    /**
     * 
     * @param tipoEstampaFlamula
     *     The tipo_estampa_flamula
     */
    @JsonProperty("tipo_estampa_flamula")
    public void setTipoEstampaFlamula(long tipoEstampaFlamula) {
        this.tipoEstampaFlamula = tipoEstampaFlamula;
    }

    public Liga_ withTipoEstampaFlamula(long tipoEstampaFlamula) {
        this.tipoEstampaFlamula = tipoEstampaFlamula;
        return this;
    }

    /**
     * 
     * @return
     *     The tipoAdornoFlamula
     */
    @JsonProperty("tipo_adorno_flamula")
    public long getTipoAdornoFlamula() {
        return tipoAdornoFlamula;
    }

    /**
     * 
     * @param tipoAdornoFlamula
     *     The tipo_adorno_flamula
     */
    @JsonProperty("tipo_adorno_flamula")
    public void setTipoAdornoFlamula(long tipoAdornoFlamula) {
        this.tipoAdornoFlamula = tipoAdornoFlamula;
    }

    public Liga_ withTipoAdornoFlamula(long tipoAdornoFlamula) {
        this.tipoAdornoFlamula = tipoAdornoFlamula;
        return this;
    }

    /**
     * 
     * @return
     *     The corPrimariaEstampaFlamula
     */
    @JsonProperty("cor_primaria_estampa_flamula")
    public String getCorPrimariaEstampaFlamula() {
        return corPrimariaEstampaFlamula;
    }

    /**
     * 
     * @param corPrimariaEstampaFlamula
     *     The cor_primaria_estampa_flamula
     */
    @JsonProperty("cor_primaria_estampa_flamula")
    public void setCorPrimariaEstampaFlamula(String corPrimariaEstampaFlamula) {
        this.corPrimariaEstampaFlamula = corPrimariaEstampaFlamula;
    }

    public Liga_ withCorPrimariaEstampaFlamula(String corPrimariaEstampaFlamula) {
        this.corPrimariaEstampaFlamula = corPrimariaEstampaFlamula;
        return this;
    }

    /**
     * 
     * @return
     *     The corSecundariaEstampaFlamula
     */
    @JsonProperty("cor_secundaria_estampa_flamula")
    public String getCorSecundariaEstampaFlamula() {
        return corSecundariaEstampaFlamula;
    }

    /**
     * 
     * @param corSecundariaEstampaFlamula
     *     The cor_secundaria_estampa_flamula
     */
    @JsonProperty("cor_secundaria_estampa_flamula")
    public void setCorSecundariaEstampaFlamula(String corSecundariaEstampaFlamula) {
        this.corSecundariaEstampaFlamula = corSecundariaEstampaFlamula;
    }

    public Liga_ withCorSecundariaEstampaFlamula(String corSecundariaEstampaFlamula) {
        this.corSecundariaEstampaFlamula = corSecundariaEstampaFlamula;
        return this;
    }

    /**
     * 
     * @return
     *     The corBordaFlamula
     */
    @JsonProperty("cor_borda_flamula")
    public String getCorBordaFlamula() {
        return corBordaFlamula;
    }

    /**
     * 
     * @param corBordaFlamula
     *     The cor_borda_flamula
     */
    @JsonProperty("cor_borda_flamula")
    public void setCorBordaFlamula(String corBordaFlamula) {
        this.corBordaFlamula = corBordaFlamula;
    }

    public Liga_ withCorBordaFlamula(String corBordaFlamula) {
        this.corBordaFlamula = corBordaFlamula;
        return this;
    }

    /**
     * 
     * @return
     *     The corFundoFlamula
     */
    @JsonProperty("cor_fundo_flamula")
    public String getCorFundoFlamula() {
        return corFundoFlamula;
    }

    /**
     * 
     * @param corFundoFlamula
     *     The cor_fundo_flamula
     */
    @JsonProperty("cor_fundo_flamula")
    public void setCorFundoFlamula(String corFundoFlamula) {
        this.corFundoFlamula = corFundoFlamula;
    }

    public Liga_ withCorFundoFlamula(String corFundoFlamula) {
        this.corFundoFlamula = corFundoFlamula;
        return this;
    }

    /**
     * 
     * @return
     *     The urlFlamulaSvg
     */
    @JsonProperty("url_flamula_svg")
    public String getUrlFlamulaSvg() {
        return urlFlamulaSvg;
    }

    /**
     * 
     * @param urlFlamulaSvg
     *     The url_flamula_svg
     */
    @JsonProperty("url_flamula_svg")
    public void setUrlFlamulaSvg(String urlFlamulaSvg) {
        this.urlFlamulaSvg = urlFlamulaSvg;
    }

    public Liga_ withUrlFlamulaSvg(String urlFlamulaSvg) {
        this.urlFlamulaSvg = urlFlamulaSvg;
        return this;
    }

    /**
     * 
     * @return
     *     The urlFlamulaPng
     */
    @JsonProperty("url_flamula_png")
    public String getUrlFlamulaPng() {
        return urlFlamulaPng;
    }

    /**
     * 
     * @param urlFlamulaPng
     *     The url_flamula_png
     */
    @JsonProperty("url_flamula_png")
    public void setUrlFlamulaPng(String urlFlamulaPng) {
        this.urlFlamulaPng = urlFlamulaPng;
    }

    public Liga_ withUrlFlamulaPng(String urlFlamulaPng) {
        this.urlFlamulaPng = urlFlamulaPng;
        return this;
    }

    /**
     * 
     * @return
     *     The tipoTrofeu
     */
    @JsonProperty("tipo_trofeu")
    public Object getTipoTrofeu() {
        return tipoTrofeu;
    }

    /**
     * 
     * @param tipoTrofeu
     *     The tipo_trofeu
     */
    @JsonProperty("tipo_trofeu")
    public void setTipoTrofeu(Object tipoTrofeu) {
        this.tipoTrofeu = tipoTrofeu;
    }

    public Liga_ withTipoTrofeu(Object tipoTrofeu) {
        this.tipoTrofeu = tipoTrofeu;
        return this;
    }

    /**
     * 
     * @return
     *     The corTrofeu
     */
    @JsonProperty("cor_trofeu")
    public Object getCorTrofeu() {
        return corTrofeu;
    }

    /**
     * 
     * @param corTrofeu
     *     The cor_trofeu
     */
    @JsonProperty("cor_trofeu")
    public void setCorTrofeu(Object corTrofeu) {
        this.corTrofeu = corTrofeu;
    }

    public Liga_ withCorTrofeu(Object corTrofeu) {
        this.corTrofeu = corTrofeu;
        return this;
    }

    /**
     * 
     * @return
     *     The urlTrofeuSvg
     */
    @JsonProperty("url_trofeu_svg")
    public Object getUrlTrofeuSvg() {
        return urlTrofeuSvg;
    }

    /**
     * 
     * @param urlTrofeuSvg
     *     The url_trofeu_svg
     */
    @JsonProperty("url_trofeu_svg")
    public void setUrlTrofeuSvg(Object urlTrofeuSvg) {
        this.urlTrofeuSvg = urlTrofeuSvg;
    }

    public Liga_ withUrlTrofeuSvg(Object urlTrofeuSvg) {
        this.urlTrofeuSvg = urlTrofeuSvg;
        return this;
    }

    /**
     * 
     * @return
     *     The urlTrofeuPng
     */
    @JsonProperty("url_trofeu_png")
    public Object getUrlTrofeuPng() {
        return urlTrofeuPng;
    }

    /**
     * 
     * @param urlTrofeuPng
     *     The url_trofeu_png
     */
    @JsonProperty("url_trofeu_png")
    public void setUrlTrofeuPng(Object urlTrofeuPng) {
        this.urlTrofeuPng = urlTrofeuPng;
    }

    public Liga_ withUrlTrofeuPng(Object urlTrofeuPng) {
        this.urlTrofeuPng = urlTrofeuPng;
        return this;
    }

    /**
     * 
     * @return
     *     The editorial
     */
    @JsonProperty("editorial")
    public boolean isEditorial() {
        return editorial;
    }

    /**
     * 
     * @param editorial
     *     The editorial
     */
    @JsonProperty("editorial")
    public void setEditorial(boolean editorial) {
        this.editorial = editorial;
    }

    public Liga_ withEditorial(boolean editorial) {
        this.editorial = editorial;
        return this;
    }

    /**
     * 
     * @return
     *     The patrocinador
     */
    @JsonProperty("patrocinador")
    public boolean isPatrocinador() {
        return patrocinador;
    }

    /**
     * 
     * @param patrocinador
     *     The patrocinador
     */
    @JsonProperty("patrocinador")
    public void setPatrocinador(boolean patrocinador) {
        this.patrocinador = patrocinador;
    }

    public Liga_ withPatrocinador(boolean patrocinador) {
        this.patrocinador = patrocinador;
        return this;
    }

    /**
     * 
     * @return
     *     The mataMata
     */
    @JsonProperty("mata_mata")
    public boolean isMataMata() {
        return mataMata;
    }

    /**
     * 
     * @param mataMata
     *     The mata_mata
     */
    @JsonProperty("mata_mata")
    public void setMataMata(boolean mataMata) {
        this.mataMata = mataMata;
    }

    public Liga_ withMataMata(boolean mataMata) {
        this.mataMata = mataMata;
        return this;
    }

    /**
     * 
     * @return
     *     The inicioRodada
     */
    @JsonProperty("inicio_rodada")
    public Object getInicioRodada() {
        return inicioRodada;
    }

    /**
     * 
     * @param inicioRodada
     *     The inicio_rodada
     */
    @JsonProperty("inicio_rodada")
    public void setInicioRodada(Object inicioRodada) {
        this.inicioRodada = inicioRodada;
    }

    public Liga_ withInicioRodada(Object inicioRodada) {
        this.inicioRodada = inicioRodada;
        return this;
    }

    /**
     * 
     * @return
     *     The fimRodada
     */
    @JsonProperty("fim_rodada")
    public Object getFimRodada() {
        return fimRodada;
    }

    /**
     * 
     * @param fimRodada
     *     The fim_rodada
     */
    @JsonProperty("fim_rodada")
    public void setFimRodada(Object fimRodada) {
        this.fimRodada = fimRodada;
    }

    public Liga_ withFimRodada(Object fimRodada) {
        this.fimRodada = fimRodada;
        return this;
    }

    /**
     * 
     * @return
     *     The quantidadeTimes
     */
    @JsonProperty("quantidade_times")
    public long getQuantidadeTimes() {
        return quantidadeTimes;
    }

    /**
     * 
     * @param quantidadeTimes
     *     The quantidade_times
     */
    @JsonProperty("quantidade_times")
    public void setQuantidadeTimes(long quantidadeTimes) {
        this.quantidadeTimes = quantidadeTimes;
    }

    public Liga_ withQuantidadeTimes(long quantidadeTimes) {
        this.quantidadeTimes = quantidadeTimes;
        return this;
    }

    /**
     * 
     * @return
     *     The sorteada
     */
    @JsonProperty("sorteada")
    public boolean isSorteada() {
        return sorteada;
    }

    /**
     * 
     * @param sorteada
     *     The sorteada
     */
    @JsonProperty("sorteada")
    public void setSorteada(boolean sorteada) {
        this.sorteada = sorteada;
    }

    public Liga_ withSorteada(boolean sorteada) {
        this.sorteada = sorteada;
        return this;
    }

    /**
     * 
     * @return
     *     The mesRankingNum
     */
    @JsonProperty("mes_ranking_num")
    public Object getMesRankingNum() {
        return mesRankingNum;
    }

    /**
     * 
     * @param mesRankingNum
     *     The mes_ranking_num
     */
    @JsonProperty("mes_ranking_num")
    public void setMesRankingNum(Object mesRankingNum) {
        this.mesRankingNum = mesRankingNum;
    }

    public Liga_ withMesRankingNum(Object mesRankingNum) {
        this.mesRankingNum = mesRankingNum;
        return this;
    }

    /**
     * 
     * @return
     *     The mesVariacaoNum
     */
    @JsonProperty("mes_variacao_num")
    public Object getMesVariacaoNum() {
        return mesVariacaoNum;
    }

    /**
     * 
     * @param mesVariacaoNum
     *     The mes_variacao_num
     */
    @JsonProperty("mes_variacao_num")
    public void setMesVariacaoNum(Object mesVariacaoNum) {
        this.mesVariacaoNum = mesVariacaoNum;
    }

    public Liga_ withMesVariacaoNum(Object mesVariacaoNum) {
        this.mesVariacaoNum = mesVariacaoNum;
        return this;
    }

    /**
     * 
     * @return
     *     The imagem
     */
    @JsonProperty("imagem")
    public String getImagem() {
        return imagem;
    }

    /**
     * 
     * @param imagem
     *     The imagem
     */
    @JsonProperty("imagem")
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Liga_ withImagem(String imagem) {
        this.imagem = imagem;
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

    public Liga_ withAmigos(Object amigos) {
        this.amigos = amigos;
        return this;
    }

    /**
     * 
     * @return
     *     The totalAmigosNaLiga
     */
    @JsonProperty("total_amigos_na_liga")
    public long getTotalAmigosNaLiga() {
        return totalAmigosNaLiga;
    }

    /**
     * 
     * @param totalAmigosNaLiga
     *     The total_amigos_na_liga
     */
    @JsonProperty("total_amigos_na_liga")
    public void setTotalAmigosNaLiga(long totalAmigosNaLiga) {
        this.totalAmigosNaLiga = totalAmigosNaLiga;
    }

    public Liga_ withTotalAmigosNaLiga(long totalAmigosNaLiga) {
        this.totalAmigosNaLiga = totalAmigosNaLiga;
        return this;
    }

    /**
     * 
     * @return
     *     The totalTimesLiga
     */
    @JsonProperty("total_times_liga")
    public long getTotalTimesLiga() {
        return totalTimesLiga;
    }

    /**
     * 
     * @param totalTimesLiga
     *     The total_times_liga
     */
    @JsonProperty("total_times_liga")
    public void setTotalTimesLiga(long totalTimesLiga) {
        this.totalTimesLiga = totalTimesLiga;
    }

    public Liga_ withTotalTimesLiga(long totalTimesLiga) {
        this.totalTimesLiga = totalTimesLiga;
        return this;
    }

    /**
     * 
     * @return
     *     The infoEditorial
     */
    @JsonProperty("info_editorial")
    public InfoEditorial getInfoEditorial() {
        return infoEditorial;
    }

    /**
     * 
     * @param infoEditorial
     *     The info_editorial
     */
    @JsonProperty("info_editorial")
    public void setInfoEditorial(InfoEditorial infoEditorial) {
        this.infoEditorial = infoEditorial;
    }

    public Liga_ withInfoEditorial(InfoEditorial infoEditorial) {
        this.infoEditorial = infoEditorial;
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

    public Liga_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
