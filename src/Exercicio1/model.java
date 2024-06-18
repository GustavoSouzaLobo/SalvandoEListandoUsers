package Exercicio1;

public class model {
    public static class Usuario {
        private String nome;
        private String email;
        private String senha;
        private boolean moderador;

        public Usuario(){

        }

        public Usuario(String nome, String email, String senha, boolean moderador) {
            this.nome = nome;
            this.email = email;
            this.senha = senha;
            this.moderador = moderador;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        public boolean isModerador() {
            return moderador;
        }

        public void setModerador(boolean moderador) {
            this.moderador = moderador;
        }
    }
}
