package modelo;

public class Serie extends Title {
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionPorEpisodio;

    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duracionPorEpisodio * episodiosPorTemporada * temporadas;
    }

    public int getTemporada() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionPorEpisodio() {
        return duracionPorEpisodio;
    }

    public void setDuracionPorEpisodio(int duracionPorEpisodio) {
        this.duracionPorEpisodio = duracionPorEpisodio;
    }
}