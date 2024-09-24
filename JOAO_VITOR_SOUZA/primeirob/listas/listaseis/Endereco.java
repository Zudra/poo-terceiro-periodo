package JOAO_VITOR_SOUZA.primeirob.listas.listaseis;

public class Endereco {
        
        private String estado;
        private String cidade;
        private String bairro;
        private String numero;
        private String complemento;
    
        
        public Endereco(String estado, String cidade, String bairro, String numero, String complemento) {
            this.estado = estado;
            this.cidade = cidade;
            this.bairro = bairro;
            this.numero = numero;
            this.complemento = complemento;
        }
    
        
        public String apresentarLogradouro() {
            return "Endereço: " + numero + ", " + bairro + ", " + cidade + ", " + estado + 
                   (complemento != null && !complemento.isEmpty() ? ", " + complemento : "");
        }
}
