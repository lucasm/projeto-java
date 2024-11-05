import java.text.SimpleDateFormat;
import java.util.Date;

// Enum para Permissões de Usuário
enum PermissaoUsuario {
  ADMINISTRADOR, CLIENTE
}

// Classe Usuário
public class Usuario {
  private String nome;
  private String email;
  private String telefone;
  private String cpf;
  private Date dataNascimento;
  private PermissaoUsuario permissao;

  public Usuario(String nome, String email, String telefone, String cpf, Date dataNascimento, PermissaoUsuario permissao) {
      this.nome = nome;
      this.email = email;
      this.telefone = telefone;
      this.cpf = cpf;
      this.dataNascimento = dataNascimento;
      this.permissao = permissao;
  }

  public PermissaoUsuario getPermissao() {
      return permissao;
  }

  // Método para retornar os detalhes do usuário como uma String formatada
    public String getDetalhes() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "#### DETALHES USUÁRIO " + "\n" +
                "Nome: " + nome + "\n" +
               "E-mail: " + email + "\n" +
               "Telefone: " + telefone + "\n" +
               "CPF: " + cpf + "\n" +
               "Data de Nascimento: " + dateFormat.format(dataNascimento) + "\n" +
               "Permissão: " + permissao + "\n\n";
    }
}