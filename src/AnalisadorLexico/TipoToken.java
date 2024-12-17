package AnalisadorLexico;

public enum TipoToken {
    PALAVRA_CHAVE,   // Ex: while, return
    ABRE_PAREN,
    FECHA_PAREN,
    LOGICO,          // Ex: and, or
    CONDICIONAIS,    // Ex: if, else
    IDENTIFICADOR,   // Ex: variáveis e nomes de funções
    NUMERO,          // Ex: 123, 456
    OPERADOR,        // Ex: +, -, *, /
    DELIMITADOR,     // Ex: , ;
    ABRE_CHA,        // Ex: “
    FECHA_CHA,       // Ex: ”
    DESCONHECIDO     // Qnualquer token que ão é reconhecido
}