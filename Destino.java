public class Destino {
  private String cidadeOrigem;
  private String cidadeDestino;
  private boolean ida;
  private boolean idaVolta;

  public Destino(String cidadeOrigem, String cidadeDestino, boolean ida, boolean idaVolta) {
      this.cidadeOrigem = cidadeOrigem;
      this.cidadeDestino = cidadeDestino;
      this.ida = ida;
      this.idaVolta = idaVolta;
  }

  public String getCidadeOrigem() {
      return cidadeOrigem;
  }

  public String getCidadeDestino() {
      return cidadeDestino;
  }

  public boolean isIda() {
      return ida;
  }

  public boolean isIdaVolta() {
      return idaVolta;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Origem: ").append(cidadeOrigem).append("\n");
      sb.append("Destino: ").append(cidadeDestino).append("\n");
      sb.append("Tipo de Passagem: ").append(ida ? "Ida" : "").append(idaVolta ? " + Volta" : "").append("\n");
      return sb.toString();
  }
}
